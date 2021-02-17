<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./bookser" method="post">
book name: <input type="text" name="bname"> <br><br>
author: <input type="text" name="bauthor"> <br><br>
description: <input type="textarea" name="bdesc"> <br><br>
price: <input type="text" name="bprice"> <br><br>
book url:<input type="text" name="burl"> <br><br>
<input type="submit" value="submit">
</form>
</body>
</html>