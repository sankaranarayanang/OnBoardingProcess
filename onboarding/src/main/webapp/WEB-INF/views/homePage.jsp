<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resource OnBoarding</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="container">
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
</body>
</html>