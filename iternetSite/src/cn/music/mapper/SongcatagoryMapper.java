package cn.music.mapper;

import cn.music.po.Songcatagory;
import cn.music.po.SongcatagoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongcatagoryMapper {
    int countByExample(SongcatagoryExample example);

    int deleteByExample(SongcatagoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Songcatagory record);

    int insertSelective(Songcatagory record);

    List<Songcatagory> selectByExample(SongcatagoryExample example);

    Songcatagory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Songcatagory record, @Param("example") SongcatagoryExample example);

    int updateByExample(@Param("record") Songcatagory record, @Param("example") SongcatagoryExample example);

    int updateByPrimaryKeySelective(Songcatagory record);

    int updateByPrimaryKey(Songcatagory record);
}