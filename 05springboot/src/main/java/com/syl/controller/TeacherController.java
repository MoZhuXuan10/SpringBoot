package com.syl.controller;

import com.syl.bean.Teacher;
import com.syl.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TeacherController {
    @Resource
    private TeacherService teacherService;
    @RequestMapping("/selectByTeacherName")
    public Teacher selectByTeacherName(String teacherName){
        return teacherService.selectByTeacherName(teacherName);
    }
}
