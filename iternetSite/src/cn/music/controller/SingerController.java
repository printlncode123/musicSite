package cn.music.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import cn.music.po.Album;
import cn.music.po.QueryCustomVo;
import cn.music.po.Singer;
import cn.music.po.SingerCataCustomVo;
import cn.music.po.Singercatagory;
import cn.music.po.Song;
import cn.music.po.SongExtend;
import cn.music.po.User;
import cn.music.service.AlbumService;
import cn.music.service.SingerService;
import cn.music.service.SongService;
import cn.music.utils.CountThread;
import cn.music.utils.vo.SingerOrCatagoryVo;

@Controller
@RequestMapping("/singer")
public class SingerController {
	@Autowired
	private SingerService singerService;
	@Autowired
	private SongService songService;
	@Autowired
	private AlbumService albumService;
	CountThread ct=new CountThread();
	Map<Map<Object,Object>,Map<Object,Integer>> map=new HashMap<Map<Object,Object>,Map<Object,Integer>>();
	Map<Object,Object> su=new HashMap<Object,Object>();
	//根据用户id查指定歌手
	@RequestMapping("/sitro/{id}")
	public ModelAndView singerById(@PathVariable Integer id,HttpServletRequest request){
		User user = (User) request.getSession(false).getAttribute("user");
		Singer singer = singerService.getById(id);
		if (user!=null) {
			su.put(id, user.getId());
			if(map.get(su)==null){
				ct.setObj(id);//用歌手id来唯一标识区分
				Thread thread=new Thread(ct);
				thread.start();
				try {
					Thread.sleep(10000);
					map.put(su, ct.getVisitMap());
					singer.setVisitcount(ct.getVisitMap().get(id));
					singerService.updateSinger(singer);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		List<Song> songs = songService.getBySingerId(id);
		List<SongExtend> songExtends=new ArrayList<SongExtend>();
		 SongExtend se=null;
		 Album album=null;
		 for (Song song : songs) {
			se=new SongExtend();
			se.setSong(song);
			album = albumService.getByAlbumId(song.getAlbumId());
			se.setAlbumName(album.getName());
			songExtends.add(se);
		 }
		ModelAndView mav=new ModelAndView();
		mav.addObject("singer", singer);
		mav.addObject("songs", songExtends);
		mav.setViewName("page/singerIntroduct");
		return mav;
	}
	
	//跳转到歌手页
	@RequestMapping("/singerData")
	public String recommendSinger(HttpServletRequest hsr,Model model,@RequestParam(name="parentId",defaultValue="0") Integer parentid,
			@RequestParam(name="singerCid",defaultValue="7") Integer singercid){
		//歌手类别列表
		List<Singercatagory> singercatagories = singerService.singercatagories(parentid);
		//新锐歌手列表
		List<SingerCataCustomVo> sccvs=new ArrayList<SingerCataCustomVo>();
		SingerCataCustomVo sccv=null;
		for (Singercatagory sc : singercatagories) {
			sccv=new SingerCataCustomVo();
			sccv.setChildren(singerService.singercatagories(sc.getId()));
			sccv.setSc(sc);
			sccvs.add(sccv);
		}
		model.addAttribute("catagorys", sccvs);
		//新锐歌手
		List<Singer> newSingers = singerService.getNewBySingerCata(singercid);
		List<Singer> newSingersCopy=new ArrayList<Singer>(10);
		for(int i=0;i<10;i++){
			if (newSingers.get(i)!=null) {
				newSingersCopy.add(newSingers.get(i));
			}
		}
		model.addAttribute("newSingersLimit", newSingersCopy);
		//热门歌手
		List<Singer> hot = singerService.getHot();
		List<Singer> hotup=new ArrayList<Singer>(10);
		List<Singer> hotdown=new ArrayList<Singer>(60);
		for(int i=0;i<hot.size();i++){
			if (i<10) {
				hotup.add(hot.get(i));
			}else{
				hotdown.add(hot.get(i));
			}
		}
		model.addAttribute("hotupSingers", hotup);
		model.addAttribute("hotdownSingers", hotdown);
		return "page/singer";
	}

	@RequestMapping(value="/singerCid",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getSingerByCid(Integer sincatid){
		Singercatagory scByid = singerService.getSingerCataByCid(sincatid);
		SingerOrCatagoryVo soc=null;
		if(scByid!=null){
		List<Singer> singersByCid = singerService.getSingerByCid(sincatid);
		System.out.println(singersByCid);
		soc=new SingerOrCatagoryVo();
		soc.setSingercatagory(scByid);
		soc.setSinger(singersByCid);
		}
		String jsonString = JSON.toJSONString(soc);
		System.out.println(jsonString);
		return jsonString;
	}
	
	}
