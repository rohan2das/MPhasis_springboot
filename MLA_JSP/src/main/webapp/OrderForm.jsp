<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Order details</h1>
		<form action="OrderData.jsp">
		Enter OrderId: <input type= "text" name ="id"><br><br>
		Enter OrderName: <input type = "text" name = "name"><br><br>
		Enter OrderDescription: <input type = "text" name = "desc"><br><br>
		Enter OrderQuantity: <input type = "text" name = "qnt"><br><br>
			<input type= "submit" value="send">
		</form>
</body>
</html>