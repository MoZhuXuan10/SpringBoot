package com.syl;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("进入了HelloController中的hello()");
        return "success";
    }
    @RequestMapping("/getStudent")
    public Student getStudent(){
        System.out.println("进入了HelloController中的getStudent()");
        Student stu=new Student(1,"啦啦",new Date());
        return stu;
    }



}