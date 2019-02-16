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
			<div class="col-xs-6" align="right"><button class="btn btn-info" onclick="location.href='/onboarding/request'">Requester</button></div>
			<div class="col-xs-6"><button class="btn btn-info" onclick="location.href='/onboarding/approve'">Processor</button></div>
		</div>
	</div>
</body>
</html>