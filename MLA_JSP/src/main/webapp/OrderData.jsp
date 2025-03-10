<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- Bean is the object of class we are targeting -->
		
		<jsp:useBean id="obj" class ="com.test.Order"></jsp:useBean>		<!-- similar to Order obj = new Order(); -->
		
		 		
<%-- 		<jsp:setProperty property="id" name="obj"/>							<!-- similar to Order obj.setId; --> --%>
<%-- 		<jsp:setProperty property="name" name="obj"/>						<!-- similar to Order obj.setName; --> --%>
<%-- 		<jsp:setProperty property="desc" name="obj"/>						<!-- similar to Order obj.setDesc; --> --%>
<%-- 		<jsp:setProperty property="qnt" name="obj"/>						<!-- similar to Order obj.setQnt; --> --%>
		 
		<jsp:setProperty property="*" name="obj"/>								<!-- similar to prior 4 lines of code -->
		
		
		<jsp:getProperty property="id" name="obj"/>							<!-- similar to Order obj.getId; -->
		<jsp:getProperty property="name" name="obj"/>							<!-- similar to Order obj.getName; -->
		<jsp:getProperty property="desc" name="obj"/>							<!-- similar to Order obj.getDesc; -->
		<jsp:getProperty property="qnt" name="obj"/>							<!-- similar to Order obj.getQnt; -->
		
<%-- 		<jsp:forward page="home.jsp"></jsp:forward> --%>
		
		<jsp:include page="home.jsp"></jsp:include>
		
</body>
</html>