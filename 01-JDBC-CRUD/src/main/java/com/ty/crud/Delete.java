package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo";
		String user = "postgres";
		String password = "root";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, user, password);

			Statement stm = con.createStatement();

			String query = "DELETE FROM student WHERE sid=101";

			stm.execute(query);

			con.close();

			System.out.println("record deleted");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
