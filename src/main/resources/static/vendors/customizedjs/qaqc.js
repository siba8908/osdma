$(document).ready(function () {
	
		getitem();
		getComponent();
	
});
	function getitem(){
		var	table = $('#itemtable').DataTable({
	    	"sAjaxSource" : "/qaqc/getitemdtls",
	    	"method" : "GET",
	    		"sAjaxDataProp" : "",
	    		"order" : [ [ 0, "asc" ] ],
	    		"destroy" : true, 
	    		
	    		"columns": [
	    			   
	    			 {
	    					targets : 0,
	    					data : 'Checked',
	    					searchable : false,
	    					orderable : false,
	    					width : '1%',
	    					className : 'dt-center',
	    					render : function(data, type, full, meta) {
	    						if (data) {
	    							return '<input type="checkbox" checked>';
	    						} else {
	    							return '<input type="checkbox">';
	    						}
	    					}
	    				},
	    			  {"mData": "material_id"},
	    		      { "mData": "item_name"},
	    		      { "mData": "quantity"},
	    			
	    	],
	    			columnDefs: [
	    				{ "visible": false, "targets": 1 },
	    				
	    				{
	    		        	        targets: [4], render: function (a, b, data, d) {
	    		            
	    		            return "<button id='btnEdit' class='btn btn-primary btn-xs '>Verify</button>";
	    		        }},
	    		    
	    		    ],
	    			dom: 'Bfrtip',
	    			
	    			buttons: [
	    	             'excel', 'pdf'
	    	             
	    	        ]
	    	});
		
		/********************************Show modal***************************/
		
		
		$('#itemtable tbody ').on('click', '#btnEdit', function() {
	    	var data = table.row($(this).parents('tr')).data();
	    	var node = table.row($(this).parents('tr')).node();
	    	if ($(node).find('input').prop('checked')) {
	    		$('#material_id').val(data.material_id);
	    		$('#dashboardUpdateId').modal('show');
	    		$('#btnCancel').on('click',function()
	    		{
	    			
	    		data.canceledReason=$('#cancelReason').val();
	    	});						
	    	}

	    });
		
		/******************End Modal******************************/
		
		 $("#btnSubmit").click(function(){
			    	var data = {product_code: $('#product_code').val(),barcode: $('#barcode').val(),quality: $('#quality').val(),remarks: $('#remarks').val(),material_id: $('#material_id').val()};
			    	$.ajax({
			    		type : "POST",
			    		url : "/qaqc/saveItem_details",
			    		cache : false,
			    		data : JSON.stringify(data),
			    		contentType : 'application/json',
			    		success : function(response) 
			    		{
			    			console.log(response)
			                $("#message").html(response).fadeOut(4000);
			    			window.setTimeout(function(){location.reload()},4000)
			            },
			            error: function(data){
			                //console.log(data.responseJSON.message);
			            	$("#message").html(response).fadeOut(4000);
							 window.setTimeout(function(){location.reload()},4000)
			            					
			    		}

			    	});													


			    });
		
	}
	
	function getComponent(){
		//alert("hhhhh");
		var	table = $('#componenttable').DataTable({
	    	"sAjaxSource" : "/qaqc/getComponentdtls",
	    	"method" : "GET",
	    		"sAjaxDataProp" : "",
	    		"order" : [ [ 0, "asc" ] ],
	    		"destroy" : true, 
	    		
	    		"columns": [
	    			   
	    			 {
	    					targets : 0,
	    					data : 'Checked',
	    					searchable : false,
	    					orderable : false,
	    					width : '1%',
	    					className : 'dt-center',
	    					render : function(data, type, full, meta) {
	    						if (data) {
	    							return '<input type="checkbox" checked>';
	    						} else {
	    							return '<input type="checkbox">';
	    						}
	    					}
	    				},
	    			  {"mData": "material_code_id"},
	    			  {"mData": "item_id"},
	    		      { "mData": "component.component_name"},
	    		      { "mData": "qaqcItem.product_code"},
	    	],
	    			columnDefs: [
	    				{ "visible": false, "targets": 1 },{ "visible": false, "targets": 2 },
	    				
	    				{
	    		        	        targets: [5], render: function (a, b, data, d) {
	    		            
	    		            return "<button id='btnEdit' class='btn btn-primary btn-xs '>Update</button>";
	    		        }},
	    		    
	    		    ],
	    			dom: 'Bfrtip',
	    			
	    			buttons: [
	    	             'excel', 'pdf'
	    	             
	    	        ]
	    	});
		
		$('#componenttable tbody ').on('click', '#btnEdit', function() {
	    	var data = table.row($(this).parents('tr')).data();
	    	var node = table.row($(this).parents('tr')).node();
	    	if ($(node).find('input').prop('checked')) {
	    		$('#material_code_id').val(data.material_code_id);
	    		$('#item_id').val(data.item_id);
	    		$('#productcodeedit').val(data.qaqcItem.product_code);
	    		$('#componentUpdate').modal('show');
	    		$('#btnCancel').on('click',function()
	    		{
	    			
	    		data.canceledReason=$('#cancelReason').val();
	    	});						
	    	}

	    });
		
		$("#btnSubmit").click(function(){
			//alert("bbbbbbbb");
	    	var data = {product_code: $('#productcodeedit').val(),item_id :$('#item_id').val()};
	    	$.ajax({
	    		type : "POST",
	    		url : "/qaqc/updateProduct",
	    		cache : false,
	    		/* dataType : "json", */
	    		data : JSON.stringify(data),
	    		contentType : 'application/json',
	    		success : function(response) 
	    		{
	    			getComponent();				
	    		}

	    	});													
	    });
		
	}
	
	
