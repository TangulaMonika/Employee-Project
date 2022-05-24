<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Employee</title>
<link rel="stylesheet" type="text/css" href="/css/style5.css">
</head>
<body>
	<ul>
		<img src="/img/manuh.png">
		<li><a href="GetAll"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />

		<h1>Employee Details</h1>
		
		</div>
	</ul>
	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee Firstname</th>
			<th>Employee Lastname</th>
			<th>Phone</th>
			<th>Salary</th>
			<th>Email</th>
			<th>Employee Designation</th>
			<th>Active</th>
			<th>Date Of Join</th>
			<th>Date Of Relieving</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<tr>
			<td><c:out value="${SearchEmployee.empId}" /></td>
			<td><c:out value="${SearchEmployee.empFirstname}" /></td>
			<td><c:out value="${SearchEmployee.empLastname}" /></td>
			<td><c:out value="${SearchEmployee.phone}" /></td>
			<td><c:out value="${SearchEmployee.salary}" /></td>
			<td><c:out value="${SearchEmployee.email}" /></td>
			<td><c:out value="${SearchEmployee.empDesignation}" /></td>
			<td><c:out value="${SearchEmployee.active}" /></td>
			<td><c:out value="${SearchEmployee.dateOfJoin}" /></td>
			<td><c:out value="${SearchEmployee.dateOfRelieving}" /></td>
			<td><a
				href="EditEmployee?empId=<c:out value="${SearchEmployee.empId}" />">
					Edit</a></td>
			<td><a
				href="DeleteEmployee?empId=<c:out value="${SearchEmployee.empId}" />">
					Delete</a></td>

		</tr>


	</table>


	<br>
	<!-- <a href="index.jsp">
		<button type="submit">Add New Employee</button>-->
	</a>
</body>
</html>