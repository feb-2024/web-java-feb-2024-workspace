<%@ page 
		language="java" 
		contentType="text/html; charset=ISO-8859-1"
    	pageEncoding="ISO-8859-1"
    	import="java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>message.jsp page is viewed...</h2>
<%
out.println("The date is : " + LocalDate.now());
%>
</body>
</html>