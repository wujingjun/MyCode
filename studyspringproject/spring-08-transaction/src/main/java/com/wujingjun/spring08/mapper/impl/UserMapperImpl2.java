package com.wujingjun.spring08.mapper.impl;

import com.wujingjun.spring08.mapper.UserMapper;
import com.wujingjun.spring08.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//SqlSessionDaoSupport类帮我们整合上SqlSessionTemplate
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        User user = new User();
        user.setName("xiaoming");
        user.setPassword("111");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        mapper.addUser(user);
        mapper.deleteUser(3);// 制造sql语句错误
        return mapper.selectUser();
    }

    @Override
    public void addUser(User user) {
        deleteUser(5);
        getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
