<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Trainee</title>
</head>
<body>
	<h1>Delete Operation</h1>
	<form:form action="deleteTrainee" method="post"
		modelAttribute="trainee">
		<table>
			<tr>
				<td>Trainee ID</td>
				<td><form:input path="traineeId" /></td>
				<td><input type="submit" value="delete" /></td>
			</tr>
		</table>
	</form:form>

	<table>
		<tr>
			<td>Trainee ID</td>
			<td>Trainee Name</td>
			<td>Trainee domain</td>
			<td>Trainee Location</td>
		</tr>

		<tr>

			<td>${trainee.traineeId}</td>
			<td>${trainee.traineeName}</td>
			<td>${trainee.traineeDomain}</td>
			<td>${trainee.traineeLocation}</td>
			<%-- <td><a href="editEmployee?id=${trainee.TraineeId}">Edit</a></td> --%>
			<td><a href="deleteTrainee">delete</a>
		</tr>

	</table>
</body>
</html>