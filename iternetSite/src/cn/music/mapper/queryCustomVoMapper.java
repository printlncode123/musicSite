package cn.music.mapper;

import java.util.List;

import cn.music.po.QueryCustomVo;
import cn.music.po.Singer;
import cn.music.po.Song;
import cn.music.po.Songcatagory;
import cn.music.po.Songmenu;
import cn.music.utils.vo.Page;
import cn.music.utils.vo.SingerOrCatagoryVo;
import cn.music.utils.vo.SongOrCatVo;

public interface queryCustomVoMapper {
	//推荐歌单
	List<Song> getSongLimit();
	//多表查询(歌手，歌曲)
	QueryCustomVo getInfo(String key);
	//根据歌手id获取歌手的歌曲信息
	QueryCustomVo getSingerSongMore(int id);
	//更新歌手信息
	void updateSinger(Singer singer);
	//歌手首页的热门歌手
	List<Singer> getHot();
	//根据歌手类别获取歌手信息
	/*SingerOrCatagoryVo getSingerBySingerCid(int id);*/
	List<Singer> getSingerByCid(int scid);
	//歌单首页信息(所有歌单类别，默认第一个类别下的歌单在第一页显示默认条数)
	List<Songcatagory> getscm(int parentid);//根据父类id获取歌曲类别
	List<Songmenu> getsmenuByCid(int smid,int start,int perCount);
	/*List<Page> getsmenuByCid(int smid,int start,int perCount);*/
	//获取某类别歌单的总记录数
	public int getCountByScid(int scid);
	//获取某歌单下歌曲的数量（根据songmenuId）
	public int countSong(int smid);
	//根据用户id和歌单id获取歌曲id从而获取歌曲信息
	public List<Song> getSongsByUSM(int uid,int smid);
	//更新歌单信息
	public void updateSongmenu(Songmenu sm);
	//入驻歌手(推荐页)
	//不同类别热门歌手(推荐页)
}
