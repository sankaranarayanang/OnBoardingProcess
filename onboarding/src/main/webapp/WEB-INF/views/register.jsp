<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="./resources/stylesheets/bootstrap.min.css">
<script
	src="./resources/scripts/jquery.min.js"></script>
<script
	src="./resources/scripts/bootstrap.min.js"></script>

<title>OnboardingResources</title>
</head>
<body>
	<h2>Requester - Form</h2>
	<div class="container">
		<form:form method="POST" action="add">
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="empId">Emp ID</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="empid" path="empId" />
				</div>
			</div>
			<input type = "submit" value = "Submit"/>
		</form:form>
	</div>

</body>

</html>