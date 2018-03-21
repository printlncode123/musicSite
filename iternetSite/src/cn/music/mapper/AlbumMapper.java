package cn.music.mapper;

import cn.music.po.Album;
import cn.music.po.AlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumMapper {
    int countByExample(AlbumExample example);

    int deleteByExample(AlbumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Album record);

    int insertSelective(Album record);

    List<Album> selectByExample(AlbumExample example);

    Album selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByExample(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKey(Album record);
}