<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/style5.css">
<title>Edit Employee</title>
</head>
<body>
	<ul>
		<img src="/img/manuh.png">
		<li><a href="/Manuh/GetAllPro"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />
	</ul>
	<p>
		<c:out value="${error}" />
	</p>
	<a href="/Manuh/index"><button>Home</button></a>
	</div>
</body>
</html>