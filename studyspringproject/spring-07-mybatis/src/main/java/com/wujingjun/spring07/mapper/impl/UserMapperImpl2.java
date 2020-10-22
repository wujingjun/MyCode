package com.wujingjun.spring07.mapper.impl;

import com.wujingjun.spring07.mapper.UserMapper;
import com.wujingjun.spring07.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//SqlSessionDaoSupport类帮我们整合上SqlSessionTemplate
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
