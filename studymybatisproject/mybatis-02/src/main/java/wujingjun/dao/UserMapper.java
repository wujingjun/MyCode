package wujingjun.dao;

import wujingjun.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> findAllUser();

    User findUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    List<User> getUserByLimit(Map<String,Integer> map);
 }
