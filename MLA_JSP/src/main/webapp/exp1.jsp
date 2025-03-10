<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tags</title>
</head>
<body>
		<!-- declaration tag -->
		
		<%!
			int x =10;
			int y =20;
			public int add(){
				return x+y;
			}
		%>
		
		
		<!-- expression tag -->
		expression tag <%= add() %>
		
		
		<!-- scriplet tag -->
		<br><br><br>
		<% 
			out.println("scrpilet tag "+add());
			out.println("<br><br> current system date: "+new Date());
		
		%>
		
</body>
</html>