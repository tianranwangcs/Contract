package com.lovejoy.model;

import java.util.Date;

public class ConAttach {
private int id;
private int conid;
private String filename;
private int del;
private String type;
private String path;
private Date uploadtime;

public ConAttach(){
	this.id=0;
	this.conid=0;
	this.del=0;
    this.type="";
    this.path="";
	this.filename="";
	this.uploadtime=new Date();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getConid() {
	return conid;
}

public void setConid(int conid) {
	this.conid = conid;
}

public String getFilename() {
	return filename;
}

public void setFilename(String filename) {
	this.filename = filename;
}

public int getDel() {
	return del;
}

public void setDel(int del) {
	this.del = del;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

public Date getUploadtime() {
	return uploadtime;
}

public void setUploadtime(Date uploadtime) {
	this.uploadtime = uploadtime;
}

}
