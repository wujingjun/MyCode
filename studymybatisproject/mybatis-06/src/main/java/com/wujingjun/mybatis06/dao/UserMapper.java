package com.wujingjun.mybatis06.dao;

import com.wujingjun.mybatis06.pojo.User;

public interface UserMapper {

    User findUserById(int id);
}
