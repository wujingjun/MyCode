package com.wujingjun.springmvc04.controller;

import com.wujingjun.springmvc04.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testcontroller {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","fuck");
        return "hello";
    }

    @PostMapping("/receive")
    public ModelAndView receive(String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",name);
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping("/test")
    public String test(@RequestParam("username") String name,Model model){
        model.addAttribute("msg",name);
        return "hello";
    }


    @PostMapping("/pojo")
    public String pojo(User user,Model model){
        model.addAttribute("msg",user);
        return "hello";
    }
}
