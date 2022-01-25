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
<h1>Edit Appointment</h1>
<form action="./editAppointment" method="post">
Id : <input type="number" name="id" placeholder="Id" required="required"> <br> <br>
Name : <input type="text" name="patientName" placeholder="Patient Name" > <br> <br>
Doctor's Name : <input type="text" name="doctor" placeholder="Doctor's Name" ><br><br>
ContactNo : <input type="number" name="contactNo" placeholder="ContactNo" ><br><br>
Date of Appointment: <input type="date" name="date" placeholder="date" ><br><br>
<input type="submit" value="Edit">
</form>
</center>
</body>
</html>