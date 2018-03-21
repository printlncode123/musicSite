package cn.music.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.music.mapper.queryCustomVoMapper;
import cn.music.po.QueryCustomVo;
import cn.music.service.SearchService;
@Service
public class SearchServiceImpl implements SearchService{
	@Autowired
	private queryCustomVoMapper qcvm;
	
	@Override
	public QueryCustomVo getInfo(String key) {
		QueryCustomVo info = qcvm.getInfo(key);
		return info;
	}

}
