package com.wujingjun.mybatis04.dao;

import com.wujingjun.mybatis04.pojo.Student;
import com.wujingjun.mybatis04.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = studentMapper.getStudent();

        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = studentMapper.getStudent2();

        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}
