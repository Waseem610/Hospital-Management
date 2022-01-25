<%@page import="com.te.hospitalManagement.dto.User_Info"%>
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
<% List<User_Info> list=(List<User_Info>)request.getAttribute("list"); %>
<h1>List Of Doctors</h1>
<h3><% for(User_Info info:list){ %>
Id : <%=info.getUserId()%> <br>
Name : <%=info.getUserName() %> <br>
ContactNumber : <%=info.getContactNumber() %>
<hr>
<%} %>
</h3>
</body>
</html>