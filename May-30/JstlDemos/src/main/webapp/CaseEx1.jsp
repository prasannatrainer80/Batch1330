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
	<c:set var="sno" value="1" />
	<c:choose>
		<c:when test="${sno==1}">
			<c:out value="Hi I am Padma..." />
		</c:when>
		<c:when test="${sno==2}">
			<c:out value="Hi I am Chandra Sekhar..." />
		</c:when>
		<c:when test="${sno==3}">
			<c:out value="Hi I am Rajesh..." />
		</c:when>
		<c:when test="${sno==4}">
			<c:out value="Hi I am Likthith..." />
		</c:when>
		<c:otherwise>
			<c:out value="Invalid Choice..." />
		</c:otherwise>
	</c:choose>
</body>
</html>