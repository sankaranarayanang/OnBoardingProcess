<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../resources/stylesheets/bootstrap.min.css">
<script src="../resources/scripts/jquery.min.js"></script>
<script src="../resources/scripts/bootstrap.min.js"></script>
<title>OnboardingResources</title>
</head>
<body>
	<h2>Requester - Form</h2>
	<div class="container">
		<form:form method="POST" action="add">
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="empId">Employee Id(Cognizant)</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="empId" path="empId" placeholder="Enter EmployeeID"/>
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="empFullName">Employee Name</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="empFullName" path="empFullName" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="email">Email</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="email" path="email" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="firstName">First Name</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="firstName" path="firstName" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="lastName">Last Name</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="lastName" path="lastName" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="dateOfBirth">Date Of Birth</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="dateOfBirth" path="dateOfBirth" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="passportNo">Passport/ID Number *</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="passportNo" path="passportNo" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="teamName">Team Name *</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="teamName" path="teamName" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="projName">ProjectName</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="projName" path="projName" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="projId">Project Id</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="projId" path="projId" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="requester">Requester</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="requester" path="requester" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="processor">Processor</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="processor" path="processor" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="location">Location</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="location" path="location" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="startDate">Start Date</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="startDate" path="startDate" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-3">
					<form:label path="endDate">End Date</form:label>
				</div>
				<div class="col-md-4">
					<form:input class="form-control" name="endDate" path="endDate" />
				</div>
			</div>
			<input type = "submit" value = "Submit"/>
		</form:form>
	</div>

</body>

</html>