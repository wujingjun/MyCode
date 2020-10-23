package com.wujingjun.springmvc08.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@RestController
public class FileController {


    //@RequestParam("file") 将name=file控件得到的文件封装成CommonsMultipartFile对象
    //批量上传CommonsMultipartFile则为数组即可
    @RequestMapping("/upload")
    public String fileupload2(@RequestParam("file")CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        //上传路径保存设置
        String path = request.getServletContext().getRealPath("/upload");
        File realpath = new File(path);
        if (!realpath.exists()){
            realpath.mkdir();
        }

        //上传文件地址
        System.out.println("上传文件保存地址："+realpath);

        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        file.transferTo(new File(realpath+"/"+file.getOriginalFilename()));

        return "redirect:/index.jsp";
    }

    @RequestMapping("/download")
    public String downloads(HttpServletResponse response,HttpServletRequest request) throws IOException {

        //要下载的图片地址
        String path = request.getServletContext().getRealPath("/upload");
        String filename = "毛概.docx";

        //1.设置response 响应头
        response.reset();//设置页面不缓存，清空buffer
        response.setCharacterEncoding("utf-8");//字符编码
        response.setContentType("multipart/form-data");//二进制传输数据

        //设置响应头
        response.setHeader("content-Disposition","attachment;filename="+ URLEncoder.encode(filename,"UTF-8"));

        File file = new File(path,filename);

        //读取文件--输入流
        InputStream inputStream = new FileInputStream(file);

        //写出文件--输出流
        OutputStream outputStream = response.getOutputStream();

        byte[] buff = new byte[1024];
        int index = 0;

        //执行 写出操作
        while((index = inputStream.read(buff))!= -1){
            outputStream.write(buff,0,index);
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();
        return null;
    }


}
