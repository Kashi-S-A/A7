<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSTL Tag Library</h1>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="myTag"%>

	<myTag:set var="a" value="10"></myTag:set>

	<h1 style="color: green">
		a =
		<myTag:out value="${a}"></myTag:out>
	</h1>

	<myTag:if test="${ a%2==0 }"> The number is even</myTag:if>

	<hr>

	<myTag:choose>
		<myTag:when test="${ a > 100 }"> value of a is greater than 100 </myTag:when>
		<myTag:when test="${ a < 100 }"> value of a is less than 100 </myTag:when>
		<myTag:otherwise> value of a is equal 100 </myTag:otherwise>
	</myTag:choose>

	<myTag:remove var="a" />

	<h1 style="color: green">
		a =
		<myTag:out value="${a}"></myTag:out>
	</h1>

	<%-- <myTag:import url="https://www.google.com/"></myTag:import> --%>

	<%-- <myTag:redirect url="https://www.naukri.com/"></myTag:redirect> --%>

</body>
</html>