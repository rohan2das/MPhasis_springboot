package com.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Exp3 {
	
	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphintern", "root", "password");
		
		CallableStatement cst = con.prepareCall("{call readData}");
		
		ResultSet rs = cst.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	}
}
