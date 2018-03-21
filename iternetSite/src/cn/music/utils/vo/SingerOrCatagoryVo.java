package cn.music.utils.vo;

import java.io.Serializable;
import java.util.List;

import cn.music.po.Singer;
import cn.music.po.Singercatagory;

public class SingerOrCatagoryVo implements Serializable{
	private List<Singer> singer;
	private Singercatagory singercatagory;
	
	public List<Singer> getSinger() {
		return singer;
	}
	public void setSinger(List<Singer> singer) {
		this.singer = singer;
	}
	public Singercatagory getSingercatagory() {
		return singercatagory;
	}
	public void setSingercatagory(Singercatagory singercatagory) {
		this.singercatagory = singercatagory;
	}
	
	
}
