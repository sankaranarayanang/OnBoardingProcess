<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="../../resources/stylesheets/bootstrap.min.css">
<script src="../../resources/scripts/jquery.min.js"></script>
<script src="../../resources/scripts/bootstrap.min.js"></script>
<title>Onboarding Resources</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4" align="left">
				<h3 style="color: blue;">Resource Details</h3>
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
						onclick="location.href='../list'">Back</button>
			</tr>
		</table>
	</div>
</body>
</html>