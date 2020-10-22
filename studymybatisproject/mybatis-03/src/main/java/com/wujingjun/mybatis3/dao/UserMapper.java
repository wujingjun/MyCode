package com.wujingjun.mybatis3.dao;

import com.wujingjun.mybatis3.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from mybatisuser")
    List<User> getUsers();

    @Select("select * from mybatisuser where id = #{id}")
    User getUserById(int id);

    @Insert("insert into mybatisuser(id,name,password) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update mybatisuser set name=#{name},password=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from mybatisuser where id=#{id}")
    int deleteUser(@Param("id") int id);
}
