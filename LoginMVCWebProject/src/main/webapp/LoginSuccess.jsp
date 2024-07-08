<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime,com.demo.model.UserPojo" 
		 contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserPojo userPojo = (UserPojo)request.getAttribute("user-details");
%>
<h2>Welcome, <%= userPojo.getUserName() %> </h2>
<h3>Login Success!!</h3>
<%
	LocalDateTime serverDateTime = LocalDateTime.now();
	out.println("<h4>You have logged in at : " + serverDateTime + "</h4>");
%>
<p><a href="Login.html">Logout</a></p>
</body>
</html>