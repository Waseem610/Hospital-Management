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
<h1>Appointment Booking</h1>
<form action="./bookAppointment" method="post">
Name : <input type="text" name="patientName" placeholder="Patient Name" required="required"> <br> <br>
Doctor : <input type="text" name="doctor" placeholder="Doctor's Name" required="required"><br><br>
ContactNo : <input type="number" name="contactNo" placeholder="ContactNo" required="required"><br><br>
Date of Appointment: <input type="date" name="date" placeholder="date" required="required"><br><br>
<input type="submit" value="Book">
</form>
</center>
</body>
</html>