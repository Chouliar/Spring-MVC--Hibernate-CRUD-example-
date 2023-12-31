<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align= "center">
		<h1>Employee List</h1>
		<h3>
			<a href="newEmployee">New Employee</a>
		</h3>
		<table border="1">
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Department</th>
			<th>Contact</th>
			<th>Team</th>
			
			<c:forEach var="employee" items="${listEmployee}">
				<tr>
					<td>${employee.id}</td>
					<td>${employee.fname}</td>
					<td>${employee.lastname}</td>
					<td>${employee.department}</td>
					<td>${employee.contact}</td>
					<td>${employee.team}</td>
					<td><a href="editEmployee?id=${employee.id}">Edit</a>
						<a href="detailsEmployee?employeeId=${employee.id}">Details</a>
						<a href="deleteEmployee?id=${employee.id}">Delete</a>	
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>