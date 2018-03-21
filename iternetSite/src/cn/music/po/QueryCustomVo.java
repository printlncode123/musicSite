package cn.music.po;

import java.io.Serializable;

public class QueryCustomVo implements Serializable{
	private Singer singer;
	private Song song;
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
	
	
}
