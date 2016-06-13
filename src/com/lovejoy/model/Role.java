package com.lovejoy.model;

public class Role {
private int id;
private String name;
private String description;
private String functionid;
private int del;
public Role(){
	this.id=0;
	this.name="";
	this.description="";
	this.functionid="";
	this.del=0;	
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getFunctionid() {
	return functionid;
}
public void setFunctionid(String functionid) {
	this.functionid = functionid;
}
public int getDel() {
	return del;
}
public void setDel(int del) {
	this.del = del;
}

}
