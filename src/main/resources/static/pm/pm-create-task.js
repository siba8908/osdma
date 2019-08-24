var i=1;
var workStageOptions="";
var _tableMasterTaskReports;
$(document).ready(function() {
	$.ajax({
	      url: "api/fetch-work-stage",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  workStageOptions += '<option value="' + this.stageId + '">' + this.stageName + '</option>';
	          });
	    	  $(".workStage").append(workStageOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
	$.ajax({
	      url: "api/fetch-master-task",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  this.serialNo = index + 1;
	    		  this.action="<button class='btn btn-sm btn-primary ml-10'>Edit</button>"
	          });
	    	  console.log(data)
	    	  setTableData(data);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
});

function saveTask(){
	var taskList=[];
	var rowCount=0;
	$('#create-task-table > tbody  > tr').each(function() {
		var task={};
		var masterWorkStage={};
		masterWorkStage.stageId=$("#workStage"+rowCount+"").val();
		task.masterWorkStage=masterWorkStage;
		task.taskName=$("#taskName"+rowCount+"").val();
		task.duration=$("#duration"+rowCount+"").val();
		taskList.push(task);
		rowCount++;
	});
	$.ajax({
        url: "api/save-master-task",
        data: JSON.stringify(taskList),
        error: function (e) {
        	window.location.reload();
        },
        success: function (data) {
        	window.location.reload();
        },
        dataType: "json",
        contentType: 'application/json; charset=utf-8',
        type: "POST",
        cache: false,
        crossDomain: true
    });
}
$(".btnAdd").click(function(){
	var element="<tr>"
				+"<td><input type='text' class='form-control' id='taskName"+i+"'></td>"
				+"<td><select class='form-control workStage' id='workStage"+i+"'>"
				+"<option value=''>Select Work Stage</option>"
				+"</select></td>"
				+"<td><input type='number' class='form-control' id='duration"+i+"'></td>"
				+"<td><button class='fa fa-minus btnMinus' style='height: 30px'></button>"
				+"</td></tr>";
	
	$(".body-create-task").append(element);
    $("#workStage"+i+"").append(workStageOptions);
	i++;
	$(".btnMinus").click(function(){
		$(this).parent().parent().remove();
		i--;
	});
});
function setTableData(dataSet) {
	if (_tableMasterTaskReports) {
		_tableMasterTaskReports.destroy();
		$('#masterTaskReportTable tbody').off('click');
	}
	_tableMasterTaskReports = $('#masterTaskReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "taskName"
		}, {
			"data" : "masterWorkStage.stageName"
		}, {
			"data" : "duration"
		}, {
			"data" : "action"
		} ]
	});
}
