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
									<strong>Create Task</strong>
								</h5>
								<p class="text-muted">
									<code></code>
								</p>
								<div class="table-responsive mb-6">
									<table class="table table-hover table-bordered">
										<thead>
											<tr style="background-color: #06F; font-weight: bold">
												<th><strong>Sl No</strong></th>
												<th><strong>Task Name</strong></th>
												<th><strong>Workk Stage</strong></th>
												<th>Duration</th>
												<th></th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>01</td>
												<td>Site Verification</td>
												<td>Site Survey</td>
												<td>10</td>
												<td>
													<div>

														<a href="javascript: void(0);"
															class="btn btn-sm btn-primary ml-10"> ADD </a>
													</div>
												</td>
											</tr>


											<tr>
												<td>02</td>
												<td>Site Preparation</td>
												<td>Civil stage</td>
												<td>20</td>
												<td>
													<div>

														<a href="javascript: void(0);"
															class="btn btn-sm btn-primary ml-10"> ADD </a>
													</div>
												</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Installation</td>
												<td>Electrical Stage</td>
												<td>10</td>
												<td>
													<div>

														<a href="javascript: void(0);"
															class="btn btn-sm btn-primary ml-10"> ADD </a>
													</div>
												</td>
											</tr>

										</tbody>

									</table>

									<div class="pull-right">

										<a href="javascript: void(0);"
											class="btn btn-sm btn-primary ml-10"> Update </a>
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
													width="90" height="auto" title="#" /> <span> ©
													2019 <a href="#" target="_blank">Powered by Nucigent
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