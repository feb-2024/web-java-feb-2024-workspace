<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/spring-web-mvc-login-project/validate-user" method="post">
	<h2>LOGIN FORM</h2>
	<div>
		Username : <input type="text" name="userName" placeholder="Enter username">
	</div>
	<div>
		Password : <input type="password" name="password" placeholder="Enter password">
	</div>
	<div>
		<button type="submit">LOGIN</button>
		<button type="reset">CLEAR</button>
	</div>
</form>
</body>
</html>