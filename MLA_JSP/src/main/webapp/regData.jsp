<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- scriplet tag -->
		
		<%	
			String urlMySql = "jdbc:mysql://localhost:3306/rohan";
			String username="root";
			String password = "root@39";
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(urlMySql, username, password);
				
				String sql = "insert into user_mla (mla_fname, mla_user, mla_pass) values(?,?,?)";
				PreparedStatement pst = con.prepareStatement(sql);
				
				String fname = request.getParameter("fname");
				String user = request.getParameter("user");
				String pass = request.getParameter("pwd");
				
				pst.setString(1, fname);
				pst.setString(2, user);
				pst.setString(3, pass);
				pst.execute();
				
				out.println("stored used data in db");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		%>
</body>
</html>