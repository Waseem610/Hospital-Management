<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lightblue">
<% String userName=(String)request.getAttribute("userName"); %>
<center>
<h1 style="color: Red">Welcome <%=userName %></h1>
</center>
<a href="./createAccount">Add staff members</a> <br>
<a href="./delete" style="color: red"> Delete staff members</a><br>
<a href="./doctors">List of Doctors</a><br>
<a href="./reception">List of Receptionists</a><br>
<a href="./bookAppointment">Book Appointment</a><br>
<a href="./deleteAppointment">Cancel Appointment</a><br>


</body>
</html>