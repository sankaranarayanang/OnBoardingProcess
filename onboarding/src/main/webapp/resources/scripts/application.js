    $(document).ready(function(){
      var dateOfBirth=$('input[name="dateOfBirth"]'); 
      var startDate=$('input[name="startDate"]');
      var endDate=$('input[name="endDate"]');
      var terminatedDate=$('input[name="terminatedDate"]'); 
      var nationWideIdDate=$('input[name="nationWideIdDate"]');
      var container=$('.content-style') ;
      var options={
        format: 'mm/dd/yyyy',
        container: container,
        todayHighlight: true,
        autoclose: true,
      };
      
      dateOfBirth.datepicker(options);
      startDate.datepicker(options);
      endDate.datepicker(options);
      nationWideIdDate.datepicker(options);
      terminatedDate.datepicker(options);
    })
