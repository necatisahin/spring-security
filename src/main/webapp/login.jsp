<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<div align="center">
	<h1>Login Page</h1>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	<form action ="/login" method="post">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name = "password"></td>
			</tr>
		</table>

		<input type = "submit" value="submit">
	</form>
</div>

</body>
</html>