package com.sunjray.osdma.PCcontroller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.PcMaterialRequest;
import com.sunjray.osdma.PCrepository.MaterialRequestRepository;
import com.sunjray.osdma.PCservice.MaterialRequestService;

@RestController
@RequestMapping("/api")
public class MaterialRequestController {
	@Autowired
	private MaterialRequestService materialRequestService;
	
	@Resource
	private MaterialRequestRepository materialRequestRepository;

	@PostMapping("/save-material-request")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveMaterialRequest(@Valid @RequestBody List<PcMaterialRequest> materialRequest) {
		materialRequestService.saveMaterialRequest(materialRequest);
	}
	
	@GetMapping("/fetch-material-request")
	public List<PcMaterialRequest> fetchMaterialRequest() {
		return materialRequestRepository.findAll();
	}
}
