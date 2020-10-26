package com.fc.test.model.auto;

import java.io.Serializable;

public class TsysUser implements Serializable {
    private String id;

    private String username;

    private String password;

    private String nickname;

    private String department;

    private static final long serialVersionUID = 1L;

    public TsysUser(String id, String username, String password, String nickname,String department) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.department = department;
    }

    public TsysUser() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}