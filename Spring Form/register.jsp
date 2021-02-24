<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="get">
       	
       	<input type="text" name="name"  placeholder="Enter Your Full Name" >
       	<br><br>
       	<input type="Email" name="email"  placeholder="Enter Your E-Mail (someone@domain.com)" >
       	<br><br>
       	<input type="Password" name="pwd"  placeholder="Create Your Password" >
       	<br><br>
       	<h6>Gender<h6>
       	<input type="radio" name="gen" style="width: 5%;border-color:#69b6ff;">Male&nbsp;&nbsp;
       	<input type="radio" name="gen" style="width: 5%;border-color:#69b6ff;">Female&nbsp;&nbsp;
       	<input type="radio" name="gen" style="width: 5%;border-color:#69b6ff;">Other&nbsp;&nbsp;
       	<br><br><br>
       	<input type="submit" value="Register" >
       	<br>
       	
       </form>
</body>
</html>