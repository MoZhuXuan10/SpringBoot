package com.syl.dao;


import com.syl.bean.Teacher;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository
public class TeacherDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Teacher selectByTeacherName(String teacherName){
        String sql="select * from teacher where t_name=?";
        RowMapper<Teacher> rowMapper=new BeanPropertyRowMapper<Teacher>(Teacher.class);
        Teacher teacher = jdbcTemplate.queryForObject(sql, rowMapper, teacherName);
        return teacher;

    }
}
