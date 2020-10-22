package com.wujingjun.mybatis05.util;

import java.util.UUID;

public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replace(".","-");
    }

}
