package com.wujingjun.dao;

import com.wujingjun.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> findAllUser();

    User findUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}
