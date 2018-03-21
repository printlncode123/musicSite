package cn.music.mapper;

import cn.music.po.UserSonglove;
import cn.music.po.UserSongloveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSongloveMapper {
    int countByExample(UserSongloveExample example);

    int deleteByExample(UserSongloveExample example);

    int insert(UserSonglove record);

    int insertSelective(UserSonglove record);

    List<UserSonglove> selectByExample(UserSongloveExample example);

    int updateByExampleSelective(@Param("record") UserSonglove record, @Param("example") UserSongloveExample example);

    int updateByExample(@Param("record") UserSonglove record, @Param("example") UserSongloveExample example);
}