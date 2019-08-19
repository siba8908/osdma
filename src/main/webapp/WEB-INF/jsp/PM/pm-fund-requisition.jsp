<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>

<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">
<jsp:include page="../layout/pm-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
<div class="cui-layout-content">
<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
  <div class="pull-right">
   
  </div>
  <span class="font-size-18 d-block">
    <span class="text-muted">Home ·</span>
    <strong>Project Management</strong>
    <small class="text-muted"></small>
  </span>
</nav>
<div class="cui-utils-content">
<!-- START: forms/selectboxes -->
<section class="card">
  <div class="card-header" style="background-color:#FFF;color:#FFF">
    <span class="cui-utils-title">
      <strong>Daily Work Status</strong>
    </span>
      </div>
     
   <div class="table-responsive mb-3">
    
          <table class="table table-hover">
            <thead>
             
              <tr style="background-color:#09F">
                <th></th>
                 <th>Date</th> 
                 <th>Request From</th>
                <th>Site Code</th>
                  <th>Type of Work</th>
               <th>Amount Raised</th>
                <th>Description/Purpose</th>
                <th>Approved Amount</th>
                <th>Remarks</th>
              </tr>
            </thead>
            <tbody>
              <tr><td><input type="checkbox" checked="checked" />
            <span class="cui-utils-control-indicator"></span></td>
            <td><div class="form-group">
            <input
              type="text"
              class="form-control"
              placeholder="Select Date"
              id="datepicker-only-init2"
              data-toggle="datetimepicker"
              data-target="#datepicker-only-init2"
            />
          </div></td>
              <td>Supplier Name</td>
              <td>1230945</td>
                <td>Work Type</td> 
                <td>1000</td>
            <td>Description</td>
            <td>Input</td>
            <td>Remark</td> </tr>  
            <tr><td><input type="checkbox" checked="checked" />
            <span class="cui-utils-control-indicator"></span></td>
           <td><div class="form-group">
            <input
              type="text"
              class="form-control"
              placeholder="Select Date"
              id="datepicker-only-init1"
              data-toggle="datetimepicker"
              data-target="#datepicker-only-init1"
            />
          </div></td>
              <td>Employee Name</td>
              <td>1945</td>
                <td>Work Type</td> 
                 <td>1000</td>
            <td>Description</td>
            <td>Input</td>
            <td>Remark</td> </tr> 
              </table>
              <p>Note:After Paymentfrom AM,Notification will come on click Details page will be Display.</p>
             <div class="pull-right">
                
    <a href="javascript: void(0);" class="btn btn-sm btn-primary ml-10">
  Send
      
    </a>
      </div>
            </div>
            
           
          <table class="table table-hover">
            <thead>
             
              <tr style="background-color:#09F">
                <th></th>
                 <th>Date</th> 
                 <th>Request From</th>
                <th>Site Code</th>
                  <th>Type of Work</th>
               <th>Project Type</th>
                <th>Description/Purpose</th>
                <th>Approval</th>
               
              </tr>
            </thead>
            <tbody>
              <tr><td><input type="checkbox" checked="checked" />
            <span class="cui-utils-control-indicator"></span></td>
            <td><div class="form-group">
            <input
              type="text"
              class="form-control"
              placeholder="Select Date"
              id="datepicker-only-init3"
              data-toggle="datetimepicker"
              data-target="#datepicker-only-init3"
            />
          </div></td>
              <td>Supplier Name</td>
              <td>1230945</td>
                <td>Work Type</td> 
                <td>AWS</td>
            <td>Item Details</td>
            <td> <div class="pull-right">
                
    <a href="javascript: void(0);" class="btn btn-sm btn-primary ml-10">
  Approved
      
    </a>
      </div></td></tr>
            
             
              </table>
              <p>Note:From Dispatch to Dispaly of Districtstore PM will track the Status of materials.</p>
             
            </div>
               
          
               
          
           
  
      
   
<!-- END: forms/selectboxes -->

<!-- START: page scripts -->

<!-- END: page scripts -->

</div>
</div>

          <div class="cui-footer-description">
            <p>
             
            </p>

            <p>
              
            </p>
          </div>
        </div>
    <div class="cui-footer-bottom">
      <div class="row">
        <div class="col-md-4">
         
        </div>
        <div class="col-md-8">
          <div class="cui-footer-company">
           
            <span>
             
              <br />
             
            </span>
          </div>
        </div>
      </div>
    </div>

</body>

</html>