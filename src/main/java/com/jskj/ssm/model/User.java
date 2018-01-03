package com.jskj.ssm.model;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;
    private String userName;
    private String passWord;
    private String addc;

    public User(){
    }
    public User(Long id, String name, String password){
        this.id = id;
        this.userName = name;
        this.passWord = password;
        this.addc = addc;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    public String getAddc() {
        return addc;
    }

    public void setAddc(String addc) {
        this.addc = addc;
    }
}
