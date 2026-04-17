<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>User Details</h2>
	<%
	String username = request.getParameter("un");
	String email = request.getParameter("ue");
	String add = request.getParameter("ua");
	String pwd = request.getParameter("up");
	%>
	
	<h3>Name : <%= username %></h3>
	<h3>Email : <%= email %></h3>
	<h3>address : <%= add %></h3>
	<h3>Password : <%= pwd %></h3>
	
	<hr>
	
	<h3>Name : <%= request.getParameter("un") %></h3>
	<h3>Email : <%= request.getParameter("ue") %></h3>
	<h3>address : <%= request.getParameter("ua") %></h3>
	<h3>Password : <%= request.getParameter("up") %></h3>

</body>
</html>