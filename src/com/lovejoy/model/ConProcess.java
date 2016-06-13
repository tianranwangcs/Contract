package com.lovejoy.model;

import java.util.Date;

public class ConProcess {
private int id;
private int userid;
private int conid;
private int type;
private int state;
private Date time;
private String content;
private int del;

public ConProcess(){
	this.id=0;
	this.userid=0;
	this.conid=0;
	this.type=0;
	this.del=0;
	this.state=0;
	this.content="";
	time=new Date();
	
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

public int getConid() {
	return conid;
}

public void setConid(int conid) {
	this.conid = conid;
}

public int getType() {
	return type;
}

public void setType(int type) {
	this.type = type;
}

public int getState() {
	return state;
}

public void setState(int state) {
	this.state = state;
}

public Date getTime() {
	return time;
}

public void setTime(Date time) {
	this.time = time;
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
