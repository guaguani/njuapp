package com.nju.app.dao;

import com.nju.app.entities.RegUser;

import java.sql.SQLException;

public interface RegisterDao {
    public abstract RegUser reg(RegUser user) throws SQLException;
}
