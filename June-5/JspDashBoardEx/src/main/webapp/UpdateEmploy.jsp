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
	<jsp:useBean id="beanDao" class="com.java.emp.EmployDaoImpl" />
	<c:set var="employFound" value="${beanDao.searchEmployDao(param.empno)}" />
	<form method="get" action="UpdateEmploy.jsp">
		<center>
			Employ No :
			<input type="number" name="empno" value="${employFound.empno}" /> <Br/><br/>
			Employ Name :
			<input type="text" name="name" value="${employFound.name}" /> <Br/><br/>
			Gender : 
			<input type="text" name="gender" value="${employFound.gender}" /> <Br/><br/>
			Department : 
			<input type="text" name="dept" value="${employFound.dept}" /> <Br/><br/>
			Designation : 
			<input type="text" name="desig" value="${employFound.desig}" /> <Br/><br/>
			Basic : 
			<input type="number" name="basic" value="${employFound.basic}" /> <Br/><br/>
			<input type="submit" value="Update" />			
		</center>
	</form>
	<c:if test="${param.empno !=null && param.basic !=null}">
		<jsp:useBean id="beanEmployUpdated" class="com.java.emp.Employ" />
		<jsp:setProperty property="*" name="beanEmployUpdated"/>
		<c:out value="${beanDao.updateEmploy(beanEmployUpdated)}" />
		<jsp:forward page="EmployShow.jsp" />
	</c:if>
</body>
</html>