package com.syl.service;

import com.syl.bean.Teacher;
import com.syl.dao.TeacherDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherService {
    @Resource
    private TeacherDao teacherDao;
    public Teacher selectByTeacherName(String teacherName){
        return teacherDao.selectByTeacherName(teacherName);
    }
}
