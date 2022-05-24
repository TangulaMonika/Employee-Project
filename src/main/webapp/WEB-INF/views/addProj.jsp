
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<li><a href="/Manuh/GetAll"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />
	</ul>
	<h1>
		<strong>Add Project </strong>
	</h1>
	<br>
	<div="form-center">
		<form name="Add Project" method="post" action="AddProject">
			<p class="error">
				<c:out value="${EmptyFileError}"></c:out>
			</p>
			<input type="hidden" name="empId" placeholder="empId"
				value='<c:out value="${empId}"/>'> <br> <br> <input
				type="hidden" name="pId" placeholder="Enter Project Id"
				value='<c:out value="${project.pId}"/>'><br> <br>
			<label>Project Name:</label> <input type="text" name="pName"
				placeholder="Enter Project Name"
				value='<c:out value="${project.pName}"/>'><br> <br>
			<label>Start Date: </label> <input type="text" name="startDate"
				placeholder="Enter Start Date"
				value='<c:out value="${project.startDate}"/>'> <br> <br>
			<label> Due Date: </label> <input type="text" name="dueDate"
				placeholder="Enter Due Date"
				value='<c:out value="${project.dueDate}"/>'><br> <br>
			<label>Project Manager: </label> <input type="text"
				name="projectManager" placeholder="Enter Project Manager"
				value='<c:out value="${project.projectManager}"/>'><br>
			<br> <a href="GetAll"><button type="button">Cancel</button></a>
			<button type="submit">Submit</button>
		</form>
	</div>

</body>
</html>