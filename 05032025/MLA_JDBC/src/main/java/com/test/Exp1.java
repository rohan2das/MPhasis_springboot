package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Exp1 {
	
	public static void main(String[] args) {
		
		try
		{
			//1. load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. create connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohan", "root","Rohan@123");
			
			//3. create statement object
			Statement stmt = con.createStatement();
			
			//SQL query
			String sql = "create table movies(id int, m_name varchar(50), m_price int)";
			
			String sqlInsert = "insert into movies values(101, 'King', 1230 )";
			
			//Student std = new Student(306, "Omsri", "omsri@java.com");
			
			//String sql = "insert into student values("+std.getId()+", '"+std.getName()+"', '"+std.getEmail()+"')";
			
			
			
			//4. execute query
//			stmt.execute(sql);
//			stmt.execute(sqlInsert);
			
			
//			String sql5 = "insert into student values(111, 'apple', 'apple@apple.com')";
//			String sql8 = "insert into student values(112, 'apple', 'apple@apple.com')";
//			String sql9 = "insert into student values(113, 'apple', 'apple@apple.com')";
//			String sql7 = "update student set std_name = 'mango', std_email = 'mango@apple.com' where std_id = 111";
//			String sql6 = "delete from student where std_id = 111 ";
			
//			stmt.addBatch(sql5);
//			stmt.addBatch(sql8);
//			stmt.addBatch(sql9);
//			stmt.addBatch(sql7);
//			stmt.addBatch(sql6);
			//stmt.addBatch(sql6);
			
//			stmt.executeBatch();
			
			String sqlGet = "select * from movies";
			
			ResultSet rs = stmt.executeQuery(sqlGet);
			
			while(rs.next()) {
			
			System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" Email : "+rs.getString(3));
			
			}
			
//			ResultSetMetaData rsd = rs.getMetaData();
//			
//			System.out.println(rsd.getColumnCount());
//			
//			System.out.println(rsd.getColumnType(1));
//			System.out.println(rsd.getColumnClassName(1));
			
			//5. close the connection object
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
