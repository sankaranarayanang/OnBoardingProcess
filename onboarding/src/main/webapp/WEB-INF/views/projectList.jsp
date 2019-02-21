<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<h2>Projects List</h2>
		<div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="add">Add Project</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-left">
				<li class="active"><a href="/onboarding">Back to home</a></li>
			</ul>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Project Name</th>
					<th>Project ID</th>
					<th>Requester</th>
					<th>Processor</th>
				</tr>
			</thead>
			<c:forEach var="project" items="${projects}">
				<tr>
					<td>${project.getProjectName()}</td>
					<td>${project.getProjectId()}</td>
					<td>${project.getRequesterName()}</td>
					<td>${project.getApproverName()}</td>
					<td><button class="btn btn-primary"
							onclick="location.href='update/${project.getProjectId()}'">Update</button>
					<td><button class="btn btn-danger"
							onclick="location.href='delete/${project.getProjectId()}'">Delete</button>
				</tr>
			</c:forEach>
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
