package com.wujingjun.mybatis04.dao;

import com.wujingjun.mybatis04.pojo.Teacher;
import com.wujingjun.mybatis04.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = teacherMapper.getTeacher(1);

        System.out.println(teacher);

        sqlSession.close();
    }

}
