<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/pc-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Project co-orinator </strong> <small
						class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/selectboxes -->
					<section class="card">
						<div class="card-header"
							style="background-color: #FFF; color: #FFF">
							<span class="cui-utils-title"> <strong>Project
									Status</strong>
							</span>
						</div>

						<div class="table-responsive mb-5">

							<table class="table table-hover">
								<thead>

									<tr style="background-color: #09F">
										<th>Station Code</th>
										<th>Site Survey</th>
										<th>Civil Work</th>
										<th>Electrical Work</th>
										<th>Installation Commision</th>
										<th>Performance of Station</th>
										<th>Handover to Blockoff</th>
										<th>% of Work Completion</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>001</td>
										<td>12%</td>
										<td>10%</td>
										<td>30%</td>
										<td>20%</td>
										<td>60%</td>
										<td>45%</td>
										<td>45%</td>
									</tr>
									<tr>
										<td>002</td>
										<td>12%</td>
										<td>10%</td>
										<td>30%</td>
										<td>20%</td>
										<td>60%</td>
										<td>45%</td>
										<td>45%</td>
									</tr>
									<tr>
										<td>003</td>
										<td>12%</td>
										<td>10%</td>
										<td>30%</td>
										<td>20%</td>
										<td>60%</td>
										<td>45%</td>
										<td>45%</td>
									</tr>
									<tr>
										<td>004</td>
										<td>12%</td>
										<td>10%</td>
										<td>30%</td>
										<td>20%</td>
										<td>60%</td>
										<td>45%</td>
										<td>45%</td>
									</tr>
									<tr>
										<td>005</td>
										<td>12%</td>
										<td>10%</td>
										<td>30%</td>
										<td>20%</td>
										<td>60%</td>
										<td>45%</td>
										<td>45%</td>
									</tr>
								</tbody>
								<tfoot>
							</table>
						</div>

						<!-- END: forms/selectboxes -->

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
									$('#datepicker-only-init1')
											.datetimepicker(
													{
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
									$('#datepicker-only-init2')
											.datetimepicker(
													{
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
									$('#datepicker-only-init3')
											.datetimepicker(
													{
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
									$('#datepicker-only-init4')
											.datetimepicker(
													{
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
									$('#datepicker-only-init6')
											.datetimepicker(
													{
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
									$('#datepicker-only-init7')
											.datetimepicker(
													{
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
									$('#datepicker-only-init8')
											.datetimepicker(
													{
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
									$('#datepicker-only-init9')
											.datetimepicker(
													{
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
							})(jQuery)
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
									<div class="cui-footer-description">
										<p></p>

										<p></p>
									</div>
								</div>
							</div>
						</div>
						<div class="cui-footer-bottom">
							<div class="row">
								<div class="col-md-4"></div>
								<div class="col-md-8">
									<div class="cui-footer-company">

										<span> <br />

										</span>
									</div>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="osdmajs/common.js"></script>
</body>
</html>