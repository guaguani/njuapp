package com.nju.app.utils;

import javax.sql.DataSource;
import java.sql.Connection;

public class C3p0Utils {
    //本地线程管理对象
    private static ThreadLocal<Connection> t = new ThreadLocal<Connection>();

    private static DataSource pool;
    static {
        try{
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
