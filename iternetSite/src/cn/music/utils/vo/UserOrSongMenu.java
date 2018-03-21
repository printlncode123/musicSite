package cn.music.utils.vo;

import java.io.Serializable;

import cn.music.po.Songmenu;
import cn.music.po.User;

public class UserOrSongMenu implements Serializable{
	private User user;
	private Songmenu songmenu;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Songmenu getSongmenu() {
		return songmenu;
	}
	public void setSongmenu(Songmenu songmenu) {
		this.songmenu = songmenu;
	}
	
	
}
