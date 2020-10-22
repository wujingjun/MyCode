package com.wujingjun.test.reflection;

@Tableannotation("student")
public class Student1 {

    @Fieldannotation(name="id",type = "varchar",length = 3)
    private String name;
    @Fieldannotation(name="age",type = "int",length = 10)
    private int age;
    @Fieldannotation(name="age",type = "int",length = 10)
    private int id;

    public Student1(){}

    public Student1(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
