package com.sunjray.osdma.SMcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SMIndexController {

	@RequestMapping("/sm-district-warehouse-product-list")
	String smWarehouseProductList() {
		return "SM/sm-district-warehouse-product-list";
	}
	
	
	@RequestMapping("/sm-district-warehouse-stocks")
	String smWarehouseStocks() {
		return "SM/sm-district-warehouse-stocks";
	}
	
	@RequestMapping("/sm-logistics-dashboard")
	String smLogisticDashboard() {
		return "SM/sm-logistics-dashboard";
	}
	
	@RequestMapping("/sm-logistics-order-tracking-details")
	String smLogisticOrderTrackingDetails() {
		return "SM/sm-logistics-order-tracking-details";
	}
	
	@RequestMapping("/sm-logistics-status")
	String smLogisticStatus() {
		return "SM/sm-logistics-status";
	}

}
