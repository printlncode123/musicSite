package cn.music.po;

import java.util.Date;

public class Song {
    private Integer id;

    private String name;

    private String theme;

    private Integer albumId;

    private String path;

    private String img;

    private String lrcPath;

    private Integer playnum;

    private Integer downloadnum;

    private Integer songCsid;

    private Date createtime;

    private Date updatetime;

    private Integer singerId;

    private String lrcContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getLrcPath() {
        return lrcPath;
    }

    public void setLrcPath(String lrcPath) {
        this.lrcPath = lrcPath == null ? null : lrcPath.trim();
    }

    public Integer getPlaynum() {
        return playnum;
    }

    public void setPlaynum(Integer playnum) {
        this.playnum = playnum;
    }

    public Integer getDownloadnum() {
        return downloadnum;
    }

    public void setDownloadnum(Integer downloadnum) {
        this.downloadnum = downloadnum;
    }

    public Integer getSongCsid() {
        return songCsid;
    }

    public void setSongCsid(Integer songCsid) {
        this.songCsid = songCsid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
    }

    public String getLrcContent() {
        return lrcContent;
    }

    public void setLrcContent(String lrcContent) {
        this.lrcContent = lrcContent == null ? null : lrcContent.trim();
    }
}