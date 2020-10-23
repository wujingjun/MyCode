package com.wujingjun.springmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hellocontroller {

    @RequestMapping("/hello")
    public String hello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","fuck");
        //WEB-INF/hello
        return "hello";
    }

    @RequestMapping("/fuck")
    public ModelAndView fuck(ModelAndView modelAndView){
        modelAndView.addObject("msg","real fuck");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
