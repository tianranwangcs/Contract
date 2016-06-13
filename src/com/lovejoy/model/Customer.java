package com.lovejoy.model;

public class Customer {
private int id;
private String num;
private String name;
private String address;
private String tell;
private String fex;
private String bank;
private String account;
private int del;

public Customer(){
	this.id=0;
	this.del=0;
	this.num="";
	this.name="";
	this.address="";
	this.tell="";
	this.fex="";
	this.bank="";
	this.account="";			
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNum() {
	return num;
}

public void setNum(String num) {
	this.num = num;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getTell() {
	return tell;
}

public void setTell(String tell) {
	this.tell = tell;
}

public String getFex() {
	return fex;
}

public void setFex(String fex) {
	this.fex = fex;
}

public String getBank() {
	return bank;
}

public void setBank(String bank) {
	this.bank = bank;
}

public String getAccount() {
	return account;
}

public void setAccount(String account) {
	this.account = account;
}

public int getDel() {
	return del;
}

public void setDel(int del) {
	this.del = del;
}

}
