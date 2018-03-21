package cn.music.mapper;

import cn.music.po.UserSongmenu;
import cn.music.po.UserSongmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSongmenuMapper {
    int countByExample(UserSongmenuExample example);

    int deleteByExample(UserSongmenuExample example);

    int insert(UserSongmenu record);

    int insertSelective(UserSongmenu record);

    List<UserSongmenu> selectByExample(UserSongmenuExample example);

    int updateByExampleSelective(@Param("record") UserSongmenu record, @Param("example") UserSongmenuExample example);

    int updateByExample(@Param("record") UserSongmenu record, @Param("example") UserSongmenuExample example);
}