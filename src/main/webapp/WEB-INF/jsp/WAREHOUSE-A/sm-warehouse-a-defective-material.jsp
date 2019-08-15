<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/warehouse-a-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Store Manager </strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/form-validation -->
					<section class="card">
						<div class="card-header">
							<span class="cui-utils-title">

								<h3 class="text-black">
									<strong>WAREHOUSE-A</strong>
								</h3>
							</span>
							<h5 style="color: 066; font-family: 'Arial Black', Gadget">Defective
								Items</h5>
						</div>

						<div class="table-responsive mb-6">
							<table class="table table-hover table-bordered ">
								<thead>
									<tr
										style="background-color: #06F; text-align: center; font-weight: bold;">
										<th>Sl No</th>
										<th>Item Code</th>
										<th>Description</th>
										<th>Quantity</th>
										<th>Receiving Date</th>
										<th>Remark</th>

									</tr>
								</thead>
								<tbody>
									<tr>
										<td style="text-align: center">12365</td>
										<td style="text-align: center">654</td>
										<td style="text-align: center">Product Description</td>
										<td style="text-align: center">10</td>
										<td class="txt1"><input type="text" class="form-control"
											placeholder="Select Date" id="datepicker-only-init"
											data-toggle="datetimepicker"
											data-target="#datepicker-only-init" /></td>
										<td style="text-align: center">Good</td>
									</tr>
									<tr>
										<td style="text-align: center">19875</td>
										<td style="text-align: center">642</td>
										<td style="text-align: center">Product Description</td>
										<td style="text-align: center">03</td>
										<td class="txt1"><input type="text" class="form-control"
											placeholder="Select Date" id="datepicker-only-init1"
											data-toggle="datetimepicker"
											data-target="#datepicker-only-init1" /></td>
										<td style="text-align: center">Good</td>
									</tr>
									<tr>
										<td style="text-align: center">12300</td>
										<td style="text-align: center">321</td>
										<td style="text-align: center">Product Description</td>
										<td style="text-align: center">05</td>
										<td class="txt1"><input type="text" class="form-control"
											placeholder="Select Date" id="datepicker-only-init2"
											data-toggle="datetimepicker"
											data-target="#datepicker-only-init2" /></td>
										<td style="text-align: center">Good</td>
									</tr>

									<td style="text-align: center">12365</td>
									<td style="text-align: center">987</td>
									<td style="text-align: center">Product Description</td>
									<td style="text-align: center">10</td>
									<td class="txt1"><input type="text" class="form-control"
										placeholder="Select Date" id="datepicker-only-init3"
										data-toggle="datetimepicker"
										data-target="#datepicker-only-init3" /></td>
									<td style="text-align: center">Good</td>
									</tr>


								</tbody>
								<tfoot>

								</tfoot>
							</table>
							<a href="javascript: void(0);" class="btn btn-sm btn-primary"
								style="float: right">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SAVE
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
						</div>
				</div>
			</div>





			<!-- END: forms/form-validation -->

			<!-- START: page scripts -->
			<script>
				;
				(function($) {
					'use strict'
					$(function() {
						$('#datepicker-only-init').datetimepicker({
							icons : {
								time : 'fa fa-clock-o',
								date : 'fa fa-calendar',
								up : 'fa fa-arrow-up',
								down : 'fa fa-arrow-down',
								previous : 'fa fa-arrow-left',
								next : 'fa fa-arrow-right',
							},
							format : 'LL',
						})
						$('#datepicker-only-init1').datetimepicker({
							icons : {
								time : 'fa fa-clock-o',
								date : 'fa fa-calendar',
								up : 'fa fa-arrow-up',
								down : 'fa fa-arrow-down',
								previous : 'fa fa-arrow-left',
								next : 'fa fa-arrow-right',
							},
							format : 'LL',
						})

						$('#datepicker-only-init2').datetimepicker({
							icons : {
								time : 'fa fa-clock-o',
								date : 'fa fa-calendar',
								up : 'fa fa-arrow-up',
								down : 'fa fa-arrow-down',
								previous : 'fa fa-arrow-left',
								next : 'fa fa-arrow-right',
							},
							format : 'LL',

						})
						$('#datepicker-only-init3').datetimepicker({
							icons : {
								time : 'fa fa-clock-o',
								date : 'fa fa-calendar',
								up : 'fa fa-arrow-up',
								down : 'fa fa-arrow-down',
								previous : 'fa fa-arrow-left',
								next : 'fa fa-arrow-right',
							},
							format : 'LL',
						})
					})
				})

				(jQuery)
			</script>
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
								<strong></strong>
							</div>

						</div>
					</div>

					<p></p>
				</div>
			</div>
		</div>
	</div>
	<div class="cui-footer-bottom">
		<div class="row">
			<div class="col-md-4">
				<img src="../components/dummy-assets/common/img/logo.png"
					width="200" height="auto">
			</div>
			<div class="col-md-8">
				<div class="cui-footer-company">
					<img class="cui-footer-company-logo"
						src="../components/dummy-assets/common/img/N-m.png" width="90"
						height="auto" title="#" /> <span> © 2019 <a
						href="#" target="_blank">Powered by Nucigent Technology</a>

					</span>
				</div>
			</div>
		</div>
	</div>
	<a href="javascript: void(0);" class="cui-utils-scroll-top"
		onclick="$('body, html').animate({'scrollTop': 0}, 500)"><i
		class="icmn-arrow-up"></i></a>
	</div>
	</div>
	</div>
	</div>
	</div>
</body>

</html>