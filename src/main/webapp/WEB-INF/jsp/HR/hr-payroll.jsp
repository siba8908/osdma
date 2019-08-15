
<html lang="en">
  <jsp:include page="../layout/links.jsp"></jsp:include>
<!-- customizedJs -->
<script src="../vendors/customizedjs/payroll.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">


<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>


<div class="cui-layout">
<jsp:include page="../layout/header.jsp"></jsp:include>

<div class="cui-layout-content">
<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
  <div class="pull-right">
   
  </div>
  <span class="font-size-18 d-block">
    <span class="text-muted"> ·</span>
    <strong>Human Resource</strong>
    
  </span>
</nav>
<div class="cui-utils-content">
<!-- START: tables/datatables -->
<section class="card">
  <div class="card-header">
    
  </div>
  <div class="card-body">
    <div class="row">
      <div class="col-lg-15">
        <h5 style="color:#039"><strong>PAYROLL</strong></h5>
           <!--   Date<input type="date" name="monthcal">
             <button type="button" id="btnsubmitdate">Send</button> -->
             
        <!-- <div class="mb-5"> -->
        <div id="statusmsgs"></div>
        <div class="table-responsive mb-5">
        
          <table class="table table-bordered " id="example1" >
        
            <thead>
              <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th rowspan="1"> Addition  </th>
                <th rowspan="5">Deduction</th>
                
            
                
              </tr>
            </thead>
           
            </table>
            <form name="payrollform" id="payrollform">
              <table class="table table-bordered" id="payroll" >
            <thead>
              <tr>
                <th>Employee Code</th>
                <th>Employee Name</th>
                <th>Designation</th>
                <th>Department</th>
                <th>Total No Days</th>
                <th>No of Days</th>
                <th>Gross Salary</th>
                <th>Work on Holidays</th>
                <th>Bonus</th>
                <th>PF</th>
                <th>ESI</th>
                <th>Loan</th>
                <th>TDS</th>
                
               
                
              </tr>
            </thead>
            
           
                            <tbody>
            	                  <c:forEach items="${EmpPayroll}" var="payroll">
											<tr>
												<td>${payroll.employeeCode}</td>
												<td>${payroll.firstName} ${payroll.lastName}</td>
												<td>${payroll.designation}</td>
												<td>${payroll.department}</td>
												<td>${payroll.totalNoOfDays}</td>
												<td>${payroll.noOfDays}</td> 
												<td>${payroll.salary}</td>
												<td> <input type="number" class="form-control" id="wh" name="workOnHolidays"/></td>
												<td><input type="number" class="form-control" id="bon" name="bonus"/></td>
												<td><input type="number" class="form-control" id="pf" name="pf"/></td>
												<td><input type="number" class="form-control" id="esi" name="esi"/></td>
												<td><input type="number" class="form-control" id="loan" name="loan"/></td>
												<td><input type="number" class="form-control" id="tds" name="tds"/></td>
												<td><input type="hidden" class="form-control" id="employeeId" name="employeeId" value="${payroll.employeeId}"></td>
											</tr>
										</c:forEach>
          
              
              
              
              
          </tbody>
          </table>
          </div>
          <button type="button" class="btn btn-primary" id="btnsubmit">Send</button>
          
    </form>
       </div>
      </div>
    </div>
    
    
    </section>
   
          
        </div>
      </div>
 
<jsp:include page="../layout/footer.jsp"></jsp:include>


</div>
</div>
</body>


</html>