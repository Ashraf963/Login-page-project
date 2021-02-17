<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conform??</title>
</head>
<h1>Conform??</h1>
<body>
<%
String msg=request.getParameter("msg");
if(msg!=null)
{
	%>
	<%=msg%>
	<%
}
%>
<form action="./regser" method="post">
student id : <%=request.getParameter("id")%><input type="hidden" name="id" value="<%=request.getParameter("id")%>"><br>
student name :<%=request.getParameter("name")%><input type="hidden" name="name" value="<%=request.getParameter("name")%>"><br/>
student username : <%=request.getParameter("uname")%><input type="hidden" name="uname" value="<%=request.getParameter("uname")%>"><br/>
student password :<%=request.getParameter("pwd")%><input type="hidden" name="pwd" value="<%=request.getParameter("pwd")%>"/><br/>
<input type="submit" value="Conform"/><input type="reset"/><br>
</form>
</body>
</html>