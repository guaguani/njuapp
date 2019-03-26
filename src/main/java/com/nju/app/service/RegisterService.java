package com.nju.app.service;

import com.nju.app.entities.RegUser;

import java.sql.SQLException;

public interface RegisterService {
    public abstract RegUser regUser(RegUser user) throws SQLException;
}
