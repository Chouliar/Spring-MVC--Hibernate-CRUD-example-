<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Details</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Details</h1>
        <form:form action="saveDetails" method="post" modelAttribute="details">
        <table>
        	<tr>
            	<td><form:hidden path="employeeId"/></td>
            <tr>
                <td>Salary:</td>
                <td><form:input path="salary" /></td>
            </tr>
            <tr>
                <td>Date of Birth:</td>
                <td><form:input path="dateofbirth" /></td>
            </tr>
            <tr>
                <td>Date of Hire:</td>
                <td><form:input path="dateofhire" /></td>
            </tr>
            <tr>
                <td>Home Address:</td>
                <td><form:input path="address" /></td>
            </tr>
			<tr>
                <td>Phone Number:</td>
                <td><form:input path="phonenumber" /></td>
            </tr>            

            <tr>
                <td>Gender:</td>
                <td><form:input path="gender" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>