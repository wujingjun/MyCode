package com.wujingjun.mybatis04.pojo;

import java.util.List;

public class Teacher {

    private int id;
    private String name;

    //一对多时候使用：一个老师可以有多个学生
    private List<Student> students;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
