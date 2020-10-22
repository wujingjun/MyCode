package com.wuijngjun.spring01.dao.impl;

import com.wuijngjun.spring01.dao.UserDao;

public class OracleUseDaoImpl implements UserDao {
    @Override
    public void use() {
        System.out.println("使用Oracle");
    }
}
