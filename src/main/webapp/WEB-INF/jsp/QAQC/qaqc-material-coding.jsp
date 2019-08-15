
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">


<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/customizedjs/Qaqcmaterial.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js"></script> 

<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">
<div class="cui-menu-right">
  <div class="cui-menu-right-inner">
    <div class="cui-menu-right-header">
      <span class="fa fa-times pull-right cui-menu-right-action-toggle"><!-- --></span>
      Theme Settings
    </div>
    <div class="cui-menu-right-content">
      <div class="cui-menu-right-descr">
        This module "block-menu-right" gives possibility to construct custom blocks with any
        widgets, ../components and elements inside, like this theme settings
      </div>
      <div class="cui-menu-right-label">
        Theme Style
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="" /> Dark
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-light" /> Light
            </label>
          </div>
        </div>
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-green" /> Green
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-blue" /> Blue
            </label>
          </div>
        </div>
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-red" /> Red
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-orange" /> Orange
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Menu Shadow
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-shadow" value="cui-menu-left-shadow" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-shadow" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Borderless Cards
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-borderless" value="cui-config-borderless" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-borderless" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Squared Corners
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-corners" value="cui-config-squared-corners" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-corners" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Fixed Width
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-boxed" value="cui-config-fixed-width" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-boxed" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Colorful Menu
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-colorful" value="cui-menu-left-colorful" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-colorful" value="" /> Off
            </label>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<jsp:include page="../layout/qaqc-leftmenu.jsp"></jsp:include>
<div class="cui-layout">
<div class="cui-layout-header">
<div class="cui-topbar">
  <!-- left aligned items -->
  <div class="cui-topbar-left">
    <div class="cui-topbar-item">
      
    </div>
    <div class="cui-topbar-item">
      
    </div>
<!--     <div class="cui-topbar-item">
      <div class="cui-topbar-search">
        <i class="icmn-search"></i>
        <input type="text" id="livesearch-input" placeholder="Type to search..." />
      </div>
      <div class="cui-topbar-livesearch">
        <button class="cui-topbar-livesearch-close" type="button">
          <i class="icmn-cross"></i>
        </button>
        <div class="container-fluid">
          <div class="cui-topbar-livesearch-wrapper">
            <div class="cui-topbar-livesearch-logo-container">
              <img
                class="cui-topbar-livesearch-logo"
                src="../components/dummy-assets/common/img/logo.png"
                alt=""
              />
            </div>
            <input
              type="search"
              id="livesearch-input-inner"
              class="cui-topbar-livesearch-input"
              placeholder="Type to search..."
            />
            <ul class="cui-topbar-livesearch-options">
              <li class="cui-topbar-livesearch-option">
                <label class="cui-utils-control cui-utils-control-checkbox"
                  >Search within page
                  <input type="checkbox" checked="checked" />
                  <span class="cui-utils-control-indicator"></span>
                </label>
              </li>
              <li class="cui-topbar-livesearch-option">Press enter to search</li>
            </ul>
            <div class="cui-topbar-livesearch-results">
              <div class="cui-topbar-livesearch-results-title">
                <span>Pages Search Results</span>
              </div>
              <div class="row">
                <div class="col-lg-4">
                  <div class="cui-topbar-livesearch-result-content">
                    <div
                      class="cui-topbar-livesearch-result-thumb"
                      style="background-image: url('../components/dummy-assets/common/img/photos/1.jpg')"
                    >
                      #1
                    </div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                  <div class="cui-topbar-livesearch-result-content">
                    <div
                      class="cui-topbar-livesearch-result-thumb"
                      style="background-image: url('../components/dummy-assets/common/img/photos/2.jpg')"
                    >
                      KF
                    </div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                  <div class="cui-topbar-livesearch-result-content">
                    <div
                      class="cui-topbar-livesearch-result-thumb"
                      style="background-image: url('../components/dummy-assets/common/img/photos/3.jpg')"
                    >
                      GF
                    </div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                </div>
                <div class="col-lg-4">
                  <div class="cui-topbar-livesearch-result-content">
                    <div class="cui-topbar-livesearch-result-thumb">01</div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                  <div class="cui-topbar-livesearch-result-content">
                    <div class="cui-topbar-livesearch-result-thumb">02</div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                  <div class="cui-topbar-livesearch-result-content">
                    <div class="cui-topbar-livesearch-result-thumb">03</div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div> -->
  </div>
  <!-- right aligned items -->
  <div class="cui-topbar-right">
    
    <div class="cui-topbar-item d-none d-lg-block ml-0">
      <div class="cui-topbar-mini-chart text-nowrap">
        
        
        
      </div>
    </div>
    <div class="cui-topbar-item">
      <div class="dropdown">
        <a href="#" class="dropdown-toggle text-nowrap" data-toggle="dropdown" aria-expanded="false">
          <i class="menu-notification-icon icmn-home"></i>
        </a>
        
      </div>
    </div>
    <div class="cui-topbar-item">
      <div class="dropdown cui-topbar-avatar-dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
          <span class="cui-topbar-avatar">
            <img src="../components/dummy-assets/common/img/avatars/1.jpg" alt="" />
          </span>
        </a>
        
      </div>
    </div>
    <div class="cui-topbar-item">
      <div class="cui-topbar-menu-button cui-menu-right-action-toggle">
        <i class="fa fa-bars"> <!-- --></i>
      </div>
    </div>
  </div>
