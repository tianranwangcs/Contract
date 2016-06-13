package com.lovejoy.dao;

import com.lovejoy.utils.AppException;

public interface RightDao {
	public int getroleidbyuserid(int userid) throws AppException;
}
