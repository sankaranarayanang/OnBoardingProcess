<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resource OnBoarding</title>
<!-- Load Sytle Sheets -->
<link rel="stylesheet"
	href="/onboarding/resources/stylesheets/bootstrap.min.css">
<link rel="stylesheet"
	href="/onboarding/resources/stylesheets/bootstrap-datepicker.min.css">
<link rel="stylesheet"
	href="/onboarding/resources/stylesheets/application.css">
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="container-fluid content-style">
		<div class="row">
			<div class="col-md-7">
				<div class="">
					<img class="logo-style"
						src="/onboarding/resources/images/onboardingImage.jpg"
						alt="Nationwide Logo">
				</div>
			</div>
			<div class="col-md-1"></div>
			<div class="col-md-3">
				<div class="">
					<img class="logo-style"
						src="/onboarding/resources/images/onboardingPerson.png"
						alt="Nationwide Logo">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-7 text-center" >
				<h3 style="color: blue;">Register - Form</h3><br/>
			</div>
		</div>
		<form:form method="POST" action="add">
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="empId">Employee Id(Cognizant)</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="empId" path="empId"
							placeholder="Enter EmployeeID" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="empFullName">Employee Name</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="empFullName"
							path="empFullName" placeholder="Enter Employee Name" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="email">Email</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="email" path="email"
							placeholder="Enter Email Id" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="firstName">First Name</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="firstName" path="firstName"
							placeholder="Enter First Name" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="lastName">Last Name</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="lastName" path="lastName"
							placeholder="Enter Last Name" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="dateOfBirth">Date Of Birth</form:label>
					</div>
					<div class="col-md-4">
						<form:input autocomplete="off" class="form-control"
							name="dateOfBirth" path="dateOfBirth"
							placeholder="Enter Date of Birth" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="passportNo">Passport/ID Number *</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="passportNo"
							path="passportNo" placeholder="Enter Passport No" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="teamName">Team Name *</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="teamName" path="teamName"
							placeholder="Enter Team Name" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="projName">Project Name</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="projName" path="projName"
							placeholder="Enter Project Name" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="projId">Project Id</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="projId" path="projId"
							placeholder="Enter Project Id" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="requester">Requester</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="requester" path="requester"
							placeholder="Enter Requester" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="processor">Processor</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="processor" path="processor"
							placeholder="Enter Processor" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="location">Location</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="location" path="location"
							placeholder="Enter Location" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="startDate">Start Date</form:label>
					</div>
					<div class="col-md-4">
						<form:input autocomplete="off" class="form-control"
							name="startDate" path="startDate" placeholder="Enter Start Date" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="endDate">End Date</form:label>
					</div>
					<div class="col-md-4">
						<form:input autocomplete="off" class="form-control" name="endDate"
							path="endDate" placeholder="Enter End Date" />
					</div>
				</div>
			</div>
			<div class="form-group" style="display: none;">
				<div class="row">
					<div class="col-md-3">
						<form:label path="status">Approval Status</form:label>
					</div>
					<div class="col-md-4">
						<form:select path="status">
							<form:option value="New" label="New" selected="selected" />
							<form:option value="In Progress" label="In Progress" />
							<form:option value="Complete" label="Complete" />
							<form:option value="Closed" label="Closed" />
						</form:select>
						<%-- <form:input class="form-control" name="status" path="status"
							placeholder="Enter End Date" /> --%>
					</div>
				</div>
			</div>
			<div class="form-group" style="display: none;">
				<div class="row">
					<div class="col-md-3">
						<form:label path="terminated">Termination Status</form:label>
					</div>
					<div class="col-md-4">
						<form:select path="terminated">
							<form:option value="No" label="No" selected="selected" />
							<form:option value="Yes" label="Yes" />
						</form:select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4" align="right">
					<input class="btn btn-info" type="submit" value="Submit" />
				</div>
			</div>
		</form:form>
	</div>
	<!-- Load Script Files -->
	<script src="/onboarding/resources/scripts/jquery.min.js"></script>
	<script src="/onboarding/resources/scripts/bootstrap.min.js"></script>
	<script src="/onboarding/resources/scripts/application.js"></script>
	<script src="/onboarding/resources/scripts/bootstrap-datepicker.min.js"></script>
	<jsp:include page="footer.jsp" />
</body>
</html>