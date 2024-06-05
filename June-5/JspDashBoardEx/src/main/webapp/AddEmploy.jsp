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
<form method="get" action="AddEmploy.jsp">
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
	<c:if test="${param.empno !=null && param.basic !=null}">
		<jsp:useBean id="beanDao" class="com.java.emp.EmployDaoImpl" />
		<jsp:useBean id="beanEmploy" class="com.java.emp.Employ" />
		<jsp:setProperty property="*" name="beanEmploy"/>
		<c:out value="${beanDao.addEmploy(beanEmploy)}" />
		<jsp:forward page="EmployShow.jsp" />
	</c:if>
</body>
</html>