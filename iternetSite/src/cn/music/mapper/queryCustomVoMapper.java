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
	//�Ƽ��赥
	List<Song> getSongLimit();
	//����ѯ(���֣�����)
	QueryCustomVo getInfo(String key);
	//���ݸ���id��ȡ���ֵĸ�����Ϣ
	QueryCustomVo getSingerSongMore(int id);
	//���¸�����Ϣ
	void updateSinger(Singer singer);
	//������ҳ�����Ÿ���
	List<Singer> getHot();
	//���ݸ�������ȡ������Ϣ
	/*SingerOrCatagoryVo getSingerBySingerCid(int id);*/
	List<Singer> getSingerByCid(int scid);
	//�赥��ҳ��Ϣ(���и赥���Ĭ�ϵ�һ������µĸ赥�ڵ�һҳ��ʾĬ������)
	List<Songcatagory> getscm(int parentid);//���ݸ���id��ȡ�������
	List<Songmenu> getsmenuByCid(int smid,int start,int perCount);
	/*List<Page> getsmenuByCid(int smid,int start,int perCount);*/
	//��ȡĳ���赥���ܼ�¼��
	public int getCountByScid(int scid);
	//��ȡĳ�赥�¸���������������songmenuId��
	public int countSong(int smid);
	//�����û�id�͸赥id��ȡ����id�Ӷ���ȡ������Ϣ
	public List<Song> getSongsByUSM(int uid,int smid);
	//���¸赥��Ϣ
	public void updateSongmenu(Songmenu sm);
	//��פ����(�Ƽ�ҳ)
	//��ͬ������Ÿ���(�Ƽ�ҳ)
}
