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
	<c:set var="sname" value="Chandra Sekhar" />
	Name is : <b>
		<c:out value="${sname}" />
	</b> <br/><br/>
	<c:set var="sno" value="1" /> 
	Student No : 
	<b>
		<c:out value="${sno}" />
	</b>
</body>
</html>