package cn.music.po;

import java.util.Date;

public class User {
    private Integer id;

    private String nickname;

    private String headimg;

    private String account;

    private String password;

    private String logintype;

    private String genda;

    private Date createtime;

    private Date updatetime;

    private String phonePrefix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLogintype() {
        return logintype;
    }

    public void setLogintype(String logintype) {
        this.logintype = logintype == null ? null : logintype.trim();
    }

    public String getGenda() {
        return genda;
    }

    public void setGenda(String genda) {
        this.genda = genda == null ? null : genda.trim();
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

    public String getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(String phonePrefix) {
        this.phonePrefix = phonePrefix == null ? null : phonePrefix.trim();
    }
}