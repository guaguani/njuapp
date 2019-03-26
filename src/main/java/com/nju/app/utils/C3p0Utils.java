package com.nju.app.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Utils {
    //本地线程管理对象
    private static ThreadLocal<Connection> t = new ThreadLocal<Connection>();

    private static DataSource pool;
    static {
        try{
            //配置文件和当前类放在一起
            pool = new ComboPooledDataSource();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return pool;
    }

    public static Connection getConnection(){
        Connection con = t.get();
        if(con==null){
            try{
                con=pool.getConnection();
                t.set(con);
            }catch (SQLException e){
                throw new RuntimeException(e.getMessage(),e);
            }
        }
        System.out.println("获取一个连接："+con.hashCode());
        return con;
    }
}
