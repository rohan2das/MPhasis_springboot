package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp2 {
	
	public static void main(String[] args) throws Exception
	{
		Student obj = new Student(50, "Jaiswal", "java@java.com");
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphintern", "root", "password");
		
		String sql1 = "insert into student values(?, ?, ?)";
		
		PreparedStatement pst1 = con.prepareStatement(sql1);
		
		pst1.setInt(1, obj.getId());
		pst1.setString(2, obj.getName());
		pst1.setString(3, obj.getEmail());
		
		pst1.execute();
		
		/*
		String sql = "update student set std_name = ?, std_email = ? where std_id = ?";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setString(1, "siranjeevi");
		pst.setString(2, "siranj@java.com");
		pst.setInt(3, 101);
		
		pst.execute();
		
		
		
		String sql = "delete from student where std_id = ? ";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setInt(1, 101);
		
		pst.executeUpdate();
		
		*/
		String sql2 = "insert into student values(?, ?, ?)";
		String sql = "select * from student";
		
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	}

}
