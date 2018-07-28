<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Trainee</title>
</head>
<body>
	<h3>Enter Trainee Details</h3>
	<table>
		<form:form action="addTraineeC" method="post" modelAttribute="trainee">

			<tr>
				<td>Trainee ID</td>
				<td><form:input path="traineeId" /></td>
			</tr>
			<tr>
				<td>Trainee Name</td>
				<td><form:input path="traineeName" /></td>
			</tr>
			<tr>
				<td>Trainee Domain</td>
				<td><form:select path="traineeDomain">
						<option>Please Select</option>
						<option value="JEE">JEE</option>
						<option value="Mobility">Mobility</option>
						<option value="BatchProcessing">BatchProcessing</option>
						<option value="SAP">SAP</option>
					</form:select></td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td><input type="radio" name="traineeLocation" value="Chennai">Chennai</td>
				<td><input type="radio" name="traineeLocation" value="Pune">Pune</td>
				<td><input type="radio" name="traineeLocation"
					value="Bangalore">Bangalore</td>
				<td><input type="radio" name="traineeLocation" value="Mumbai">Mumbai</td>

			</tr>
			<tr>
				<td><input type="submit" value="Add Trainee" /></td>
			</tr>

		</form:form>
	</table>
</body>
</html>