</div>

<script>
  ;(function($) {
    'use strict'
    $(function() {
      ///////////////////////////////////////////////////////////
      // livesearch scripts

      var livesearch = $('.cui-topbar-livesearch')
      var close = $('.cui-topbar-livesearch-close')
      var visibleClass = 'cui-topbar-livesearch-visible'
      var input = $('#livesearch-input')
      var inputInner = $('#livesearch-input-inner')

      function setHidden() {
        livesearch.removeClass(visibleClass)
      }
      function handleKeyDown(e) {
        const key = event.keyCode.toString()
        if (key === '27') {
          setHidden()
        }
      }
      input.on('focus', function() {
        livesearch.addClass(visibleClass)
        setTimeout(function() {
          inputInner.focus()
        }, 200)
      })
      close.on('click', setHidden)
      document.addEventListener('keydown', handleKeyDown, false)
    })
  })(jQuery)
</script>
<div class="cui-layout-content">
<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
  <div class="pull-right">
    
  </div>
  <!-- <span class="font-size-18 d-block">
    <span class="text-muted">Home ·</span>
    <strong>Material Coding </strong>
    <small class="text-muted"></small>
  </span> -->
</nav>
<div class="cui-utils-content">
<!-- START: tables/basic-tables -->
<section class="card">
  <div class="card-header">
    
  </div>
  <div class="card-body">
    <div class="row">
      
     
    </div>
    <div class="row">
     
      
    </div>
    <div class="row">
      
      
    </div>
    <div class="row">
      <div class="col-lg-12">
        <h3 class="text-black"><strong></strong></h3><br/>
       <h5 style="color:#066;font-family:'Arial Black', Gadget"><strong>Material Coding</strong></h5>
        <p class="text-muted"><code></code></p>
        <div class="table-responsive mb-6">
         <form name="materialSave" id="materialSave">
        <div class="form-group row">
          
              <label class="col-md-3 col-form-label" for="l0">Product Name:</label>
                  
                  <td> <div>
                   
 <!--                           <div class="form-group">
     <select class="form-control first-select" id="class" name="class">
         <option value="grade">Grade</option>
         <option value="year">Year</option>
     </select>
 </div>
 
 
 <div class="form-group">
     <select class="form-control second-select" id="class_year" name="class_year"  >
         <option value="3">3</option>
         <option value="4">4</option>
         <option value="5">5</option>
         <option value="6">6</option>
         <option value="7">7</option>
         <option value="8">8</option 
     </select>
 </div>  -->        
              <select class="form-control first-select " id="product" name="[0][product_id]">
										     <option>Select ProductName</option>
												<c:forEach var="showProductName" items="${showProductName}">
													<option value="${showProductName.product_id}">${showProductName.product_name}</option>
												</c:forEach>
													</select>
                <!-- <select class="form-control first-select" id="product" placeholder="Component" name="product_id">
                  <option>Option 1 </option>
                  <option>Option 2</option>
                  <option>Option 3</option>
                  <option>Option 4</option>
                  <option>Option 5</option> 
                </select> -->
              </div>
                  </td>
                </select>
              </div>
          <table class="table table-hover table-bordered" id="field">
            <thead>
              <tr style="background-color:#FCC;text-align:center;font-weight:bold">
                 <th>Component </th>
                   <th>Quantity</th>
                   <th>Product Code</th>
                   <th></th>
                   <th>Sim Details</th>
                  <th></th>
                 <th>
               
      
    </a>
      </div>
