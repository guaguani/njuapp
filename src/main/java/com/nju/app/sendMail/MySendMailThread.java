package com.nju.app.sendMail;

import com.nju.app.entities.RegUser;

import java.util.Properties;

public class MySendMailThread extends Thread {
    private RegUser user;
    public MySendMailThread(RegUser user){
        this.user = user;
    }

//    @Override
//    public void run(){
//        try{
//            Properties p = new Properties();
//            p.setProperty("mail.host","smtp.qq.com");
//            p.setProperty("mail.smtp,auth","true");
//            p.setProperty("mail.smtp.port","587");
//
//        }
//    }
}
