<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lightblue">
	<center>
	<h1 style=" color: Red">Registration</h1>
<form action="./register" method="post">
Username: <input type="text" name="userName" placeholder="Username"><br><br>
Designation:<input type="text" name="designation" placeholder="Designation"><br> <br> 
Password:<input type="password" name="password" placeholder="Password"><br><br> 
ContactNo:<input type="number" name="contactNumber" placeholder="ContactNo"><br> <br> 
<input type="submit" value="SignUp">
</form>
</center>
</body>
</html>