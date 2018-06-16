package com.syl;

import com.syl.Student;

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
        Student stu=new Student(1,"啦啦");
        return stu;
    }

    /**
     * 返回List集合
     * @return
     */
    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        List<Student> stus=new ArrayList<Student>();
        Student stu1=new Student(1,"啦啦1");
        Student stu2=new Student(2,"啦啦2");
        Student stu3=new Student(3,"啦啦3");
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        return stus;
    }

    /**
     * 验证返回一个set集合
     * @return
     */
    @RequestMapping("/getStudentsBySet")
    public Set<Student> getStudentsBySet(){
        Set<Student> stus=new HashSet<Student>();
        Student stu1=new Student(1,"啦啦1");
        Student stu2=new Student(2,"啦啦2");
        Student stu3=new Student(3,"啦啦3");
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        return stus;
    }
    @RequestMapping("/getStudentsByMap")
    public Map<String,Student> getStudentsByMap(){
        Map<String,Student> stus=new HashMap<String,Student>();
        Student stu1=new Student(1,"啦啦1");
        Student stu2=new Student(2,"啦啦2");
        Student stu3=new Student(3,"啦啦3");
        stus.put("1",stu1);
        stus.put("2",stu2);
        stus.put("3",stu3);
        return stus;
    }

}
