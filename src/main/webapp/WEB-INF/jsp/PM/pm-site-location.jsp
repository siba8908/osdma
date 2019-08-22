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
								<h3 class="text-black">
									<strong>Create Site Code</strong>
								</h3>
								<p class="text-muted">
									<code></code>
								</p>
								<div class="table-responsive mb-6">
									<table class="table table-hover table-bordered">
										<thead>
											<tr style="background-color: #06F; font-weight: bold">
												<th><strong>Project Code</strong></th>
												<th><strong>Project Name</strong></th>
												<th><strong>Type of Station</strong></th>
												<th>Site Name(District:Block:Panchayat)</th>
												<th>Site Code</th>
											</tr>
										</thead>
										<tbody>

											<tr style="color: #06C; text-align: center">
												<td>
													<div>
														<select class="form-control" id="l13">
															<option>Osdma-station 1</option>
															<option>Osdma-station 2</option>
															<option>Osdma-station 3</option>
															<option>Osdma-station 4</option>
															<option>Osdma-station 5</option>
														</select>
													</div>
												</td>
												<td>
													<div>
														<select class="form-control" id="l13">
															<option>1050 station</option>
															<option>1050 station 1</option>
															<option>1050 station 2</option>
															<option>1050 station 3</option>
															<option>1050 station 4</option>
														</select>
													</div>
												</td>
												<td>
													<div>
														<select class="form-control" id="l13">
															<option>ARG</option>
															<option>AWS</option>
															<option>AWS-A</option>

														</select>
													</div>
												</td>
												<td>Puri:Nimapara:Nimapara</td>
												<td>Pur-Nim-001</td>
											</tr>

											<tr style="color: #06C; text-align: center">
												<td>
													<div>
														<select class="form-control" id="l13">
															<option>Osdma-station 1</option>
															<option>Osdma-station 2</option>
															<option>Osdma-station 3</option>
															<option>Osdma-station 4</option>
															<option>Osdma-station 5</option>
														</select>
													</div>
												</td>
												<td>
													<div>

														<select class="form-control" id="l13">
															<option>1050 station</option>
															<option>1050 station 1</option>
															<option>1050 station 2</option>
															<option>1050 station 3</option>
															<option>1050 station 4</option>
														</select>
													</div>
												</td>
												<td>
													<div>



														<select class="form-control" id="l13">
															<option>ARG</option>
															<option>AWS</option>
															<option>AWS-A</option>
														</select>
													</div>
												</td>
												<td>Puri:Nimapara:Nimapara</td>
												<td>Pur-Nim-001</td>
											</tr>
											<tr style="color: #06C; text-align: center">
												<td>
													<div>
														<select class="form-control" id="l13">
															<option>Osdma-station 1</option>
															<option>Osdma-station 2</option>
															<option>Osdma-station 3</option>
															<option>Osdma-station 4</option>
															<option>Osdma-station 5</option>
														</select>
													</div>
												</td>

												<td>
													<div>

														<select class="form-control" id="l13">
															<option>1050 station</option>
															<option>1050 station 1</option>
															<option>1050 station 2</option>
															<option>1050 station 3</option>
															<option>1050 station 4</option>
														</select>
													</div>
												</td>
												<td>
													<div>



														<select class="form-control" id="l13">
															<option>ARG</option>
															<option>AWS</option>
															<option>AWS-A</option>

														</select>
													</div>
												</td>
												<td>Puri:Nimapara:Nimapara</td>
												<td>Pur-Nim-001</td>
											</tr>
										</tbody>

									</table>
									<table class="table table-hover table-bordered">
										<thead>
											<tr style="background-color: #06F; font-weight: bold">
												<th><strong>Site Code</strong></th>
												<th><strong>Site
														Name(Disteict:Block:Panchayat)</strong></th>
												<th><strong>Longitude</strong></th>
												<th>Latitude</th>
											</tr>
										</thead>
										<tbody>

											<tr style="color: #06C; text-align: center">
												<td>Pur-NIM-001</td>
												<td>PURI:Nimapara:Nimapara</td>
												<td><input type="password" class="form-control"></td>
												<td><input type="password" class="form-control"></td>

											</tr>
											<tr style="color: #06C; text-align: center">
												<td>Pur-NIM-001</td>
												<td>PURI:Nimapara:Nimapara</td>
												<td><input type="password" class="form-control" /></td>
												<td><input type="password" class="form-control" /></td>
												<td><div class="pull-right">

														<a href="javascript: void(0);"
															class="btn btn-sm btn-primary ml-10"> Save </a>
													</div></td>
											</tr>
											<tr style="color: #06C; text-align: center">
												<td></td>


												<td></td>
												<td></td>
												<td>
													<div class="pull-right">

														<a href="javascript: void(0);"
															class="btn btn-sm btn-primary ml-10"> Save </a>
													</div>
												</td>

											</tr>
										</tbody>
									</table>
								</div>

							</div></div>
					</section>
					<!-- END: tables/basic-tables -->

					<!-- START: page scripts -->

					<!-- END: page scripts -->

				</div>
			</div>
		</div></div>
</body>

</html>