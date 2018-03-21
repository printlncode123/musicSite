package cn.music.utils.vo;

import cn.music.po.Album;
import cn.music.po.Singer;
import cn.music.po.Song;

public class Singersongalbum {
	private Singer singer;
	private Song song;
	private Album album;
	public Singer getSinger() {
		return singer;
	}
	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	
}
