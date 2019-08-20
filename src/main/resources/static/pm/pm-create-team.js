var _tableAllTeams;
var projectCoordinatorOptions="";
var siteManagerOptions="";
var siteEngineerOptions="";
var siteAssistanceOptions="";
$(document).ready(function() {
	fetchAllTeams();
});


function fetchAllTeams() {
	$.ajax({
		url : "api/fetch-teams",
		error : function(e) {
		},
		success : function(data) {
			console.log(data);
			$.each(data, function(index) {
				this.serialNo = index + 1;
			});
			setTableData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
}

function setTableData(dataSet) {
	if (_tableAllTeams) {
		_tableAllTeams.destroy();
		$('#pmTeamTable tbody').off('click');
	}
	_tableAllTeams = $('#pmTeamTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "teamName"
		}, {
			"data" : ""
		}],
		columnDefs: [{
            "targets": -1,
            "data": null,
            "orderable": false,
            "defaultContent": "<button type='button' class='btn btn-success mr-2 mb-2' data-toggle='modal' data-target='#modal' onclick='getTeamMembers(this)'>View</button>"
        },
        {"className": "dt-center", "targets": "_all"}]
	});
}


function fetchDetailsForCreateTeam() {
	fetchProjectCoordinators();
	fetchSiteManager();
	fetchSiteEngineer();
	fetchSiteAssistance();
}



function fetchProjectCoordinators() {
	$.ajax({
	      url: "api/fetch-employees-as-project-coordinator",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  projectCoordinatorOptions += '<option value="' + this.employeeId + '">' + this.firstName +' '+ this.lastName+ '</option>';
	          });
	    	  $(".pc").append(projectCoordinatorOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
}


function fetchSiteManager() {
	$.ajax({
	      url: "api/fetch-employees-as-site-manager",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  siteManagerOptions += '<option value="' + this.employeeId + '">' + this.firstName +' '+ this.lastName+ '</option>';
	          });
	    	  $(".sm").append(siteManagerOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
}


function fetchSiteEngineer() {
	$.ajax({
	      url: "api/fetch-employees-as-site-engineer",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  siteEngineerOptions += '<option value="' + this.employeeId + '">' + this.firstName +' '+ this.lastName+ '</option>';
	          });
	    	  $(".se").append(siteEngineerOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
}



function fetchSiteAssistance() {
	$.ajax({
	      url: "api/fetch-employees-as-site-assistance",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  siteAssistanceOptions += '<option value="' + this.employeeId + '">' + this.firstName +' '+ this.lastName+ '</option>';
	          });
	    	  $(".sa").append(siteAssistanceOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
}


function createTeam() {
	var teamName = $('#teamName').val();
	var projectCoordinator = $('#projectCoordinator').val();
	var siteEngineer = $('#siteEngineer').val();
	var siteManager1 = $('#siteManager1').val();
	var siteAssistance1 = $('#siteAssistance1').val();
	var siteManager2 = $('#siteManager2').val();
	var siteAssistance2 = $('#siteAssistance2').val();
	
	if(teamName == "" || teamName == undefined || teamName == null) {
		alert("Please enter team name.");
		return;
	}
	
	if(projectCoordinator == "" || projectCoordinator == undefined || projectCoordinator == null) {
		alert("Please enter project coordinator.");
		return;
	}
	
	if(siteEngineer == "" || siteEngineer == undefined || siteEngineer == null) {
		alert("Please enter site engineer.");
		return;
	}
	
	if(siteManager1 == "" || siteManager1 == undefined || siteManager1 == null) {
		alert("Please enter site manager 1.");
		return;
	}
	
	if(siteAssistance1 == "" || siteAssistance1 == undefined || siteAssistance1 == null) {
		alert("Please enter site assistance 1.");
		return;
	}
	
	if(siteManager2 == "" || siteManager2 == undefined || siteManager2 == null) {
		alert("Please enter site manager 2.");
		return;
	}
	
	
	if(siteAssistance2 == "" || siteAssistance2 == undefined || siteAssistance2 == null) {
		alert("Please enter site assistance 2.");
		return;
	}
	
	
	var saveData = {
			"teamName" : teamName,
			"teamMembersEmployeeId" : [projectCoordinator,siteEngineer,siteManager1, siteManager1,siteAssistance1,siteAssistance2]
	}
	
	console.log(saveData);
	
	$.ajax({
		url : "api/create-team-with-members",
		data : JSON.stringify(saveData),
		error : function(e) {
			console.log(e)
			swal({
				position : 'top',
				type : 'error',
				text : 'Error in save.',
				showConfirmButton : false,
				timer : 2500
			})
		},
		success : function(data) {
			console.log(data);
			swal({
				position : 'top',
				type : 'success',
				text : 'Created successfully.',
				showConfirmButton : false,
				timer : 2500
			})
			window.setTimeout(function(){
				window.location.reload();
		    }, 2500);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
	
	
}






