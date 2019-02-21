$(document).ready(function() {
	var dateOfBirth = $('input[name="dateOfBirth"]');
	var startDate = $('input[name="startDate"]');
	var endDate = $('input[name="endDate"]');
	var terminatedDate = $('input[name="terminatedDate"]');
	var nationWideIdDate = $('input[name="nationWideIdDate"]');
	var container = $('.content-style');
	var options = {
		format : 'mm/dd/yyyy',
		container : container,
		todayHighlight : true,
		autoclose : true,
	};

	dateOfBirth.datepicker(options);
	startDate.datepicker(options);
	endDate.datepicker(options);
	nationWideIdDate.datepicker(options);
	terminatedDate.datepicker(options);
})

function loadProjDetails() {
	var projName = $('#projName').val();
	$.ajax({
		type : 'GET',
		url : "/onboarding/project/details?name=" + projName,
		dataType : "text",
		success : function(resultData) {
			var returnedData = JSON.parse(resultData);
			$('#projId').val(returnedData.projectId);
			$('#requester').val(returnedData.requesterName);
			$('#processor').val(returnedData.approverName);
		}
	});
}

$('#empId').blur(function() {
	loadEmployeeDetails();
});

function loadEmployeeDetails() {
	var empId = $('#empId').val();
	$.ajax({
		type : 'GET',
		url : "/onboarding/resource/getEmployee?empId=" + empId,
		dataType : "text",
		success : function(resultData) {
			var returnedData = JSON.parse(resultData);
			$('#empFullName').val(returnedData.name);
			$('#email').val(returnedData.emailId);
			$('#firstName').val(returnedData.name.split(" ")[0]);
			$('#lastName').val(returnedData.name.split(" ")[1]);
		}
	});
}
