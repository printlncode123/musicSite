package cn.music.service.impl;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.music.mapper.SongMapper;
import cn.music.mapper.SongcatagoryMapper;
import cn.music.mapper.SongmenuMapper;
import cn.music.mapper.UserSongMapper;
import cn.music.mapper.queryCustomVoMapper;
import cn.music.po.QueryCustomVo;
import cn.music.po.Song;
import cn.music.po.SongExample;
import cn.music.po.SongExample.Criteria;
import cn.music.po.Songcatagory;
import cn.music.po.SongcatagoryExample;
import cn.music.po.Songmenu;
import cn.music.po.SongmenuExample;
import cn.music.po.UserSong;
import cn.music.service.SongService;
@Service
public class SongServiceImpl implements SongService{
	@Autowired
	private queryCustomVoMapper qcvm;
	@Autowired
	private SongMapper sm;
	@Autowired
	private SongcatagoryMapper scmapper;
	@Autowired
	private SongmenuMapper smmapper;
	@Autowired
	private UserSongMapper usm;
	SongExample example=new SongExample();
	SongcatagoryExample scatexample=new SongcatagoryExample();
	Criteria criteria = example.createCriteria();
	@Override
	public List<Song> getSongsLimit() {
		List<Song> songLimit = qcvm.getSongLimit();
		return songLimit;
	}
	@Override
	public QueryCustomVo getInfo(String key) {
		return qcvm.getInfo(key);
	}
	@Override
	public List<Song> getBySingerId(int sid) {
	    criteria.andSingerIdEqualTo(sid);
		List<Song> songs = sm.selectByExample(example);
		return songs;
	}
	@Override
	public Song getById(int id) {
		Song song = sm.selectByPrimaryKey(id);
		return song;
	}
	
	/*@Override
	public List<Songcatagory> getsongcs() {
		List<Songcatagory> scs = scmapper.selectByExample(scatexample);
		return scs;
	}*/
	/*@Override
	public List<Songcatagory> getsongcsByPid(int parentid) {
		cn.music.po.SongcatagoryExample.Criteria criteria = scatexample.createCriteria();
		criteria.andParentidEqualTo(parentid);
		List<Songcatagory> scs = scmapper.selectByExample(scatexample);
		return scs;
	}*/
	//获取歌单首页信息
	@Override
	public List<Songcatagory> getscm(int parentid) {
		List<Songcatagory> getscm = qcvm.getscm(parentid);
		return getscm;
	}
	/*@Override
	public List<Songmenu> getsmenuByCid(int smid) {
		SongmenuExample smexam=new SongmenuExample();
		cn.music.po.SongmenuExample.Criteria criteria = smexam.createCriteria();
		criteria.andSmidEqualTo(smid);
		List<Songmenu> songmenus = smmapper.selectByExample(smexam);
		return songmenus;
	}*/
	@Override
	public List<Songmenu> getsmenuByCid(int smid, int start, int perCount) {
		List<Songmenu> sms = qcvm.getsmenuByCid(smid, start, perCount);
		return sms;
	}
	@Override
	public int getCountByScid(int scid) {
		int count = qcvm.getCountByScid(scid);
		return count;
	}
	@Override
	public Songmenu getsmById(int id) {
		Songmenu sm = smmapper.selectByPrimaryKey(id);
		return sm;
	}
	@Override
	public List<Song> getByScid(int cid) {
		Criteria criteria = example.createCriteria();
		criteria.andSongCsidEqualTo(cid);
		List<Song> songs = sm.selectByExample(example);
		return songs;
	}
	SongmenuExample sme=new SongmenuExample();
	@Override
	public List<Songmenu> getSongMenus(int userid) {
		cn.music.po.SongmenuExample.Criteria criteria = sme.createCriteria();
		criteria.andUseridEqualTo(userid);
		List<Songmenu> sms = smmapper.selectByExample(sme);
		return sms;
	}
	@Override
	public int countSong(int smid) {
		int countSong = qcvm.countSong(smid);
		return countSong;
	}
	@Override
	public List<Song> getSongsUSM(int uid, int smid) {
		return qcvm.getSongsByUSM(uid, smid);
	}
	@Override
	public void addmenu(Songmenu sm) {
		smmapper.insertSelective(sm);
	}
	@Override
	public void addusersong(int uid, int smid) {
		UserSong record=new UserSong();
		record.setUid(uid);
		record.setSongmenuid(smid);
		usm.insertSelective(record);
	}
	
	@Override
	public void update(Songmenu songmenu) {
		qcvm.updateSongmenu(songmenu);
	}
	@Override
	public Songcatagory getsmByTag(String tagName) {
		cn.music.po.SongcatagoryExample.Criteria c = scatexample.createCriteria();
		c.andNameEqualTo(tagName);
		List<Songcatagory> scs = scmapper.selectByExample(scatexample);
		return scs.get(0);
	}
	
	
}
