<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<li><a href="index"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />

		<h1>Employee Details</h1>
		<form action="SearchEmployee">
			<input type="number" placeholder="Enter Employee Id " name="empId">
			<button class="logout" type="submit">Search</button>


			&nbsp;&nbsp;<a href="AddEmployee"><strong>Add Employee</strong></a>
		</form>
		</div>
	</ul>
	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee First Name</th>
			<th>Employee Last Name</th>
			<th>Phone</th>
			<th>Salary</th>
			<th>Email</th>
			<th>Employee Designation</th>
			<th>Active</th>
			<th>Date Of Join</th>
			<th>Date Of Relieving</th>
			<th>Edit</th>
			<th>Delete</th>
			<th>Add Project</th>
			<th>View Projects</th>
		</tr>


		<c:forEach items="${empList}" var="employee">


			<tr>
				<td><c:out value="${employee.empId}" /></td>
				<td><c:out value="${employee.empFirstname}" /></td>
				<td><c:out value="${employee.empLastname}" /></td>
				<td><c:out value="${employee.phone}" /></td>
				<td><c:out value="${employee.salary}" /></td>
				<td><c:out value="${employee.email}" /></td>
				<td><c:out value="${employee.empDesignation}" /></td>
				<td><c:out value="${employee.active}" /></td>
				<fmt:parseDate pattern="yyyy-MM-dd" value="${employee.dateOfJoin}"
					var="parsedDate" />
				
				<td><fmt:formatDate value="${parsedDate}" pattern="dd MMM,yyyy" /></td>
				<fmt:parseDate pattern="yyyy-MM-dd" value="${employee.dateOfRelieving}"
					var="parsed" />
				
				<td><fmt:formatDate value="${parsed}" pattern="dd MMM,yyyy" /></td>
				<td><a
					href="EditEmployee?empId=<c:out value="${employee.empId}" />">
						Edit</a></td>
				<td><a
					href="DeleteEmployee?empId=<c:out value="${employee.empId}" />">
						Delete</a></td>
				<td><a
					href="AddProject?empId=<c:out value='${employee.empId}'/>">Add
						Project</a></td>
				<td><a
					href="ViewProject?empId=<c:out value='${employee.empId}'/>">View</a></td>
			</tr>
		</c:forEach>

	</table>


	<br>
	<!-- <a href="index.jsp">
		<button type="submit">Add New Employee</button>
	</a>-->
</body>
</html>