package cn.music.service;

import java.util.List;

import cn.music.po.QueryCustomVo;
import cn.music.po.Singer;
import cn.music.po.Singercatagory;
import cn.music.utils.vo.SingerOrCatagoryVo;

public interface SingerService {
	//根据歌手id查歌手
	public Singer getById(int id);
	//多表查
	public QueryCustomVo getSingerSongMoreById(int id);
	//查歌手类别
	public List<Singercatagory> singercatagories(int parentId);
	//获取新锐歌手(根据歌手类别)
	public List<Singer> getNewBySingerCata(int newscid);
	//更新歌手信息
	public void updateSinger(Singer singer);
	//获取歌手首页热门歌手信息
	public List<Singer> getHot();
	/*//根据歌手类别id获取相应歌手信息
	public SingerOrCatagoryVo getSingerBySingerCid(int id);*/
	//根据歌手类别id获取歌手类别信息
	public Singercatagory getSingerCataByCid(int scid);
	//根据歌手类别获取歌手信息
	public List<Singer> getSingerByCid(int scid);
 }
