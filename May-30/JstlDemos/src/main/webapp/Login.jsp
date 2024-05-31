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
	<form method="get" action="Login.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passWord" /> <br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<c:if test="${param.userName !=null && param.passWord !=null}">
		<jsp:useBean id="beanDao" class="com.java.jsp.LoginBean" />
		<jsp:setProperty property="*" name="beanDao"/>
		<c:set var="status" value="${beanDao.validateMe()}" />
		<c:if test="${status==true}">
			<c:out value="Correct Credentials..." />
		</c:if>
		<c:if test="${status==false}">
			<c:out value="Invalid Credentials..." />
		</c:if>
	</c:if>
</body>
</html>