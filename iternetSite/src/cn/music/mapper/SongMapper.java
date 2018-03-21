package cn.music.mapper;

import cn.music.po.Song;
import cn.music.po.SongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongMapper {
    int countByExample(SongExample example);

    int deleteByExample(SongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Song record);

    int insertSelective(Song record);

    List<Song> selectByExampleWithBLOBs(SongExample example);

    List<Song> selectByExample(SongExample example);

    Song selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Song record, @Param("example") SongExample example);

    int updateByExampleWithBLOBs(@Param("record") Song record, @Param("example") SongExample example);

    int updateByExample(@Param("record") Song record, @Param("example") SongExample example);

    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKeyWithBLOBs(Song record);

    int updateByPrimaryKey(Song record);
}