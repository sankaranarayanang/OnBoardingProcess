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
			<div class="col-md-4" align="right">
				<h3 style="color: blue;">Project Update - Form</h3>
			</div>
		</div>

		<form:form method="POST" action="/onboarding/project/update"
			modelAttribute="project">
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="projectId">Project Id</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" name="projectId" path="projectId"
							id="projectId" placeholder="Enter Project ID" />
					</div>
					<div class="col-md-5 has-error">
						<form:errors path="projectId" class="help-inline" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="projectName">Project Name</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" id="projectName"
							name="projectName" path="projectName"
							placeholder="Enter Project Name" />
					</div>
					<div class="col-md-5 has-error">
						<form:errors path="projectName" class="help-inline" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="requesterID">Requester Id</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" id="requesterID"
							name="requesterID" path="requesterID"
							placeholder="Enter Requester Id" />
					</div>
					<div class="col-md-5 has-error">
						<form:errors path="requesterID" class="help-inline" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="requesterName">Requester Name</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" id="requesterName"
							name="requesterName" path="requesterName"
							placeholder="Enter Requester Name" />
					</div>
					<div class="col-md-5 has-error">
						<form:errors path="requesterName" class="help-inline" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="approverID">Processor Id</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" id="approverID" name="approverID"
							path="approverID" placeholder="Enter Processor ID" />
					</div>
					<div class="col-md-5 has-error">
						<form:errors path="approverID" class="help-inline" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-md-3">
						<form:label path="approverName">Processor Name</form:label>
					</div>
					<div class="col-md-4">
						<form:input class="form-control" id="approverName"
							name="approverName" path="approverName"
							placeholder="Enter Processor Name" />
					</div>
					<div class="col-md-5 has-error">
						<form:errors path="approverName" class="help-inline" />
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