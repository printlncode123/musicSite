package cn.music.utils.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.music.po.Songcatagory;
import cn.music.po.Songmenu;

public class SongOrCatVo implements Serializable{
	private Songcatagory songcatagory;
	private List<Songcatagory> children=new ArrayList<Songcatagory>();
	private List<Songmenu> songmenus=new ArrayList<Songmenu>();
	public Songcatagory getSongcatagory() {
		return songcatagory;
	}
	public void setSongcatagory(Songcatagory songcatagory) {
		this.songcatagory = songcatagory;
	}
	public List<Songcatagory> getChildren() {
		return children;
	}
	public void setChildren(List<Songcatagory> children) {
		this.children = children;
	}
	
	public List<Songmenu> getSongmenus() {
		return songmenus;
	}
	
	public void setSongmenus(List<Songmenu> songmenus) {
		this.songmenus = songmenus;
	}
	
}
