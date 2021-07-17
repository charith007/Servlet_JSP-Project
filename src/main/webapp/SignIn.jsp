<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="webproject.css">
</head>
<body>

<div class="topnav">
  <a class="active" href="index.html">Home</a>
  <a href="SignUp.jsp">Sign UP</a>
</div>
<%
String s1="";
if(request.getAttribute("msg")!=null){
	s1=request.getAttribute("msg").toString();
}
%>
<h1 align="center">Login using your Account</h1>

<div class="edit">
<form action="SignINController" method="post">
<%= s1 %>
  <label for="username">Username</label>
  <input type="text" name="username" placeholder="Enter Username" required><br>
  <label for="password">Password</label>
  <input type="password" name="password" placeholder="Enter Password" required><br>
  <input type="submit" value="Login">
</form>
</div>

</body>
</html>