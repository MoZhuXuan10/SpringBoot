package com.syl;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Student {
    private int id;//编号
    private String name;//姓名

    @JSONField(format="yyyy-MM-dd")
    private Date time;

    public Student() {
    }

    public Student(int id, String name, Date time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


}
