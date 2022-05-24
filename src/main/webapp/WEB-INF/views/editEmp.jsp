<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/style5.css">
<title>Update Employee</title>
</head>
<body>
	<ul>
		<img src="/img/manuh.png">
		<li><a href="GetAll"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />
	</ul>
	<h1>Edit Employee:</h1>
	<div="form-center">
		<p class="error">
			<c:out value="${EmptyFileError}"></c:out>
		</p>
		<form name="Employee Details" method="post" action="EditEmployee">

			<label> Employee Id: </label> <input type="text" name="empId"
				placeholder="empId" value='<c:out value="${emp.empId}" />'>
			<br> <br> <label> Emp First Name: </label> <input
				type="text" name="empFirstname" placeholder="empFirstName"
				value='<c:out value="${emp.empFirstname}" />'><br> <br>
			<label> emp Last Name: </label> <input type="text" name="empLastname"
				placeholder="empLastName"
				value='<c:out value="${emp.empLastname}" />'><br> <br>
			<label> Phone : </label> <input type="text" name="phone"
				placeholder="phone" value='<c:out value="${emp.phone}" />' /> <br>
			<br> <label> Salary: </label> <input type="number" name="salary"
				placeholder="salary" value='<c:out value="${emp.salary}" />'><br>
			<br> <label>Email: </label> <input type="text" name="email"
				placeholder="email" value='<c:out value="${emp.email}" />'><br>
			<br> <label>Date Of Join: </label> <input type="date"
				name="dateOfJoin" placeholder="Date Of Join"
				value='<c:out value="${emp.dateOfJoin}" />'><br> <br>
			<label> emp Designation: </label> <input type="text"
				name="empDesignation" placeholder="empDesignation"
				value='<c:out value="${emp.empDesignation}" />'><br> <br>
			<label> Active: </label> <input type="checkbox" name="active"
				value="true" value='<c:out value="${emp.active}" />'> Yes <input
				type="checkbox" name="active" value="false"
				value='<c:out value="${emp.active}" />'> No <br> <br>
			<label> Date Of Relieving: </label> <input type="Date"
				name="dateOfRelieving" placeholder="Date Of Relieving"
				value='<c:out value="${emp.dateOfRelieving}" />'><br> <br>

			<a href="GetAll"><button type="button">Back</button></a> <a
				href="GetAll"><button type="submit">Submit</button></a>
		</form>
	</div>
</body>
</html>