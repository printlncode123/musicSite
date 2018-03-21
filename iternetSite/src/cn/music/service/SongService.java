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
	//��ȡ���и��������(�赥���)
	/*public List<Songcatagory> getsongcs();*/
	//���ݸ���id����������
	/*public List<Songcatagory> getsongcsByPid(int parentid);*/
	//��ȥ�赥��ҳ��Ϣ
	public List<Songcatagory> getscm(int parentid);//���ݸ���id�����и����������
	public List<Songmenu> getsmenuByCid(int smid,int start,int perCount);//���ݸ���(�赥)����ȡ�赥
	//��ȡĳ���赥���ܼ�¼��
	public int getCountByScid(int scid);
	//���ݸ赥id��ȡָ���ĸ赥����
	public Songmenu getsmById(int id);
	//���ݸ�������ȡ����
	public List<Song> getByScid(int cid);
	//�����û�id��ȡ�赥
	public List<Songmenu> getSongMenus(int userid);
	//���ݸ赥id��ȡ���¸�������
	public int countSong(int smid);
	//�����û�id�͸赥id��ȡ������Ϣ
	public List<Song> getSongsUSM(int uid,int smid);
	//�����赥
	public void addmenu(Songmenu sm);
	public void addusersong(int uid,int smid);
	//���¸赥��Ϣ
	public void update(Songmenu songmenu);
	//���ݱ�ǩ����ȡ�赥�����Ϣ
	public Songcatagory getsmByTag(String  tagName);
	}
