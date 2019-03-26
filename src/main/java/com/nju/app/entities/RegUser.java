package com.nju.app.entities;

public class RegUser {
    private String id;
    private String name;
    private String password;
    private String mail;
    private String acode;
    private String active;

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getAcode() {
        return acode;
    }
    public void setAcode(String acode) {
        this.acode = acode;
    }
    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password + ", mail="
                + mail + ", acode=" + acode + ", active=" + active + "]";
    }

}
