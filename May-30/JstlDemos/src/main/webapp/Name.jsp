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
	<jsp:useBean id="beanDao" class="com.java.jsp.NameBean" />
	<form method="get" action="Name.jsp">
		<center>
			First Name : 
			<input type="text" name="firstName" /> <Br/><br/>
			Last Name : 
			<input type="text" name="lastName" /> <Br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.firstName !=null && param.lastName !=null}">
		First Name : <b>
			<c:out value="${param.firstName}" />
		</b> <br/><br/>
		Last Name : <b>
			<c:out value="${param.lastName}" />
		</b> <br/><br/>
		<jsp:setProperty property="*" name="beanDao"/>
		<c:set var="fullName" value="${beanDao.fullName()}" />
		Full Name : 
		<b>
			<c:out value="${fullName}" />
		</b>
	</c:if>
</body>
</html>