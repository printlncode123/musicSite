package cn.music.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SingerCataCustomVo implements Serializable{
	List<Singercatagory> children=new ArrayList<Singercatagory>();
	Singercatagory sc;
	public List<Singercatagory> getChildren() {
		return children;
	}
	public void setChildren(List<Singercatagory> children) {
		this.children = children;
	}
	public Singercatagory getSc() {
		return sc;
	}
	public void setSc(Singercatagory sc) {
		this.sc = sc;
	}
	
}
