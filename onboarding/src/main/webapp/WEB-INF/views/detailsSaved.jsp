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
	<div class="content-style">
		<div class="row">
			<div class="col-md-4" align="left">
				<h3 style="color: blue;">Resource Details</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4" align="left">
				<p style="color: green;">Below details saved successfully</p>
			</div>
		</div>
		<table class="table table-striped">
			<tr>
				<td>Employee Id(Cognizant)</td>
				<td>${resource.getEmpId()}</td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td>${resource.getEmpFullName()}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${resource.getEmail()}</td>
			</tr>
			<tr>
				<td>First Name</td>
				<td>${resource.getFirstName()}</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>${resource.getLastName()}</td>
			</tr>
			<tr>
				<td>Date Of Birth</td>
				<td>${resource.getDateOfBirth()}</td>
			</tr>
			<tr>
				<td>Passport/ID Number</td>
				<td>${resource.getPassportNo()}</td>
			</tr>
			<tr>
				<td>Team Name</td>
				<td>${resource.getTeamName()}</td>
			</tr>
			<tr>
				<td>Project Name</td>
				<td>${resource.getProjName()}</td>
			</tr>
			<tr>
				<td>Project Id</td>
				<td>${resource.getProjId()}</td>
			</tr>
			<tr>
				<td>Requester</td>
				<td>${resource.getRequester()}</td>
			</tr>
			<tr>
				<td>Processor</td>
				<td>${resource.getProcessor()}</td>
			</tr>
			<tr>
				<td>Location</td>
				<td>${resource.getLocation()}</td>
			</tr>
			<tr>
				<td>Start Date</td>
				<td>${resource.getStartDate()}</td>
			</tr>

			<tr>
				<td>End Date</td>
				<td>${resource.getEndDate()}</td>
			</tr>
			<tr>
				<td>Nationwide Id</td>
				<td>${resource.getNationWideId()}</td>
			</tr>
			<tr>
				<td>NationwideId Created Date</td>
				<td>${resource.getNationWideIdDate()}</td>
			</tr>
			<tr>
				<td>Comments</td>
				<td>${resource.getComments()}</td>
			</tr>
			<tr>
				<td>Status</td>
				<td>${resource.getStatus()}</td>
			</tr>
			<tr>
				<td>Terminated Status</td>
				<td>${resource.getTerminated()}</td>
			</tr>
			<tr>
				<td>Terminated Date</td>
				<td>${resource.getTerminatedDate()}</td>
			</tr>
			<tr>
				<td><button class="btn btn-info"
						onclick="location.href='./list'">Back</button>
			</tr>
		</table>
	</div>
	<!-- Load Script Files -->
	<script src="/onboarding/resources/scripts/jquery.min.js"></script>
	<script src="/onboarding/resources/scripts/bootstrap.min.js"></script>
	<script src="/onboarding/resources/scripts/application.js"></script>
	<script src="/onboarding/resources/scripts/bootstrap-datepicker.min.js"></script>
	<jsp:include page="footer.jsp" />
</body>
</html>
