<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet" type="text/css" href="/css/style2.css">
</head>
<body>
	<ul>

		<img src="/img/manuh.png">
		<li><a href="/Manuh/Logout"><strong>LOGOUT</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="/Manuh/GetAllPro"><strong>GET ALL
					PROJECTS</strong></a></li>

		<li><a href="/Manuh/GetAll"><strong>GET ALL EMPLOYEES</strong></a></li>
		<jsp:include page="header.jsp" />
		<h1>Manuh Global Technologies</h1>
	</ul>
</body>
</html>