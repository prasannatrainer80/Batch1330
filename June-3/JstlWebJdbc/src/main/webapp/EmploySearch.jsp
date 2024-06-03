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
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <Br/><br/>
			<input type="submit" value="Search" /> <br/><hr/>
		</center>
	</form>
	<c:if test="${param.empno!=null}">
		<c:set var="empno" value="${param.empno}" />
		<sql:setDataSource var="conn"
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/sonixpractice"
		user="root"
		password="root"
	 	/>
	 	<sql:query var="employQuery" dataSource="${conn}">
	 		select * from Employ where empno = ?
	 		<sql:param value="${empno}" />
	 	</sql:query>
	 	<c:set var="flag" value="0" />
	 	<c:forEach var="employ" items="${employQuery.rows}">
	 		Employ No : 
	 		<c:out value="${employ.empno}" /> <br/><br/>
	 		Employ Name : 
	 		<c:out value="${employ.name}" /> <br/><br/>
	 		Gender : 
	 		<c:out value="${employ.gender}" /> <br/><br/>
	 		Department : 
	 		<c:out value="${employ.dept}" /> <br/><br/>
	 		Designation : 
	 		<c:out value="${employ.desig}" /> <br/><br/>
	 		Basic : 
	 		<c:out value="${employ.basic}" /> <br/><hr/>
	 		<c:set var="flag" value="1" />
	 	</c:forEach>
	 	<c:if test="${flag==0}">
	 		<c:out value="*** Record Not Found ***" />
	 	</c:if>
	</c:if>
</body>
</html>