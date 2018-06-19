package com.syl.service;

import com.syl.bean.Teacher;
import com.syl.dao.TeacherDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherService {
    @Resource
    private TeacherDao teacherDao;
    /**
     * 新增
     */
    public void add(Teacher teacher){
        teacherDao.save(teacher);
    }
    /**
     * 删除
     */
    public void del(Integer id){
        teacherDao.deleteById(id);
    }
    /**
     * 查询
     */
    public Iterable<Teacher> getAll(){
        return teacherDao.findAll();
    }
}
