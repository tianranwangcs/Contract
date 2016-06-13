package com.lovejoy.model;

public class User {
private int id;
private int del;
private String name;
private String password;

public User(){
	this.id=0;
	this.del=0;
	this.name="";
	this.password="";
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getDel() {
	return del;
}

public void setDel(int del) {
	this.del = del;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
