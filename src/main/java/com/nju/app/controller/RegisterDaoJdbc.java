package com.nju.app.controller;

import com.nju.app.dao.RegisterDao;
import com.nju.app.entities.RegUser;

import java.sql.SQLException;

public class RegisterDaoJdbc implements RegisterDao {
    @Override
    public RegUser reg(RegUser user) throws SQLException{

        return user;
    }
}
