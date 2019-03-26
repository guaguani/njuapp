package com.nju.app.controller;

import com.nju.app.dao.RegisterDao;
import com.nju.app.entities.RegUser;
import com.nju.app.service.RegisterService;

import java.sql.SQLException;

public class RegisterServiceImpl implements RegisterService {
    RegisterDao dao = new RegisterDaoJdbc();

    @Override
    public RegUser regUser(RegUser user) throws SQLException{
        return dao.reg(user);
    }
}
