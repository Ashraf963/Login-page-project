<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
<form action="regcon.jsp" method="post">
student id<input type="text" name="id"/><br>
student name<input type="text" name="name"/><br>
student username<input type="text" name="uname"/><br>
student password<input type="password" name="pwd"/><br>
<input type="submit" value="Register"/> <input type="reset"/><br>

</form>
</body>
</html>