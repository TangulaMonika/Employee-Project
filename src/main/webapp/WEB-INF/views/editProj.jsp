<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/style5.css">
<title>Edit Employee</title>
</head>
<body>
	<ul>
		<img src="/img/manuh.png">
		<li><a href="/Manuh/GetAllPro"><strong>BACK</strong></a></li>
		<!-- <li><a href="#Services" class="dropdown"><strong>SERVICES</strong></a></li>-->
		<li><a href="Logout"><strong>LOGOUT</strong></a></li>
		<jsp:include page="header.jsp" />
	</ul>
	<h1>Edit Employee:</h1>
	<div="main">
		<p class="error">
			<c:out value="${EmptyFileError}"></c:out>
		</p>
		<form:form action="/Manuh/EditProject" method="post"
			modelAttribute="project">
			<form:hidden path="empId" />
			<br>
			<form:hidden path="pId" />
			<br>
			<form:errors path="pName"></form:errors>
			<br>
			<form:label path="pName">Project Name:</form:label>
			<form:input path="pName" placeholder="pName" />
			<br>
			<form:errors path="startDate"></form:errors>
			<br>
			<form:label path="startDate">Start Date:</form:label>
			<form:input path="startDate" placeholder="startDate" />
			<br>
			<form:errors path="dueDate"></form:errors>
			<br>
			<form:label path="dueDate">Due Date:</form:label>
			<form:input path="dueDate" placeholder="dueDate" />
			<br>
			<form:errors path="projectManager"></form:errors>
			<br>
			<form:label path="projectManager">Project Manager</form:label>
			<form:input path="projectManager" placeholder="projectManager" />
			<br>
			<form:button>Submit</form:button>
			<br>
			<a href="<c:url value='/Manuh/GetAllPro'/>"><button type="button">Cancel</button></a>
		</form:form>
	</div>
</body>
</html>