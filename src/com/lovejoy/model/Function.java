package com.lovejoy.model;

public class Function {
private int id;
private String name;
private String url;
private String num;
private String description;
private int del;


public Function(){
	this.id=0;
	this.del=0;
	this.name="";
	this.num="";
	this.url="";
	this.description="";
			
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


public String getUrl() {
	return url;
}


public void setUrl(String url) {
	this.url = url;
}


public String getNum() {
	return num;
}


public void setNum(String num) {
	this.num = num;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public int getDel() {
	return del;
}


public void setDel(int del) {
	this.del = del;
}


}
