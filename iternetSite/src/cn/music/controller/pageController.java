package cn.music.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.music.po.Singercatagory;
import cn.music.po.Song;
import cn.music.service.SongService;
@Controller
public class pageController {
	@Autowired
	private SongService songService;
	@RequestMapping("/")
	public String index(Model model){
		List<Song> songsLimit = songService.getSongsLimit();
		model.addAttribute("songList", songsLimit);
		return "forward:index";
	}
	
	@RequestMapping("/{page}")
	public String test(@PathVariable String page){
		return "page/"+page;
	}
	
}