package cn.music.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import cn.music.po.Album;
import cn.music.po.Singer;
import cn.music.po.Song;
import cn.music.po.Songcatagory;
import cn.music.po.Songmenu;
import cn.music.po.User;
import cn.music.service.AlbumService;
import cn.music.service.SingerService;
import cn.music.service.SongService;
import cn.music.service.UserService;
import cn.music.utils.vo.Page;
import cn.music.utils.vo.Singersongalbum;
import cn.music.utils.vo.SongOrCatVo;
import cn.music.utils.vo.SongOrSm;
import cn.music.utils.vo.UserOrSongMenu;

@Controller
public class SongController {
	@Autowired
	private SongService songService;
	@Autowired
	private AlbumService albumService;
	@Autowired
	private SingerService singerService;
	@Autowired
	private UserService userService;
	/*@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired
	private Destination topicDestination;*/
	@Value("${parentId}")
	private int parentId;
	@Value("${perCount}")
	private int perCount;
	@RequestMapping("/songDetail/{id}")
	public ModelAndView songDetailById(@PathVariable Integer id){
		System.out.println(id);
		Song song = songService.getById(id);
		Album album = albumService.getByAlbumId(song.getAlbumId());
		Singer singer = singerService.getById(song.getSingerId());
		ModelAndView mav=new ModelAndView();
		mav.addObject("song", song);
		mav.addObject("album", album);
		mav.addObject("singer", singer);
		mav.setViewName("page/songDetail");
		return mav;
	}
	
	//获取歌单首页的类别
	@RequestMapping("/songMenu/sm/{smid}/{start}")
	public String getSongCat(Model model,@PathVariable Integer smid,@PathVariable int start){
		List<Songcatagory> getscm = songService.getscm(parentId);
		List<SongOrCatVo> socs=new ArrayList<SongOrCatVo>();
		for (Songcatagory sc : getscm) {
			List<Songcatagory> children = songService.getscm(sc.getId());
			SongOrCatVo sOrCatVo=new SongOrCatVo();
			sOrCatVo.setSongcatagory(sc);
			sOrCatVo.setChildren(children);
			socs.add(sOrCatVo);
		}
		model.addAttribute("songcatmore", socs);
		int totalNum = songService.getCountByScid(smid);//某类别歌单的总记录数
		System.out.println(totalNum+":"+smid);
		Page page=new Page();
		page.setTotalNum(totalNum);
		page.setPerCount(perCount);
		page.setCurrentPage(start/perCount+1);
		int totalPage=page.getTotalPage();//某类别歌单的总页数
		System.out.println(totalPage);
		List<Songmenu> defaults = songService.getsmenuByCid(smid, start, perCount);//某类别歌单每页显示的内容
		List<UserOrSongMenu> usersongmenus=new ArrayList<UserOrSongMenu>();
		for (Songmenu songmenu : defaults) {
			UserOrSongMenu uos=new UserOrSongMenu();
			User findUserById = userService.findUserById(songmenu.getUserid());
			uos.setUser(findUserById);
			uos.setSongmenu(songmenu);
			usersongmenus.add(uos);
		}
		page.setList(usersongmenus);
		model.addAttribute("page", page);
		model.addAttribute("songmcid", smid);//当前歌单类别响应到页面以便当前类下分页查询
		return "page/songMenu";
	}

