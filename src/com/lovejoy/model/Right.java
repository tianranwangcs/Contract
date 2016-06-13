package com.lovejoy.model;

public class Right {
private int id;
private int userid;
private int roleid;
private int del;
private String description;
public Right(){
	this.id=0;
	this.userid=0;
	this.roleid=0;
	this.del=0;
	this.description="";
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
public int getRoleid() {
	return roleid;
}
public void setRoleid(int roleid) {
	this.roleid = roleid;
}
public int getDel() {
	return del;
}
public void setDel(int del) {
	this.del = del;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
