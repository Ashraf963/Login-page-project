<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<h1>Student Login Page</h1>
<body bgcolor="yellow">
<%
String msg=request.getParameter("msg");
if(msg!=null)
{
	%> 
	<%=msg%>
	<%
}
%>
<form action="./logser" method="get">
user name<input type="text" name="uname"/><br>
password<input type="password" name="pwd" /><br>
<input type="submit" value="login"/><br>
New user ?
<a href="reg.jsp"><font color="blue">click here</font></a>
</form>
</body>
</html>