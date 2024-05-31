<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="sno" value="-1" />
	<c:if test="${sno >=0}">
		<c:out value="Positive Number..." />
	</c:if>
	<c:if test="${sno < 0}">
		<c:out value="Negagive Number..." />
	</c:if>
</body>
</html>