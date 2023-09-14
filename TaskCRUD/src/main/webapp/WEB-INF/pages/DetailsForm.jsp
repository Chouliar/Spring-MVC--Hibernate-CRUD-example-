<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Details of Employee</title>
</head>
<body>
	<div align= "center">
		<h1>Employee's Personal Info</h1>
		<table border="1">
			<th>ID</th>
			<th>Salary</th>
			<th>Date of Birth</th>
			<th>Date of Hire</th>
			<th>Home Address</th>
			<th>Phone Number</th>
			<th>Gender</th>
			<tr>
				<td>${details.employeeId}</td>
				<td>${details.salary}</td>
				<td>${details.dateofbirth}</td>
				<td>${details.dateofhire}</td>
				<td>${details.address}</td>
				<td>${details.phonenumber}</td>
				<td>${details.gender}</td>
				
				<td><a href="addInfo?employeeId=${details.employeeId}">Add</a>
					<a href="editInfo?employeeId=${details.employeeId}">Edit</a>
					<a href="deleteInfo?employeeId=${details.employeeId}">Delete</a>	
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
