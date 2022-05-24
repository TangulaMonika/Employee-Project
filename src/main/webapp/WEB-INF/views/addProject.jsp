<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Manuh Technologies</title>
<link rel="stylesheet" type="text/css" href="/css/style5.css">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<div="main">
		<form:form action="/Manuh/AddProject" method="post"
			modelAttribute="project">
			<form:hidden path="empId" value="${empId}" />
			<br>
			<form:hidden path="pId" />
			<br>
			<form:errors path="pName"></form:errors>
			<br>
			<form:label path="pName">Project Name:</form:label>
			<form:input path="pName" placeholder="Enter Project Name" />
			<br>
			<form:errors path="startDate"></form:errors>
			<br>
			<form:label path="startDate">Start Date:</form:label>
			<form:input path="startDate" placeholder="startDate" type="date" />
			<br>
			<form:errors path="dueDate"></form:errors>
			<br>
			<form:label path="dueDate">Due Date</form:label>
			<form:input path="dueDate" placeholder="dueDate" type="date" />
			<br>
			<form:errors path="projectManager"></form:errors>
			<br>
			<form:label path="projectManager">Project Manager:</form:label>
			<form:input path="projectManager" placeholder="Enter Project Manager" />
			<br>
			<form:button>Submit</form:button>
			<br>
			<a href="<c:url value='/Manuh/GetAllPro'/>"><button type="button">Cancel</button></a>
		</form:form>


	</div>


</body>
</html>