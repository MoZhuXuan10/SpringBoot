package com.syl.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tId;
    private String tName;
    private String tAddress;

    public Teacher() {
    }

    public Teacher(Integer tId, String tName, String tAddress) {
        this.tId = tId;
        this.tName = tName;
        this.tAddress = tAddress;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }
}
