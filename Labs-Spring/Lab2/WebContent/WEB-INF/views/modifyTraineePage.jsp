<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Trainee</title>
</head>
<body>
	<h1>Modify Operation</h1>
	<form:form action="modifyTraineeC" method="post"
		modelAttribute="trainee">
		<table>
			<tr>
				<td>Trainee ID</td>
				<td><form:input path="traineeId" /></td>
				<td><input type="submit" value="modify" /></td>
			</tr>
		</table>
	</form:form>

	<c:if test="${ trainee.traineeId !=0}">
	<form:form action="update" method="post" modelAttribute="trainee">
		<h4>Trainee Info</h4>
		<table border="2">
			<tr>
				<td>Trainee Id</td>
				<td><form:input path="traineeId" value="${ trainee.traineeId }" /></td>
			</tr>
			<tr>
				<td>Trainee Name</td>
				<td><form:input path="traineeName"
						value="${ trainee.traineeName }" /></td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td><form:input path="traineeLocation"
						value="${ trainee.traineeLocation }" /></td>
			</tr>
			<tr>
				<td>Trainee Domain</td>
				<td><form:input path="traineeDomain"
						value="${ trainee.traineeDomain }" /></td>
			</tr>
			<tr>
				<td colspan="2" align="left"><input type="submit"
					value="update"></td>
			</tr>
		</table>
	</form:form>
	</c:if>
</body>
</html>