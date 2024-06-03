<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="EmployUpdate.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <Br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <Br/><br/>
			Gender : 
			<input type="text" name="gender" /> <Br/><br/>
			Department : 
			<input type="text" name="dept" /> <Br/><Br/>
			Designation : 
			<input type="text" name="desig" /> <Br/><br/>
			Basic : 
			<input type="number" name="basic" /> <br/><Br/>
			<input type="submit" value="Update" /> <br/><br/>
		</center>
	</form>
	<c:if test="${param.empno!=null && param.basic !=null}">
		<sql:setDataSource var="conn"
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/sonixpractice"
		user="root"
		password="root"
	 	/>
	 	<sql:update var="employUpdate" dataSource="${conn}">
	 		Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? Where Empno = ?
	 		<sql:param value="${param.name}" />
	 		<sql:param value="${param.gender}" />
	 		<sql:param value="${param.dept}" />
	 		<sql:param value="${param.desig}" />
	 		<sql:param value="${param.basic}" />
	 		<sql:param value="${param.empno}" />
	 	</sql:update>
	 	<c:out value="Record Updated..." />
	</c:if>
</body>
</html>