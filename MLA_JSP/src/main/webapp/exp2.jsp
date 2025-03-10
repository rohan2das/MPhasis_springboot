<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exp2</title>
</head>
<body>
	<!-- error redirecting -->

	<%
		out.println(10 / 0);
	%>
</body>
</html>