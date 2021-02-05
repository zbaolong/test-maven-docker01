package com.h3c.testmavendocker01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello h3c CloudOS";
    }
    @RequestMapping("/success")
    public String success(){
        return "successfully";
    }
    //查询一些数据放到页面
    @RequestMapping("/show")
    public String show_data(Map<String,Object> map){
        map.put("hello","<h1>您好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi"));

        return "success!!!!!!1111";
    }

}
