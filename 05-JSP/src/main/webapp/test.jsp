<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Welcome to JSP tags -->
	<!-- Declaration Tag -->
	<%!int a = 10;

	public String getMsg() {
		double b = 20.5;//local variable
		return "Hello ";
	}%>
	<!-- Expression Tag -->
	<%=a%>
	<hr>
	<%=getMsg()%>
	<!-- Scriptlet Tag -->
	<%
	String c = "Hello";
	%>
</body>
</html>