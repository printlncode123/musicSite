package cn.music.po;

public class Singer {
    private Integer id;

    private String name;

    private String headimg;

    private String bigpic;

    private Integer singercid;

    private String smallname;

    private Integer visitcount;

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

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getBigpic() {
        return bigpic;
    }

    public void setBigpic(String bigpic) {
        this.bigpic = bigpic == null ? null : bigpic.trim();
    }

    public Integer getSingercid() {
        return singercid;
    }

    public void setSingercid(Integer singercid) {
        this.singercid = singercid;
    }

    public String getSmallname() {
        return smallname;
    }

    public void setSmallname(String smallname) {
        this.smallname = smallname == null ? null : smallname.trim();
    }

    public Integer getVisitcount() {
        return visitcount;
    }

    public void setVisitcount(Integer visitcount) {
        this.visitcount = visitcount;
    }
}