<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="login">
		<table border="3" align="center">
			<tr>
				<th colspan="2">
					Login Page
				</th>
			</tr>
			<tr>
				<th>
					User Name 
				</th>
				<td>
					<input type="text" name="userName" /> <br/><br/>
				</td>
			</tr>
			<tr>
				<th>Password </th>
				<td>
					<input type="password" name="passCode" /> <br/><br/>
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="Login" />
				</th>
			</tr>
		</table>
	</form>
</body>
</html>