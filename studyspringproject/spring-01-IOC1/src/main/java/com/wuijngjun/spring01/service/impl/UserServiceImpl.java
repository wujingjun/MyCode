package com.wuijngjun.spring01.service.impl;

import com.wuijngjun.spring01.dao.UserDao;
import com.wuijngjun.spring01.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void choose() {
        userDao.use();
    }
}
