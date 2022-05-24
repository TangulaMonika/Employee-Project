<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head> <title> Manuh Technologies</title>

<link rel="stylesheet" type="text/css" href="/css/style1.css">
</head>
<body>
<h1><strong>Employee Sign Up Form</strong></h1> <br>
<form name = "SignUp" onsubmit="return message()">
<div="container">
Emp First Name:
</label>
<input type="text" name="empFirstName" placeholder="empFirstName"><br>
<br>
<label>
emp Last Name:
</label>
<input type="text" name="empLastName" placeholder="empLastName"><br>
<br>
<label>   
Phone :  
</label>  
<input type="text" name="country code"  value="+91" size="2"/>   
<input type="text" name="phone" size="10"/> <br>
<br>
<label>
Email:
</label>
<input type="text" id="email" placeholder="email"><br>
<br>
<label>
<br>
<a href="firstwebpage.html" target="_self"><button type="button"> Back </button></a>
<button type="submit">Submit</button>
</form>
</div>
</body>
</html>