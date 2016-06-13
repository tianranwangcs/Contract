package com.lovejoy.service;

import com.lovejoy.dao.RightDao;
import com.lovejoy.dao.RoleDao;
import com.lovejoy.dao.UserDao;
import com.lovejoy.dao.impl.RightDaoImpl;
import com.lovejoy.dao.impl.RoleDaoImpl;
import com.lovejoy.dao.impl.UserDaoImpl;
import com.lovejoy.model.Role;
import com.lovejoy.model.User;
import com.lovejoy.utils.AppException;

public class UserService {
    private UserDao userdao = null;
    private RightDao rightdao = null;
    private RoleDao roledao;

    public UserService() {
        userdao = new UserDaoImpl();
        rightdao = new RightDaoImpl();
        roledao = new RoleDaoImpl();
    }


    public boolean register(User user) throws AppException {
        boolean flag = false;

        try {
            if (!userdao.isExist(user.getName())) {
                flag = userdao.add(user);
                System.out.println("register success");
            }
        } catch (AppException e) {
            e.printStackTrace();
            throw new AppException("com.lovejoy.dao.service.UserService.register");
        }
        return flag;
    }


    public int login(String name, String password) throws AppException {
        int userId = -1;

        try {
            userId = userdao.login(name, password);
        } catch (AppException e) {
            e.printStackTrace();
            throw new AppException("com.lovejoy.dao.service.UserService.login");
        }
        return userId;
    }

    public Role getUserRole(int userId) throws AppException {
        Role role = new Role();
        int roleId = -1;
        try {
            roleId = rightdao.getroleidbyuserid(userId);
            if (roleId > 0) {
                role = roledao.getbyid(roleId);
            }
        } catch (AppException e) {
            e.printStackTrace();
            throw new AppException("com.lovejoy.dao.service.UserService.getUserRole");
        }
        return role;
    }
}
