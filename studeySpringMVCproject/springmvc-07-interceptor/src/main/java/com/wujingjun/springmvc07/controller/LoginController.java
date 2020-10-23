package com.wujingjun.springmvc07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/tohome")
    public String home(){
        return "main";
    }

    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session , String username , String password){
        //把用户信息保存在Session中；
        if (username == null){
            return "login";
        }
        session.setAttribute("userLoginInfo",username);
        System.out.println("username:"+username);
        return "home";
    }
}
