package cn.music.mapper;

import cn.music.po.UserSong;
import cn.music.po.UserSongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSongMapper {
    int countByExample(UserSongExample example);

    int deleteByExample(UserSongExample example);

    int insert(UserSong record);

    int insertSelective(UserSong record);

    List<UserSong> selectByExample(UserSongExample example);

    int updateByExampleSelective(@Param("record") UserSong record, @Param("example") UserSongExample example);

    int updateByExample(@Param("record") UserSong record, @Param("example") UserSongExample example);
}