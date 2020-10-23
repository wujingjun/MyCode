package com.wujingjun.springmvc05.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonnUtil {

    public static String getJson(Object object){
        return getJson(object,"yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object object,String dateformat){
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper objectMapper = new ObjectMapper();

        //不使用时间戳的方式
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);

        //自定义日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateformat);

        //
        objectMapper.setDateFormat(simpleDateFormat);

        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
