package cn.music.mapper;

import cn.music.po.RoleAuth;
import cn.music.po.RoleAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthMapper {
    int countByExample(RoleAuthExample example);

    int deleteByExample(RoleAuthExample example);

    int insert(RoleAuth record);

    int insertSelective(RoleAuth record);

    List<RoleAuth> selectByExample(RoleAuthExample example);

    int updateByExampleSelective(@Param("record") RoleAuth record, @Param("example") RoleAuthExample example);

    int updateByExample(@Param("record") RoleAuth record, @Param("example") RoleAuthExample example);
}