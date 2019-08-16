package com.sunjray.osdma.SMwarehouseAController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WarehouseAIndexController {

	@RequestMapping("/sm-warehouse-a-dashboard")
	String smWarehouseADashboard() {
		return "WAREHOUSE-A/sm-warehouse-a-dashboard";
	}

	@RequestMapping("/sm-warehouse-a-defective-material")
	String smWarehouseADefectiveMaterial() {
		return "WAREHOUSE-A/sm-warehouse-a-defective-material";
	}

	@RequestMapping("/sm-warehouse-a-material-list")
	String smWarehouseAMaterialList() {
		return "WAREHOUSE-A/sm-warehouse-a-material-list";
	}

	@RequestMapping("/sm-warehouse-a-upload-bill")
	String smWarehouseAUploadBill() {
		return "WAREHOUSE-A/sm-warehouse-a-upload-bill";
	}

	@RequestMapping("/sm-warehouse-a-stocks")
	String smWarehouseAStocks() {
		return "WAREHOUSE-A/sm-warehouse-a-stocks";
	}

}
