package com.wujingjun.mybatis04.dao;

import com.wujingjun.mybatis04.pojo.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> getStudent();

    List<Student> getStudent2();
}
