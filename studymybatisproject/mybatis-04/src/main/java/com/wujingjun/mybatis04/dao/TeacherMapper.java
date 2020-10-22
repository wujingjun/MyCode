package com.wujingjun.mybatis04.dao;

import com.wujingjun.mybatis04.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

//    List<Teacher> getTeacher();

    Teacher getTeacher(@Param("id") int id);
}
