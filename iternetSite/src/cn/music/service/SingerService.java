package cn.music.service;

import java.util.List;

import cn.music.po.QueryCustomVo;
import cn.music.po.Singer;
import cn.music.po.Singercatagory;
import cn.music.utils.vo.SingerOrCatagoryVo;

public interface SingerService {
	//���ݸ���id�����
	public Singer getById(int id);
	//����
	public QueryCustomVo getSingerSongMoreById(int id);
	//��������
	public List<Singercatagory> singercatagories(int parentId);
	//��ȡ�������(���ݸ������)
	public List<Singer> getNewBySingerCata(int newscid);
	//���¸�����Ϣ
	public void updateSinger(Singer singer);
	//��ȡ������ҳ���Ÿ�����Ϣ
	public List<Singer> getHot();
	/*//���ݸ������id��ȡ��Ӧ������Ϣ
	public SingerOrCatagoryVo getSingerBySingerCid(int id);*/
	//���ݸ������id��ȡ���������Ϣ
	public Singercatagory getSingerCataByCid(int scid);
	//���ݸ�������ȡ������Ϣ
	public List<Singer> getSingerByCid(int scid);
 }
