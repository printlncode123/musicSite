package cn.music.utils.vo;

import java.util.List;

import cn.music.po.Song;
import cn.music.po.Songmenu;

public class SongOrSm {
	private Songmenu songmenu;
	private List<Song> songList;
	private List<Singersongalbum> sinsonalb;
	public Songmenu getSongmenu() {
		return songmenu;
	}
	public void setSongmenu(Songmenu songmenu) {
		this.songmenu = songmenu;
	}
	public List<Song> getSongList() {
		return songList;
	}
	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}
	public List<Singersongalbum> getSinsonalb() {
		return sinsonalb;
	}
	public void setSinsonalb(List<Singersongalbum> sinsonalb) {
		this.sinsonalb = sinsonalb;
	}
	
}
