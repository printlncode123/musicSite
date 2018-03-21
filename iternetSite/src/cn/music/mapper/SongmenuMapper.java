package cn.music.mapper;

import cn.music.po.Songmenu;
import cn.music.po.SongmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongmenuMapper {
    int countByExample(SongmenuExample example);

    int deleteByExample(SongmenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Songmenu record);

    int insertSelective(Songmenu record);

    List<Songmenu> selectByExample(SongmenuExample example);

    Songmenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Songmenu record, @Param("example") SongmenuExample example);

    int updateByExample(@Param("record") Songmenu record, @Param("example") SongmenuExample example);

    int updateByPrimaryKeySelective(Songmenu record);

    int updateByPrimaryKey(Songmenu record);
}