package com.jk.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 7274453514238041095L;

    private String userid;

    private String username;

    private String userpass;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                '}';
    }
}
