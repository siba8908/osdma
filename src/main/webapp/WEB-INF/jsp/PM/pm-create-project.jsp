<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/pm-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Project Management </strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: tables/basic-tables -->
					<section class="card">
						<div class="card-header"></div>

						<div class="row">
							<div class="col-lg-12">
								<h4 class="text-black">
									<strong></strong>
								</h4>
								<br />
								<h5 style="color: #066; font-family: 'Arial Black', Gadget">
									<strong>Create Project</strong>
								</h5>
								<p class="text-muted">
									<code></code>
								</p>
								<div class="table-responsive mb-6">
									<table class="table table-hover table-bordered">
										<thead>
											<tr style="background-color: #06F; font-weight: bold">
												<th><h4>
														<strong>Project Code</strong>
													</h4></th>
												<th><h4>
														<strong>Project Name</strong>
													</h4></th>
												<th><h4>
														<strong>Duration</strong>
													</h4></th>
												<th></th>
												<th><h4>
														<strong>No of Station</strong>
													</h4></th>
												<th></th>
												<th></th>
											</tr>
										</thead>
										<tbody>
											<tr style="background-color: #CCC; font-weight: bold">
												<td></td>
												<td></td>
													<td><strong>Start Date</strong></td>
													<td><strong>End Date</strong></td>

													<td><strong>ARG</strong></td>
													<td><strong>AWS</strong></td>
													<td><strong>AWS-A</strong></td>
											</tr>
											<tr style="color: #06C; text-align: center">
												<td>OSDMA-Stage1</td>


												<td>1050 Station</td>
												<td><div class="form-group">
														<input type="text" class="form-control"
															placeholder="Select Date" id="datepicker-only-init"
															data-toggle="datetimepicker"
															data-target="#datepicker-only-init" />
													</div></td>

												<td><div class="form-group">
														<input type="text" class="form-control"
															placeholder="Select Date" id="datepicker-only-init1"
															data-toggle="datetimepicker"
															data-target="#datepicker-only-init1" />
													</div></td>

												<td>80</td>

												<td>90</td>
												<td>700</td>
											</tr>

											<tr style="color: #06C; text-align: center">
												<td>OSDMA-Stage1</td>


												<td>1050 Station</td>
												<td><div class="form-group">
														<input type="text" class="form-control"
															placeholder="Select Date" id="datepicker-only-init2"
															data-toggle="datetimepicker"
															data-target="#datepicker-only-init2" />
													</div></td>

												<td><div class="form-group">
														<input type="text" class="form-control"
															placeholder="Select Date" id="datepicker-only-init3"
															data-toggle="datetimepicker"
															data-target="#datepicker-only-init3" />
													</div></td>

												<td>80</td>

												<td>90</td>
												<td>700</td>
											</tr>

											<tr style="color: #06C; text-align: center">
												<td>OSDMA-Stage1</td>


												<td>1050 Station</td>
												<td><div class="form-group">
														<input type="text" class="form-control"
															placeholder="Select Date" id="datepicker-only-init4"
															data-toggle="datetimepicker"
															data-target="#datepicker-only-init4" />
													</div></td>

												<td><div class="form-group">
														<input type="text" class="form-control"
															placeholder="Select Date" id="datepicker-only-init5"
															data-toggle="datetimepicker"
															data-target="#datepicker-only-init5" />
													</div></td>

												<td>80</td>

												<td>90</td>
												<td>700</td>
											</tr>
										</tbody>

									</table>

									<div class="pull-right">

										<a href="javascript: void(0);"
											class="btn btn-sm btn-primary ml-10"> Save </a>
									</div>
								</div>
							</div></div>
					</section>
					<!-- END: tables/basic-tables -->

					<!-- START: page scripts -->

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
									<div class="cui-footer-description"></div>
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
													src="../components/dummy-assets/common/img/N-m.png"
													width="90" height="auto" title="#" /> <span>
													© 2019 <a href="#" target="_blank">Powered by Nucigent
														Technology</a>

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
		</div>
	</div>

</body>

</html>