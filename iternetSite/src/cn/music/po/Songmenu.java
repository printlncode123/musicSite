package cn.music.po;

import java.util.Date;

public class Songmenu {
    private Integer id;

    private String menuname;

    private Date createtime;

    private Date updatetime;

    private String menuintroduct;

    private String tag;

    private Integer songid;

    private Integer songdownloadid;

    private Integer smid;

    private Integer userid;

    private Integer songcount;

    private String menucover;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
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

    public String getMenuintroduct() {
        return menuintroduct;
    }

    public void setMenuintroduct(String menuintroduct) {
        this.menuintroduct = menuintroduct == null ? null : menuintroduct.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Integer getSongid() {
        return songid;
    }

    public void setSongid(Integer songid) {
        this.songid = songid;
    }

    public Integer getSongdownloadid() {
        return songdownloadid;
    }

    public void setSongdownloadid(Integer songdownloadid) {
        this.songdownloadid = songdownloadid;
    }

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSongcount() {
        return songcount;
    }

    public void setSongcount(Integer songcount) {
        this.songcount = songcount;
    }

    public String getMenucover() {
        return menucover;
    }

    public void setMenucover(String menucover) {
        this.menucover = menucover == null ? null : menucover.trim();
    }
}