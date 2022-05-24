<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Projects</title>
<link rel="stylesheet" type="text/css" href="/css/style5.css">
</head>
<body>
	<ul>
		<img src="/img/manuh.png">
		<li><a href="/Manuh/index"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />

		<h1>GET ALL Projects</h1>
		<div class="container"></div>
	</ul>
	<table>
		<tr>
			<th>Employee Id</th>
			<th>Project Id</th>
			<th>Project Name</th>
			<th>Start Date</th>
			<th>Due Date</th>
			<th>Project Manager</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>


		<c:forEach items="${projList}" var="project">


			<tr>
				<td><c:out value="${project.empId}" /></td>
				<td><c:out value="${project.pId}" /></td>
				<td><c:out value="${project.pName}" /></td>
				<td><fmt:formatDate value="${project.startDate}" pattern="dd MMM,yyyy" /></td>
				<td><fmt:formatDate value="${project.dueDate}" pattern="dd MMM,yyyy" /></td>
				<td><c:out value="${project.projectManager}" /></td>

				<td><a href="EditProject?pId=<c:out value="${project.pId}" />">
						Edit</a></td>
				<td><a
					href="DeleteProject?pId=<c:out value="${project.pId}" />">
						Delete</a></td>

			</tr>
		</c:forEach>

	</table>


	<br>
	<!-- <a href="index.jsp">
		<button type="submit">Add New Employee</button>
	</a>-->
</body>
</html>