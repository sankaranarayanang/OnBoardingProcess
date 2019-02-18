<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>OnBoarding Resources</title>
<link rel="stylesheet" href="../resources/stylesheets/bootstrap.min.css">
<script src="../resources/scripts/jquery.min.js"></script>
<script src="../resources/scripts/bootstrap.min.js"></script>
</head>

<body>
	<div class="container">
		<h2>Resources List</h2>
		<div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="add">Add User</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-left">
				<li class="active"><a href="/onboarding">Back to home</a></li>
			</ul>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>EmployeeId</th>
					<th>EmployeeName</th>
					<th>Email</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>DOB</th>
					<th>PassportNumber</th>
					<th>TeamName</th>
					<th>ProjectName</th>
					<th>ProjectId</th>
					<th>Requester</th>
					<th>Processor</th>
					<th>Location</th>
					<th>StartDate</th>
					<th>EndDate</th>
					<th>NationwideId</th>
					<th>NationwideIdCreatedDate</th>
					<th>Comments</th>
					<th>Status</th>
					<th>TerminatedStatus</th>
					<th>TerminatedDate</th>
				</tr>
			</thead>
			<c:forEach var="resource" items="${resources}">
				<tr>
					<td>${resource.getEmpId()}</td>
					<td>${resource.getEmpFullName()}</td>
					<td>${resource.getEmail()}</td>
					<td>${resource.getFirstName()}</td>
					<td>${resource.getLastName()}</td>
					<td>${resource.getDateOfBirth()}</td>
					<td>${resource.getPassportNo()}</td>
					<td>${resource.getTeamName()}</td>
					<td>${resource.getProjName()}</td>
					<td>${resource.getProjId()}</td>
					<td>${resource.getRequester()}</td>
					<td>${resource.getProcessor()}</td>
					<td>${resource.getLocation()}</td>
					<td>${resource.getStartDate()}</td>
					<td>${resource.getEndDate()}</td>
					<td>${resource.getNationWideId()}</td>
					<td>${resource.getNationWideIdDate()}</td>
					<td>${resource.getComments()}</td>
					<td>${resource.getStatus()}</td>
					<td>${resource.getTerminated()}</td>
					<td>${resource.getTerminatedDate()}</td>
					<td><button class="btn btn-info"
							onclick="location.href='show/${resource.getEmpId()}'">Show</button>
					<td><button class="btn btn-primary"
							onclick="location.href='update/${resource.getEmpId()}'">Update</button>
					<td><button class="btn btn-danger"
							onclick="location.href='delete/${resource.getEmpId()}'">Delete</button>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>