<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Voting.jsp">
		<center>
			Age : 
			<input type="number" name="age" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.age >= 18}">
		<c:out value="You can vote..." />
	</c:if>
	<c:if test="${param.age < 18}">
		<c:out value="You are not Elligible for Voting..." />
	</c:if>
</body>
</html>