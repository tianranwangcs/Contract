package com.lovejoy.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lovejoy.dao.RightDao;
import com.lovejoy.utils.AppException;
import com.lovejoy.utils.DBUtil;

public class RightDaoImpl implements RightDao {
    public int getroleidbyuserid(int userId) throws AppException {
        int roleId = 0;
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select role_id from t_right where del=0 and user_id = ? ";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, userId);
            rs = psmt.executeQuery();
            if (rs.next()) {
                roleId = rs.getInt("role_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new AppException("com.lovejoy.dao.impl.RightDaoImpl.getroleidbyuserid");
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closeStatement(psmt);
            DBUtil.closeConnection(conn);
        }
        return roleId;
    }
}
