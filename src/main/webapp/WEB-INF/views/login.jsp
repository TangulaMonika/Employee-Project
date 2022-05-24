<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head> <title> Manuh Global Technologies</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">

</head>
<body>

<h1> Manuh Global Technologies </h1>
<p> Employee Sign In </p>
 		<p><c:out value="${error}"/></p>
 		
<form class="form" method ="post" name="form" action="/Manuh/LoginPage">
<div class= "container">
<!-- <button onclick="document.getElementById('id').style.display='none'"></button> -->
<div id="id">
<label for="sign In"><strong>Sign In : </strong></label>
<input type="text" name="Username" placeholder="Enter Username" required><br><br>
<label for="Password"><strong>Password : </strong></label>
<input type="password" name="Password" placeholder="Enter Password" required><br><br>
<label>
<input type="checkbox" checked="unchecked" placeholder="Remember"> Remember me
</label>
<br>
<br>
<input type="submit" value="Login"></input>
</div>
</div>
</form>
</body>
</html>