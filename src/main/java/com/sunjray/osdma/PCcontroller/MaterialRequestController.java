package com.sunjray.osdma.PCcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.PcMaterialRequest;
import com.sunjray.osdma.PCservice.MaterialRequestService;

@RestController
@RequestMapping("/api")
public class MaterialRequestController {
	@Autowired
	private MaterialRequestService materialRequestService;

	@PostMapping("/save-material-request")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveMaterialRequest(@Valid @RequestBody List<PcMaterialRequest> materialRequest) {
		materialRequestService.saveMaterialRequest(materialRequest);
	}
}
