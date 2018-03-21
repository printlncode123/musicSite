package cn.music.service;

import java.util.List;

import cn.music.po.QueryCustomVo;
import cn.music.po.Song;
import cn.music.po.Songcatagory;
import cn.music.po.Songmenu;
import cn.music.utils.vo.SongOrCatVo;
public interface SongService {
	public List<Song> getSongsLimit();
	public QueryCustomVo getInfo(String key);
	public List<Song> getBySingerId(int sid);
	public Song getById(int id);
	//获取所有歌曲的类别(歌单类别)
	/*public List<Songcatagory> getsongcs();*/
	//根据父类id查所有子类
	/*public List<Songcatagory> getsongcsByPid(int parentid);*/
	//后去歌单首页信息
	public List<Songcatagory> getscm(int parentid);//根据父类id查所有歌曲类别子类
	public List<Songmenu> getsmenuByCid(int smid,int start,int perCount);//根据歌曲(歌单)类别获取歌单
	//获取某类别歌单的总记录数
	public int getCountByScid(int scid);
	//根据歌单id获取指定的歌单歌曲
	public Songmenu getsmById(int id);
	//根据歌曲类别获取歌曲
	public List<Song> getByScid(int cid);
	//根据用户id获取歌单
	public List<Songmenu> getSongMenus(int userid);
	//根据歌单id获取其下歌曲数量
	public int countSong(int smid);
	//根据用户id和歌单id获取歌曲信息
	public List<Song> getSongsUSM(int uid,int smid);
	//新增歌单
	public void addmenu(Songmenu sm);
	public void addusersong(int uid,int smid);
	//更新歌单信息
	public void update(Songmenu songmenu);
	//根据标签名获取歌单类别信息
	public Songcatagory getsmByTag(String  tagName);
	}
