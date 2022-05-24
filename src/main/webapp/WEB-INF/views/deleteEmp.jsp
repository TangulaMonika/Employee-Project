<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<ul>
		<a href="login.jsp"><img src="/img/manuh.png"></a>
		<li><a href="index.jsp"><strong>BACK</strong></a></li>
		<li><a href="#About"><strong>ABOUT</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<div class="dropdown">
			<a class="dropbtn"><strong>SERVICES</strong></a>
			<div class="dropdown-content">
				<a href="getEmp.html">Get Employee</a> <a href="addEmp.jsp">Add
					Employee</a> <a href="GetAll">Get All EmployeeDetails</a> <a
					href="Topn.html">Top N Employee</a>
			</div>
		</div>
		<li><a href="login.jsp"><strong>HOME</strong></a></li>
		<h1>Manuh Global Technologies</h1>
	</ul>


</body>
</html>