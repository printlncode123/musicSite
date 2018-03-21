package cn.music.service;

import java.util.List;

import cn.music.po.Album;

public interface AlbumService {
  public List<Album> getBySingerId(int sid);
  public Album getByAlbumId(int id);
}
