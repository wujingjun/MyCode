package com.wuijngjun.spring01.dao.impl;

import com.wuijngjun.spring01.dao.UserDao;

public class MysqlUseDaoImpl implements UserDao {
    @Override
    public void use() {
        System.out.println("使用mysql");
    }
}
