package com.lovejoy.model;

import java.util.Date;

public class ConState {
    private int id;
    private int conid;
    private int type;
    private Date time;
    private int del;

    public ConState() {
        this.id = 0;
        this.conid = 0;
        this.type = 0;
        this.time = new Date();
        this.del = 0;
    }

    public int getId() {
        return id;
    }

    public int getConid() {
        return conid;
    }

    public int getType() {
        return type;
    }

    public Date getTime() {
        return time;
    }

    public int getDel() {
        return del;
    }

}
