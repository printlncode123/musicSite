package cn.music.po;

public class UserSong {
    private Integer uid;

    private Integer songid;

    private Integer downloadif;

    private Integer loveif;

    private Integer songmenuid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSongid() {
        return songid;
    }

    public void setSongid(Integer songid) {
        this.songid = songid;
    }

    public Integer getDownloadif() {
        return downloadif;
    }

    public void setDownloadif(Integer downloadif) {
        this.downloadif = downloadif;
    }

    public Integer getLoveif() {
        return loveif;
    }

    public void setLoveif(Integer loveif) {
        this.loveif = loveif;
    }

    public Integer getSongmenuid() {
        return songmenuid;
    }

    public void setSongmenuid(Integer songmenuid) {
        this.songmenuid = songmenuid;
    }
}