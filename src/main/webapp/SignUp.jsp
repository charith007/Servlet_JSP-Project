<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign UP</title>
<link rel="stylesheet" href="webproject.css">
</head>
<body>

<div class="topnav">
  <a class="active" href="index.html">Home</a>
  <a href="SignIn.jsp">Login</a>
</div>

<h1 align="center">Register Here</h1>

<div class="edit">
<form action="SignUPController" method="post">
  <label for="username">Username</label>
  <input type="text" name="username" placeholder="Enter Username" required><br>
  <label for="name">Name</label>
  <input type="text" name="name" placeholder="Enter Name" required><br>
  <label for="email">E-Mail ID</label>
  <input type="text" name="email" placeholder="Enter E-Mail ID" required><br>
  <label for="phnumber">Phone Number</label>
  <input type="text" name="phnumber" placeholder="Enter Phone Number" required><br>
  <label for="password">Password</label>
  <input type="password" name="password" placeholder="Enter Password" required><br>
  <input type="submit" value="Register">
</form>
</div>

</body>
</html>