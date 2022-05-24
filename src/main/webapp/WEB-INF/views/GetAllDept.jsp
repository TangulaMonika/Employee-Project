<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Departments</title>
<link rel="stylesheet" type="text/css" href="/css/style5.css">
</head>
<body>
	<ul>
		<img src="manuh.png">
		<li><a href="index.jsp"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />

		<h1>GET ALL DEPARTMENTS</h1>
		<div class="container">
			<strong>Search:</strong><input type="text"><a href="search.jsp"></a>
			<a href="AddDepartment"><strong>Add Department</strong></a>
		</div>
	</ul>
	<table>
		<tr>
			<th>Dept Name</th>
			<th>Hod</th>
			<th>Project</th>
			<th>Dept Id</th>
			<th>Working Hours</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>


		<c:forEach items="${deptList}" var="department">


			<tr>
				<td><c:out value="${department.deptName}" /></td>
				<td><c:out value="${department.hod}" /></td>
				<td><c:out value="${department.project}" /></td>
				<td><c:out value="${department.deptId}" /></td>
				<td><c:out value="${department.workingHours}" /></td>

				<td><a
					href="EditEmployee?deptId=<c:out value="${department.deptId}" />">
						Edit</a></td>
				<td><a
					href="DeleteEmployee?deptId=<c:out value="${department.deptId}" />">
						Delete</a></td>

			</tr>
		</c:forEach>

	</table>


	<br>
	<!-- <a href="index.jsp">
		<button type="submit">Add New Employee</button>-->
	</a>
</body>
</html>