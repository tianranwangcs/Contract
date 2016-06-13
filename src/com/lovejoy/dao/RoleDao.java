package com.lovejoy.dao;

import com.lovejoy.model.Role;
import com.lovejoy.utils.AppException;

public interface RoleDao {
	public Role getbyid(int id) throws AppException;
}
