package com.wujingjun.springmvc05.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wujingjun.springmvc05.pojo.User;
import com.wujingjun.springmvc05.util.JsonnUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class UserController {

    //produces:指定响应体返回类型和编码
    @RequestMapping(value = "/json")
//    @ResponseBody
    public String json1() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("俊哥",3,"男");
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(user);
        //由于@ResponseBody注解，这里会将str转成json格式；十分方便
        return str;
    }

    @RequestMapping("/json1")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<User>();

        User user = new User("俊哥1号",3,"男");
        User user1 = new User("俊哥2号",3,"男");
        User user2 = new User("俊哥3号",3,"男");
        User user3 = new User("俊哥4号",3,"男");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping("/json2")
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Date date =new Date();

        return mapper.writeValueAsString(date);
    }

    @RequestMapping("/json3")
    public String json4() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Date date = new Date();

        //自定义日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);

        mapper.setDateFormat(simpleDateFormat);

        return mapper.writeValueAsString(date);
    }

    @RequestMapping("/json4")
    public String json5(){
        Date date = new Date();

        return JsonnUtil.getJson(date);
    }
}
