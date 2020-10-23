package com.wujingjun.springmvc07.controller;

import com.wujingjun.springmvc06.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {


    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException{
        System.out.println("hello");
        if("wujingjun".equals(name)){
            System.out.println("true");
            response.getWriter().print("true");
        }else {
            System.out.println("false");
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        System.out.println("fuck");
        List<User> Users = new ArrayList<>();
        Users.add(new User("wjj",1,"boy"));
        Users.add(new User("wll",3,"girl"));
        Users.add(new User("wpp",2,"boy"));

        return Users;
    }

    @RequestMapping("/a3")
    public String a3(String name,String password){
        String msg="";
        if (name!=null){
            if ("wujingjun".equals(name)){
                msg = "ok";
            }
            else {
                msg = "用户名有误";
            }
        }
        if (password != null){
            if ("123".equals(password)){
                msg="ok";
            }else{
                msg = "密码有误";
            }

        }
        return msg;
    }
}
