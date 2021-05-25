<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP and Servlet!</h1>
	<form action="helloServlet" method="post">
    Enter your name: <input type="text" name="yourName" size="20">
    Enter your age: <input type="text" name="yourAge" size="10"><br>
    <input type="submit" value="Call Servlet" />
</form>
</body>
</html>