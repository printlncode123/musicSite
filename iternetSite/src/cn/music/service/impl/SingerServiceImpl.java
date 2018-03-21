package cn.music.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.music.mapper.SingerMapper;
import cn.music.mapper.SingercatagoryMapper;
import cn.music.mapper.queryCustomVoMapper;
import cn.music.po.QueryCustomVo;
import cn.music.po.Singer;
import cn.music.po.SingerExample;
import cn.music.po.Singercatagory;
import cn.music.po.SingercatagoryExample;
import cn.music.po.SingercatagoryExample.Criteria;
import cn.music.service.SingerService;
import cn.music.utils.vo.SingerOrCatagoryVo;
@Service
public class SingerServiceImpl implements SingerService{
	@Autowired
	private SingerMapper singerMapper;
	@Autowired
	private queryCustomVoMapper qcvm;
	@Autowired
	private SingercatagoryMapper scm;
	SingerExample se=new SingerExample();
	
	@Override
	public QueryCustomVo getSingerSongMoreById(int id) {
		QueryCustomVo singerSongMore = qcvm.getSingerSongMore(id);
		return singerSongMore;
	}
	@Override
	public Singer getById(int id) {
		Singer singer = singerMapper.selectByPrimaryKey(id);
		return singer;
	}
	@Override
	public List<Singercatagory> singercatagories(int parentId) {
		SingercatagoryExample example=new SingercatagoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentidEqualTo(parentId);
		List<Singercatagory> singercatagories = scm.selectByExample(example);
		return singercatagories;
	}
	cn.music.po.SingerExample.Criteria c = se.createCriteria();
	@Override
	public List<Singer> getNewBySingerCata(int newscid) {
		c.andSingercidEqualTo(newscid);
		List<Singer> sbynewids = singerMapper.selectByExample(se);
		return sbynewids;
	}
	@Override
	public void updateSinger(Singer singer) {
		qcvm.updateSinger(singer);
	}
	@Override
	public List<Singer> getHot() {
		List<Singer> hot = qcvm.getHot();
		return hot;
	}
	/*@Override
	public SingerOrCatagoryVo getSingerBySingerCid(int id) {
		SingerOrCatagoryVo singerBySingerCid = qcvm.getSingerBySingerCid(id);
		return singerBySingerCid;
	}*/
	@Override
	public Singercatagory getSingerCataByCid(int scid) {
	    Singercatagory sc = scm.selectByPrimaryKey(scid);
		return sc;
	}
	@Override
	public List<Singer> getSingerByCid(int scid) {
		/*c.andSingercidEqualTo(scid);
		List<Singer> singers = singerMapper.selectByExample(se);*/
		List<Singer> singers = qcvm.getSingerByCid(scid);
		return singers;
	}
}
