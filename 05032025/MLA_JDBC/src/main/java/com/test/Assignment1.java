package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Assignment1 {
	
	
	
	public static void main(String[] args) throws Exception {
		List<Orders> orderList = new ArrayList<>();
		orderList.add(new Orders(101, "iPhone", "Gadgets", 50, 19.99, "March", 2025, "Mumbai"));
		orderList.add(new Orders(102, "Samsung TV", "Electronics", 30, 29.99, "April", 2024, "Delhi"));
		orderList.add(new Orders(103, "Leather Wallet", "Accessories", 20, 9.99, "June", 2024, "Bangalore"));
		orderList.add(new Orders(104, "Hammer", "Tools", 15, 49.99, "November", 2024, "Chennai"));
		orderList.add(new Orders(105, "Fitbit", "Gadgets", 25, 39.99, "January", 2023, "Hyderabad"));
		orderList.add(new Orders(106, "Laptop", "Electronics", 40, 59.99, "March", 2020, "Pune"));
		orderList.add(new Orders(107, "Sunglasses", "Accessories", 35, 14.99, "December", 2021, "Kolkata"));
		orderList.add(new Orders(109, "iPad", "Gadgets", 45, 34.99, "December", 2021, "Surat"));
		orderList.add(new Orders(111, "Watch", "Accessories", 55, 12.99, "January", 2020, "Lucknow"));
		orderList.add(new Orders(113, "MacBook", "Gadgets", 33, 17.99, "March", 2021, "Indore"));
		orderList.add(new Orders(112, "Screwdriver", "Tools", 22, 27.99, "February", 2015, "Patna"));
		orderList.add(new Orders(115, "Smartwatch", "Gadgets", 48, 49.99, "May", 2020, "Nagpur"));
		orderList.add(new Orders(114, "Headphones", "Electronics", 18, 22.99, "April", 2023, "Bhopal"));
		orderList.add(new Orders(110, "Smartphone", "Electronics", 60, 44.99, "March", 2020, "Jaipur"));;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohan", "root","Rohan@123");
		
		Statement stmt =con.createStatement();
		
		//create table
		String sqlCreate = "create table orders(id int, name varchar(50), category varchar(20), quantity int, price float, month varchar(10), year int, city varchar(20));";
		stmt.execute(sqlCreate);
		
		//insert into table
		orderList.forEach(order-> {
			try {
				stmt.execute("INSERT INTO orders VALUES("+order.getId()+", '"
						+order.getName()+"', '"+order.getCategory()+"', "
						+order.getQuantity()+", "+order.getPrice()+", '"
						+order.getMonth()+"', "+order.getYear()
						+", '"+order.getCity()+"');");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
		
		//viewing data
		String sqlGet = "select * from orders";
		ResultSet rs = stmt.executeQuery(sqlGet);		
		while(rs.next()) {		
		System.out.println("ID: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Category: "+rs.getString(3)+" Quantity: "+rs.getInt(4)+" Price: "+rs.getDouble(5)+" Month: "+rs.getString(6)+" Year:"+rs.getInt(7)+" City:"+rs.getString(8));
		}
		
		
		//delete operation
		
		
		//5. close the connection object
		con.close();
	}
}
