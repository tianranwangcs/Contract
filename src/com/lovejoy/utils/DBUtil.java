package com.lovejoy.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	private static String URL = "jdbc:mysql://127.0.0.1:3306/db_contract?useUnicode=true&amp;"
			+ "characterEncoding=utf8";
	private static String user = "root";
	private static String password = "";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	public static void closeConnection(Connection conn) {
		try {
			if ((conn != null) && (!conn.isClosed())) {
				conn.close();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeResultSet(ResultSet rs) {
		try {
			if ((rs != null) && (!rs.isClosed())) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void closeStatement(Statement st) {
		try {
			if ((st != null) && (!st.isClosed())) {
				st.close();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Connection conn = null;
		conn = getConnection();
		if (conn != null) {
			System.out.println("success");
		}
	}
}
