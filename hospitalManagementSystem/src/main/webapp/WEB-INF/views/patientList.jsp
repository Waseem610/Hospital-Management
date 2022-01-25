<%@page import="com.te.hospitalManagement.dto.Appointment_Info"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lightblue">
<h1 style="color: red">Patients List</h1>
<% List<Appointment_Info> list=(List<Appointment_Info>)request.getAttribute("list"); %>
<%for(Appointment_Info info:list){ %>
<h3>Patient Id : <%=info.getId() %></h3>
<h3>Patient Name : <%=info.getPatientName() %></h3>
<hr>
<%} %>
</body>
</html>