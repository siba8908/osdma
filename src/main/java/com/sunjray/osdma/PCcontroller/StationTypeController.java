package com.sunjray.osdma.PCcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.MasterStationType;
import com.sunjray.osdma.PCrepository.StationTypeRepository;

@RestController
@RequestMapping("/api")
public class StationTypeController {

	@Autowired
	private StationTypeRepository stationTypeRepository;

	@GetMapping("/fetch-station-type")
	public List<MasterStationType> getAllStationType() {
		return stationTypeRepository.findAll();
	}
}
