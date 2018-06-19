package com.syl.controller;

import com.syl.bean.Teacher;
import com.syl.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService;
    @RequestMapping("/add")
    public String add(){
        System.out.println("进入了add()");
        teacherService.add(new Teacher(1,"啦啦1","北京1"));
        return "add success";
    }
    @RequestMapping("/del")
    public String del(){
        System.out.println("进入了del()");
        teacherService.del(4);
        return "del success";
    }
    @RequestMapping("/getAll")
    public Iterable<Teacher> getAll(){
        System.out.println("进入了getAll()");
        Iterable<Teacher> teachers = teacherService.getAll();
        return teachers;
    }

}
