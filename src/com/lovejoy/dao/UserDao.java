package com.lovejoy.dao;

import com.lovejoy.model.User;
import com.lovejoy.utils.AppException;

public interface UserDao {
	public boolean isExist(String name) throws AppException;
	public boolean add(User user) throws AppException;
    public int login(String name,String password) throws AppException;
}
