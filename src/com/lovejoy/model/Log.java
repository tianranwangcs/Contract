package com.lovejoy.model;

import java.util.Date;

public class Log {
private int id;
private int userid;
private int del;
private Date time;
private String content;

public Log(){
	this.id=0;
	this.userid=0;
	this.del=0;
	this.time=new Date();
	this.content="";
	
	
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

public int getDel() {
	return del;
}

public void setDel(int del) {
	this.del = del;
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

}
