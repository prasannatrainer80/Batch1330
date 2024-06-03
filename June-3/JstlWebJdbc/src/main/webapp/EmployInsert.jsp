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
	<form method="get" action="EmployInsert.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/>
			Gender : 
			<select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select> <br/><br/>
			Department : 
			<select name="dept">
				<option value="Dotnet">Dotnet</option>
				<option value="Java">Java</option>
				<option value="Sql">Sql</option>
			</select> <br/><br/>
			Designation : 
			<select name="desig">
				<option value="Junior">Junior</option>
				<option value="Senior">Senior</option>
				<option value="Head">Head</option>
			</select> <br/><br/>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Insert" />
		</center>
	</form>
	<c:if test="${param.empno!=null && param.basic!=null}">
		<sql:setDataSource var="conn"
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/sonixpractice"
		user="root"
		password="root"
	 	/>
	 	<sql:update var="employUpdate" dataSource="${conn}">
	 		Insert into Employ(empno,name,gender,dept,desig,basic) 
	 				values(?,?,?,?,?,?)
	 		<sql:param value="${param.empno}" />
	 		<sql:param value="${param.name}" />
	 		<sql:param value="${param.gender}" />
	 		<sql:param value="${param.dept}" />
	 		<sql:param value="${param.desig}" />
	 		<sql:param value="${param.basic}" />
	 	</sql:update>
	 	<c:out value="Record Inserted..." />
	</c:if>
</body>
</html>
