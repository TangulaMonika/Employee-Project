<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Manuh Technologies</title>
<link rel="stylesheet" type="text/css" href="/css/style5.css">
<script type="text/javascript" src="script.js"></script>
</head>
<body>
	<ul>
		<img src="/img/manuh.png">
		<li><a href="GetAll"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />
	</ul>
	<h1>
		<strong>Add Employee Details </strong>
	</h1>
	<br>
	<div="form-center">
		<form name="Employee Details" method="post" action="AddEmployee">
			<p class="error">
				<c:out value="${EmptyFileError}"></c:out>
			</p>
			<br> <br> <label> Employee First Name: </label> <input
				type="text" name="empFirstname"
				placeholder="Enter Employee First Name"
				pattern="[a-zA-Z][a-zA-Z ]{2,}" title="Please enter only alphabets"
				value='<c:out value="${employee.empFirstname}" />'><br>
			<br> <label> Employee Last Name: </label> <input type="text"
				name="empLastname" placeholder="Enter Employee Last Name"
				pattern="[a-zA-Z][a-zA-Z ]{2,}" title="Please enter only alphabets"
				value='<c:out value="${employee.empLastname}"/>'><br> <br>
			<label> Phone : </label> <input type="text" name="phone"
				placeholder="Enter Phone Number"
				value='<c:out value="${employee.phone}"/>'> <br> <br>
			<label> Salary: </label> <input type="number" name="salary"
				placeholder="Enter Salary"
				value='<c:out value="${employee.salary}"/>'><br> <br>
			<label> Email: </label> <input type="text" name="email"
				placeholder="Enter E-mail"
				value='<c:out value="${employee.email}"/>'><br> <br>
			<label> Date Of Join: </label> <input type="Date" name="dateOfJoin"
				placeholder="Date Of Join"
				value='<c:out value="${employee.dateOfJoin}"/>'><br> <br>
			<label> Employee Designation: </label> <input type="text"
				name="empDesignation" placeholder="Enter Employee Designation"
				value='<c:out value="${employee.empDesignation}"/>'><br>
			<br> <label> Active: </label> <input type="checkbox"
				name="active" value="true"
				value='<c:out value="${employee.active}"/>'>Yes <input
				type="checkbox" name="active" value="false"
				value='<c:out value="${employee.active}"/>'>No <br> <br>
			<label> Date Of Relieving: </label> <input type="Date"
				name="dateOfRelieving" placeholder="Date Of Relieving"
				value='<c:out value="${employee.dateOfRelieving}"/>'><br>
			<br> <a href="GetAll"><button type="button">Cancel</button></a>
			<button type="submit">Submit</button>
		</form>

	</div>
</body>
</html>