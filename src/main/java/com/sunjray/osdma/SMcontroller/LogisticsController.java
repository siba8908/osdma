package com.sunjray.osdma.SMcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMservice.LogisticsService;
import com.sunjray.osdma.dto.ConsignmentLogisticDTO;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {

	@Resource
	LogisticsService logisticsService;
	
	@GetMapping("/fetch-logistics-status")
	public List<ConsignmentLogisticDTO> getAllConsignmentLogisticStatus() {
		return logisticsService.findConsignmentLogisticStatus();
	}
	
	
	@GetMapping("/fetch-track-details")
	public List<ConsignmentLogisticDTO> getAllConsignmentLogisticTrackDetails() {
		return logisticsService.findConsignmentTrackDetails();
	}
	
	@GetMapping("/fetch-dashboard-details")
	public List<ConsignmentLogisticDTO> getAllConsignmentLogisticDashboardDetails() {
		return logisticsService.findConsignmentDashboardDetails();
	}
}
