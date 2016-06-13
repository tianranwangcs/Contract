package com.lovejoy.model;

import java.util.Date;

public class Contract {
    private int id;
    private int userid;
    private String customer;
    private String name;
    private String num;
    private Date beginTime;
    private Date endTime;
    private String content;
    private int del;

    public Contract() {
        this.id = 0;
        this.userid = 0;
        this.del = 0;
        this.customer = "";
        this.name = "";
        this.num = "";
        this.content = "";
        this.beginTime = new Date();
        this.endTime = new Date();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }


}
