<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Manuh Technologies</title>
<link rel="stylesheet" type="text/css" href="style5.css">
<script type="text/javascript" src="script.js"></script>
</head>
<body>
	<ul>
		<img src="manuh.png">
		<li><a href="GetAllDept"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />
	</ul>
	<h1>
		<strong>Add Department </strong>
	</h1>
	<br>
	<div="form-center">
		<form name="Add Department" method="post" action="AddDepartment">
			<p class="error">
				<c:out value="${EmptyFileError}"></c:out>
			</p>
			<input type="hidden" name="deptId" placeholder="deptId"> <br>
			<br> <label>Department Name: </label> <input type="text"
				name="deptName" placeholder="deptName"
				value='<c:out value="${dept.deptName}"/>'><br> <br>
			<label>HOD:</label> <input type="text" name="hod" placeholder="hod"
				value='<c:out value="${dept.hod}"/>'><br> <br> <label>Project:
			</label> <input type="text" name="project" placeholder="project"
				value='<c:out value="${dept.project}"/>'> <br> <br>
			<label> Dept Id: </label> <input type="number" name="deptId"
				placeholder="deptId" value='<c:out value="${dept.deptId}"/>'><br>
			<br> <label>Working Hours: </label> <input type="text"
				name="workingHours" placeholder="workingHours"
				value='<c:out value="${dept.workingHours}"/>'><br> <br>
			<a href="GetAllDept"><button type="button">Cancel</button></a> <a
				href="GetAllDept"><button type="submit">Submit</button></a>

	</form>
	</div>
</body>
</html>