package com.wujingjun.spring08.mapper;

import com.wujingjun.spring08.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser();

    void addUser(User user);

    void deleteUser(int id);

}