	//获取指定歌单的内容(歌单里的歌曲)
	@RequestMapping("/songMenuDetail/{id}")
	public String getSongMenuById(@PathVariable Integer id,Model model,HttpServletRequest request,HttpServletResponse response){
		Songmenu sm = songService.getsmById(id);
		User u = userService.findUserById(sm.getUserid());
		List<Song> songs = songService.getByScid(sm.getSmid());
		List<Singersongalbum> ssas=new ArrayList<Singersongalbum>();
		for (Song song : songs) {
			Singersongalbum ssa=new Singersongalbum();
			ssa.setSinger(singerService.getById(song.getSingerId()));//获取该歌曲歌手信息并封装到类中
			ssa.setAlbum(albumService.getByAlbumId(song.getAlbumId()));//获取该歌曲所属专辑并封装到类中
			ssa.setSong(song);
			ssas.add(ssa);
		}
		
		String menuCookie="";//cookie的值
		Cookie[] cookies = request.getCookies();
		List<Songmenu> historys=new ArrayList<Songmenu>();
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("menuCookie")){
					menuCookie=cookie.getValue();
					System.out.println("first"+menuCookie);
					String[] split=menuCookie.split(",");
					for (String mid : split) {
						try{
						Songmenu hissm = songService.getsmById(Integer.parseInt(mid));
						historys.add(hissm);
						System.out.println(mid);
						}catch (Exception e) {
							e.printStackTrace();
						}
					}
					LinkedList<String> hislist=new LinkedList<String>(Arrays.asList(split));
					String idStr = String.valueOf(id);
					if (hislist.contains(idStr)) {
						hislist.remove(idStr);
					}else{
						if (hislist.size()>=9) {
							hislist.removeLast();}
					}
					hislist.addFirst(idStr);
					StringBuffer sb=new StringBuffer();
					for (String listtoarr : hislist) {
						sb.append(listtoarr+",");
					}
					menuCookie=sb.deleteCharAt(sb.length()-1).toString();
				}
			}
		}else{
			menuCookie=id+"";
		}
		System.out.println("menucookie:"+menuCookie);
		Cookie cookie=new Cookie("menuCookie", menuCookie);//创建cookie
		cookie.setMaxAge(1*30*24*3600);//设置cookie有效期为1个月
		/*cookie.setMaxAge(0);//清除cookie
*/		cookie.setPath("/iternetSite");//cookie在应用服务器的哪个应用下有效，如果设置为"/"则对该应用服务器下所有应用有效
		response.addCookie(cookie);//将当前记录也保存到cookie
		model.addAttribute("sinsonal",ssas);
		model.addAttribute("userinfo",u);
		model.addAttribute("songMenuinfo",sm);
		model.addAttribute("historys",historys);
		return "page/songMenuDetail";
	}

	//下载歌曲
	@RequestMapping("/songMenu/download")
	public ResponseEntity<Byte[]> download(HttpServletRequest request,String filename,Model model) throws IOException{
		//下载文件的路径
		String rootPath = request.getServletContext().getRealPath("music");
		File file = new File(rootPath,filename);
		HttpHeaders headers=new HttpHeaders();
		filename=new String(filename.getBytes("UTF-8"),"ISO-8859-1");
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);//以二进制流的数据方式
		headers.setContentDispositionFormData("attachment",filename);//通知浏览器以attachment的方式打开文件
		return new ResponseEntity(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
	}
	//跳转我的音乐页
	@RequestMapping("/myMusic")
	public String my(){
		return "forward:/myMusic/myMusicData/0";
	}
	//我的音乐页响应数据(我创建的歌单，默认的歌单数据),当前用户和该用户创建的歌单的索引(userid/index)查
	@RequestMapping("/myMusic/myMusicData/{smindexByUid}")
	public String toMyMusic(Model model,HttpServletRequest request,@PathVariable Integer smindexByUid){
			//根据用户id获取该用户的歌单，默认第一个歌单的数据信息
		    User user = (User) request.getSession(false).getAttribute("user");
		    if(user!=null){
		    	List<Songmenu> songMenus = songService.getSongMenus(user.getId());
		    	if(songMenus!=null){
			    	for (Songmenu songmenu : songMenus) {
						int countSong = songService.countSong(songmenu.getId());
						songmenu.setSongcount(countSong);
			    	}
			    	Songmenu sm = songMenus.get(smindexByUid);//获取该用户指定索引的歌单
			    	if(sm==null){
			    		System.out.println("sm is null");
			    	}else{
		    		/*if(sm!=null){*/
				    	List<Song> songsUSM = songService.getSongsUSM(user.getId(),sm.getId());
						List<Singersongalbum> ssas=new ArrayList<Singersongalbum>();
						if(songsUSM!=null){
							for (Song song : songsUSM) {
								if(song!=null){
								song=songService.getById(song.getId());
								Album album = albumService.getByAlbumId(song.getAlbumId());
								Singer singer = singerService.getById(album.getSingerId());
								Singersongalbum ssa1=new Singersongalbum();
								ssa1.setAlbum(album);
								ssa1.setSinger(singer);
								ssa1.setSong(song);
								ssas.add(ssa1);
								System.out.println(album.getName()+":"+singer.getName());
								}else{
									System.out.println("song is null");
								}
							}
							SongOrSm sos1=new SongOrSm();
							sos1.setSongmenu(sm);
							sos1.setSinsonalb(ssas);
					    	model.addAttribute("songMenus",songMenus);//将该用户所有歌单显示
					    	model.addAttribute("songOrSm",sos1);//某指定歌单的歌曲，歌手 ，专辑信息
						}else{
							System.out.println("songsUSM is null");
						}
		    		}
		    	}else{
	    			System.out.println("songMenus is null");
	    		}
		    		//获取所有歌单子类别
		    		List<Songcatagory> getscm = songService.getscm(0);
		    		List<Songcatagory> children=new ArrayList<Songcatagory>();
		    		for (Songcatagory sc : getscm) {
		    			children = songService.getscm(sc.getId());//根据父类id获取子类别
		    		}
		    		model.addAttribute("menuCatagory", children);
			}
		    return "page/myMusic";
		}
	//创建歌单，跳到page/myMusic.jsp
	@RequestMapping("/myMusic/addmenu")
	public String addMenu(Songmenu sm,HttpServletRequest request,Integer menulen) throws InterruptedException{
		User user = (User) request.getSession(false).getAttribute("user");
		sm.setUserid(user.getId());
		sm.setMenucover("defaultMenuImg.jpg");
		Date date = new Date(System.currentTimeMillis());
		sm.setCreatetime(date);
		int menuIndex=menulen;
		songService.addmenu(sm);//添加信息到歌单表
		/*final Integer smid = sm.getId();
		final Integer uid = user.getId();
		jmsTemplate.send(topicDestination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage message = session.createTextMessage(uid+":"+smid);
				return message;
			}
		});
		System.out.println("smid"+sm.getId());*/
	/*	songService.addusersong(user.getId(),sm.getId());//添加信息到usersong
*/		return "forward:/myMusic/myMusicData/"+menuIndex;
	}
	
	//编辑歌单
	@RequestMapping("/myMusic/editmenu")
	public String editmenu(@RequestParam(value="file",required=false) MultipartFile file,HttpServletRequest request,Songmenu sm) throws IllegalStateException, IOException{
		/*String realPath = request.getSession().getServletContext().getRealPath("/upload");*/
		String realPath = request.getSession().getServletContext().getRealPath("/icon");
		String originalFilename = file.getOriginalFilename();
		File fileName=new File(realPath, originalFilename);
		if (!fileName.exists()) {
			fileName.mkdirs();
		}
		file.transferTo(fileName);
		//获取选中歌单类别id
		int smid = songService.getsmByTag(sm.getTag()).getId();
		sm.setSmid(smid);
		//设置上传的歌单封面
		sm.setMenucover(originalFilename);
		//设置更新时间
		sm.setUpdatetime(new Date(System.currentTimeMillis()));
		songService.update(sm);
		return "forward:/myMusic/myMusicData/0";
	}
}