</th>                
              </tr>
            </thead>
            <tbody>
              <tr style="color:#06C;text-align:center">
              <td> </td>
          </td>
                <td>
                
                  </td>
              
                <td></td>
               
               <div>
                
            
              
                <td>Provider</td>
               <td>Phone No</td>
                <td>IMEI No</td>
              <td></td>
                </div>
               
               </div>
                
              </tr>
              <tr style="color:#06C;text-align:center">
               <td> <div >
                   
                                    
             
                <select class="form-control " id="ComponentName" placeholder="Component" name="[0][component_id]">
                
                <option>Select ComponentName</option>
												
                
         <!-- <option value="3">Option 1</option>
         <option value="4">Option 2 </option>
         <option value="5">Option 3</option>
         <option value="6">Option 4</option>
         <option value="7">Option 5</option> -->
        
                </select>
              </div>
                  </td>
              
           <td>  <div >
                   
                                    
             
                <select class="form-control" id="Quantity" placeholder="Component" name="[0][quantity]">
                 <option>Select Quantity</option>
												
                 <!--  <option> Option 1 </option>
                  <option>Option 2</option>
                  <option>Option 3</option>
                  <option>Option 4</option>
                  <option>Option 5</option> -->
                </select>
              </div>
                
                  </td>
               <td> <div >
                   
                                    
            <select class="form-control " id="myselect" name="[0][item_id]">
										<option>Select ProductCode</option>
												<c:forEach var="showProductCode" items="${showProductCode}">
													<option value="${showProductCode.item_id}">${showProductCode.product_code}</option>
												</c:forEach>
													</select>
              <!--   <select class="form-control third-select" id="product_component_r" placeholder="Component" name="material_code_id">
                  <option> Option 1 </option>
                  <option>Option 2</option>
                  <option>Option 3</option>
                  <option>Option 4</option>
                  <option>Option 5</option>
                </select> -->
              </div>
                  </td>
              
                <td><input type="text" class="form-control" placeholder="" id="sim_provider" name="[0][sim_provider]" /></td>
              
                 <td><input type="number" class="form-control" placeholder="" id="phone_no" name="[0][phone_no]"/></td>
               
                <td><input type="text" class="form-control" placeholder="" id="imei_no" name="[0][imei_no]"/></td>
                
  <!--   <td> <button type="button" name="add" id="add" class="btn btn-info"><i class="fa fa-plus"></i> </button></td> -->
              </tr>
              
        
        </table>
        </form>
        
         <div class="pull-right">   
    <a href="javascript: void(0);" id="btnSave" class="btn btn-sm btn-primary ml-10">
    Save
      
    </a>
   
      </div>
       <p id="message"></p>
    </div>
  </div>
</section>
<!-- END: tables/basic-tables -->

<!-- START: page scripts -->
<!-- <script>
  ;(function($) {
    'use strict'
    $(function() {
      $('[data-toggle=tooltip]').tooltip()
    })
  })(jQuery)
</script> -->
<!-- END: page scripts -->

</div>
</div>
<div class="cui-layout-footer">
<div class="cui-footer">
  <div class="cui-footer-inner">
    <div class="cui-footer-top">
      <div class="row">
        <div class="col-lg-9 mb-3">
          <div class="mb-3">
            <strong
              ></strong
            >
          </div>
          <div class="cui-footer-description">
            <p>
              
            </p>

            <p>
             
            </p>
          </div>
        </div>
      </div>
    </div>
    <div class="cui-footer-bottom">
      <div class="row">
        <div class="col-md-4">
          <img src="../components/dummy-assets/common/img/logo.png" width="200" height="auto"> </div>
        <div class="col-md-8">
         <!--  <div class="cui-footer-company">
            <img
              class="cui-footer-company-logo"
              src="../components/dummy-assets/common/img/N-m.png" width="90" height="auto"
              title="#" />
            <span>
              © 2019 <a href="#" target="_blank">Powered by Nucigent Technology</a>
             
            </span>
          </div> -->
        </div>
      </div>
    </div>
   
  </div>
</div>
</div>
</div>
</div>
</body>

