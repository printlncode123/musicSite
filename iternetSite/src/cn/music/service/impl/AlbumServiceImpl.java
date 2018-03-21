package cn.music.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.music.mapper.AlbumMapper;
import cn.music.po.Album;
import cn.music.po.AlbumExample;
import cn.music.po.AlbumExample.Criteria;
import cn.music.service.AlbumService;
@Service
public class AlbumServiceImpl implements AlbumService{
    @Autowired
    private AlbumMapper am;
    //���ݸ���id��ȡר��
	@Override
	public List<Album> getBySingerId(int sid) {
		AlbumExample example=new AlbumExample();
		Criteria criteria = example.createCriteria();
	    criteria.andSingerIdEqualTo(sid);
		List<Album> as = am.selectByExample(example);
		return as;
	}
	//����ר��id��ȡר��
	@Override
	public Album getByAlbumId(int id) {
		Album album = am.selectByPrimaryKey(id);
		return album;
	}

}
