package com.lovejoy.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lovejoy.dao.RoleDao;
import com.lovejoy.model.Role;
import com.lovejoy.utils.AppException;
import com.lovejoy.utils.DBUtil;

public class RoleDaoImpl implements RoleDao {
	public Role getbyid(int id) throws AppException{
		Role role=new Role();		 
		Connection conn=null;
			PreparedStatement psmt=null;
			ResultSet rs=null;
			try{
				conn=DBUtil.getConnection();
				String sql="select * from t_role where del=0 and id = ? ";
				psmt=conn.prepareStatement(sql);
				psmt.setInt(1, id);		
				rs=psmt.executeQuery();
				if(rs.next()){
					role.setDescription(rs.getString("description"));
					role.setFunctionid(rs.getString("function_ids"));
					role.setId(id);
					role.setName(rs.getString("name"));
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				throw new AppException("com.lovejoy.dao.impl.RoleDaoImpl.getbyid");
			}finally{
				DBUtil.closeResultSet(rs);
				DBUtil.closeStatement(psmt);
				DBUtil.closeConnection(conn);
		}
		return role;	
	}
}
