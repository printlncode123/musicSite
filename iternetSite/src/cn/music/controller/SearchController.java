package cn.music.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.music.mapper.AlbumMapper;
import cn.music.mapper.SongMapper;
import cn.music.po.Album;
import cn.music.po.AlbumExample;
import cn.music.po.AlbumExample.Criteria;
import cn.music.po.QueryCustomVo;
import cn.music.po.Singer;
import cn.music.po.Song;
import cn.music.po.SongExample;
import cn.music.po.SongExtend;
import cn.music.service.AlbumService;
import cn.music.service.SearchService;
import cn.music.service.SongService;
@Controller
@RequestMapping("/search")
public class SearchController {
	@Autowired
	private SearchService searchService;
	@Autowired
	private SongService songService;
	@Autowired
	private AlbumService albumService;
	@RequestMapping("/singer")
	public ModelAndView search(String key,ModelAndView mav){
		 QueryCustomVo info = searchService.getInfo(key);
		 Singer infosinger = info.getSinger();
		 Song infosong = info.getSong();
		 mav.addObject("infoSinger", infosinger);
		 mav.addObject("infoSong", infosong);
		 if(infosinger!=null&&infosinger.getName().contains(key)){
			 List<Song> songList = songService.getBySingerId(infosinger.getId());
			 List<SongExtend> songExtends=new ArrayList<SongExtend>();
			 SongExtend se=null;
			 Album album=null;
			 for (Song song : songList) {
				se=new SongExtend();
				se.setSong(song);
				album = albumService.getByAlbumId(song.getAlbumId());
				se.setAlbumName(album.getName());
				songExtends.add(se);
			}
			 mav.addObject("infoSongList", songExtends);
			 mav.setViewName("page/searchSinger");
		 }
		 if(infosong!=null&&infosong.getPath().contains(key)){
			 mav.setViewName("page/searchSong");
		 }
		 return mav;
	}
}
