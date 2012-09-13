package com.veralex.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: mac
 * Date: 14.09.12
 * Time: 0:08
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User {
    private long userid;

    @javax.persistence.Column(name = "userid", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    @Id
    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    private String userlogin;

    @javax.persistence.Column(name = "userlogin", nullable = false, insertable = true, updatable = true, length = 35, precision = 0)
    @Basic
    public String getUserlogin() {
        return userlogin;
    }

    public void setUserlogin(String userlogin) {
        this.userlogin = userlogin;
    }

    private String userpassword;

    @javax.persistence.Column(name = "userpassword", nullable = false, insertable = true, updatable = true, length = 25, precision = 0)
    @Basic
    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    private String userlfmname;

    @javax.persistence.Column(name = "userlfmname", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getUserlfmname() {
        return userlfmname;
    }

    public void setUserlfmname(String userlfmname) {
        this.userlfmname = userlfmname;
    }

    private Date userbirthday;

    @javax.persistence.Column(name = "userbirthday", nullable = true, insertable = true, updatable = true, length = 13, precision = 0)
    @Basic
    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    private String usersex;

    @javax.persistence.Column(name = "usersex", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    @Basic
    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    private String useraddress;

    @javax.persistence.Column(name = "useraddress", nullable = true, insertable = true, updatable = true, length = 2147483647, precision = 0)
    @Basic
    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    private String usercomment;

    @javax.persistence.Column(name = "usercomment", nullable = true, insertable = true, updatable = true, length = 2147483647, precision = 0)
    @Basic
    public String getUsercomment() {
        return usercomment;
    }

    public void setUsercomment(String usercomment) {
        this.usercomment = usercomment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userid != user.userid) return false;
        if (useraddress != null ? !useraddress.equals(user.useraddress) : user.useraddress != null) return false;
        if (userbirthday != null ? !userbirthday.equals(user.userbirthday) : user.userbirthday != null) return false;
        if (usercomment != null ? !usercomment.equals(user.usercomment) : user.usercomment != null) return false;
        if (userlfmname != null ? !userlfmname.equals(user.userlfmname) : user.userlfmname != null) return false;
        if (userlogin != null ? !userlogin.equals(user.userlogin) : user.userlogin != null) return false;
        if (userpassword != null ? !userpassword.equals(user.userpassword) : user.userpassword != null) return false;
        if (usersex != null ? !usersex.equals(user.usersex) : user.usersex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userid ^ (userid >>> 32));
        result = 31 * result + (userlogin != null ? userlogin.hashCode() : 0);
        result = 31 * result + (userpassword != null ? userpassword.hashCode() : 0);
        result = 31 * result + (userlfmname != null ? userlfmname.hashCode() : 0);
        result = 31 * result + (userbirthday != null ? userbirthday.hashCode() : 0);
        result = 31 * result + (usersex != null ? usersex.hashCode() : 0);
        result = 31 * result + (useraddress != null ? useraddress.hashCode() : 0);
        result = 31 * result + (usercomment != null ? usercomment.hashCode() : 0);
        return result;
    }
}
