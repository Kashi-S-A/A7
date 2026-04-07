package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CloseConn1 {

	public static void main(String[] args) {

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo";
		String user = "postgres";
		String password = "root";

		Connection con = null;

		try {
			Class.forName(driver);
			System.out.println("Driver loaded");

			con = DriverManager.getConnection(url, user, password);
			System.out.println("connection created");

			String query = "UPDAT student SET phone=? WHERE sid=?";

			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(2, 101);
			pstm.setLong(1, 9876543210L);

			int res = pstm.executeUpdate();
			System.out.println(res);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
					System.out.println("connection is closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
