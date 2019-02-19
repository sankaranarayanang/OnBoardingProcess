<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
			<div class="col-xs-4" align="right">
				<button class="btn btn-info"
					onclick="location.href='/onboarding/request'">Request</button>
			</div>
			<div class="col-xs-4" align="center">
				<button class="btn btn-info"
					onclick="location.href='/onboarding/process'">Process</button>
			</div>
			<div class="col-xs-4" align="left">
				<button class="btn btn-info"
					onclick="location.href='/onboarding/terminate'">Terminate</button>
			</div>
		</div>
	</div>

	<!-- Load Script Files -->
	<script src="/onboarding/resources/scripts/jquery.min.js"></script>
	<script src="/onboarding/resources/scripts/bootstrap.min.js"></script>
	<script src="/onboarding/resources/scripts/application.js"></script>
	<script src="/onboarding/resources/scripts/bootstrap-datepicker.min.js"></script>
	<jsp:include page="footer.jsp" />
</body>
</html>
