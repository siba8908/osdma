package com.sunjray.osdma.SMcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SMIndexController {

	@RequestMapping("/sm-district-warehouse-dashboard")
	String smDashboard() {
		return "SM/sm-district-warehouse-dashboard";
	}
	
	
	@RequestMapping("/sm-district-warehouse-product-list")
	String smWarehouseProductList() {
		return "SM/sm-district-warehouse-product-list";
	}
	
	
	@RequestMapping("/sm-district-warehouse-stocks")
	String smWarehouseStocks() {
		return "SM/sm-district-warehouse-stocks";
	}

}
