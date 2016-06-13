package com.lovejoy.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lovejoy.dao.UserDao;
import com.lovejoy.model.User;
import com.lovejoy.utils.AppException;
import com.lovejoy.utils.DBUtil;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean add(User user) throws AppException {
        boolean flag = false;
        Connection conn = null;
        PreparedStatement psmt = null;

        try {
            conn = DBUtil.getConnection();
            String sql = "insert into t_user(name,password)" + "values(?,?)";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, user.getName());
            psmt.setString(2, user.getPassword());
            int result = -1;
            result = psmt.executeUpdate();
            if (result > 0) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new AppException("com.lovejoy.dao.impl.UserDaoImpl.add");
        } finally {
            DBUtil.closeStatement(psmt);
            DBUtil.closeConnection(conn);
        }
        return flag;
    }

    public boolean isExist(String name) throws AppException {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        boolean flag = false;
        try {
            conn = DBUtil.getConnection();
            String sql = "select id from t_user where name = ? and del=0";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);
            rs = psmt.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new AppException("com.lovejoy.dao.impl.UserDaoImpl.isExist");
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closeStatement(psmt);
            DBUtil.closeConnection(conn);
        }
        return flag;
    }

    public int login(String name, String password) throws AppException {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        int userId = -1;
        try {
            conn = DBUtil.getConnection();
            String sql = "select id from t_user where name = ? and del=0 and password = ? ";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);
            psmt.setString(2, password);
            rs = psmt.executeQuery();
            if (rs.next()) {
                userId = rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new AppException("com.lovejoy.dao.impl.UserDaoImpl.login");
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closeStatement(psmt);
            DBUtil.closeConnection(conn);
        }
        return userId;
    }
}
