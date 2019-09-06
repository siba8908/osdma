package com.sunjray.osdma.SMcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMservice.DistrictWarehouseService;
import com.sunjray.osdma.dto.DistrictWarehouseProductDTO;

@RestController
@RequestMapping("/dw")
public class DistrictWarehouseController {
	
	@Resource
	DistrictWarehouseService districtWarehouseService;
	
	
	@GetMapping("/fetch-logistics-status")
	public List<DistrictWarehouseProductDTO> getAllProductList() {
		//return logisticsService.findConsignmentLogisticStatus();
		return null;
	}
}
