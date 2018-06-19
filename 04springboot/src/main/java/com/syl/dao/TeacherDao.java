package com.syl.dao;

import com.syl.bean.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherDao extends CrudRepository<Teacher,Integer> {
}
