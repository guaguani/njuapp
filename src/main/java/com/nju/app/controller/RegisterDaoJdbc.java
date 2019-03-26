package com.nju.app.controller;

import com.nju.app.dao.RegisterDao;
import com.nju.app.entities.RegUser;
import com.nju.app.utils.C3p0Utils;

import java.sql.SQLException;

public class RegisterDaoJdbc implements RegisterDao {
    @Override
    public RegUser reg(RegUser user) throws SQLException {
        String sql = "insert into user(id,name,password,mail,acode,active) values(?,?,?,?,?,?)";
        if (C3p0Utils.getDataSource() == null) {
            System.out.println("空");
            return null;
        }

        return user;
    }
}
