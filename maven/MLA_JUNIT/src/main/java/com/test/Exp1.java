package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Exp1 {
	public static void main(String[] args) {
		String driverClass = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/rohan";
		String username = "root";
		String password = "root@39";
		
		try {
			Class.forName(driverClass);
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			
			String sql1 = "insert into student values(10,'Miller', 'd.miller@example.com');";
			String sql2 = "insert into student values(10,'Maxwell', 'max@example.com');";
			String sql3 = "insert into student values(10,'Kane', 'kane@example.com');";
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.executeBatch();
			System.out.println("done with stmt");
			
			
			//prepared statement
			String sql11 = "insert into student values(?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(sql11);
			pst.setInt(1, 90);
			pst.setString(2, "axar");
			pst.setString(3, "axar@example.com");
			
			pst.addBatch();
			pst.executeBatch();
			System.out.println("done with prepared stmt1");
			
			
			String sql21 = "insert into student values(?, ?, ?)";
			PreparedStatement pst2 = con.prepareStatement(sql21);
			pst2.setInt(1, 80);
			pst2.setString(2, "Rinku");
			pst2.setString(3, "rinku@example.com");
			
			pst2.addBatch();
			pst2.executeBatch();
			System.out.println("done with prepared stmt2");

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
