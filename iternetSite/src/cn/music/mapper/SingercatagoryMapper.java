package cn.music.mapper;

import cn.music.po.Singercatagory;
import cn.music.po.SingercatagoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingercatagoryMapper {
    int countByExample(SingercatagoryExample example);

    int deleteByExample(SingercatagoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Singercatagory record);

    int insertSelective(Singercatagory record);

    List<Singercatagory> selectByExample(SingercatagoryExample example);

    Singercatagory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Singercatagory record, @Param("example") SingercatagoryExample example);

    int updateByExample(@Param("record") Singercatagory record, @Param("example") SingercatagoryExample example);

    int updateByPrimaryKeySelective(Singercatagory record);

    int updateByPrimaryKey(Singercatagory record);
}