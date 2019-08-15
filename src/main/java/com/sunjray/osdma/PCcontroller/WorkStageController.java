package com.sunjray.osdma.PCcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.MasterWorkStage;
import com.sunjray.osdma.PCrepository.WorkStageRepository;

@RestController
@RequestMapping("/api")
public class WorkStageController {

	@Autowired
	private WorkStageRepository workStageRepository; 

	@GetMapping("/fetch-work-stage")
	public List<MasterWorkStage> getAllMasterWorkStage() {
		return workStageRepository.findAll();
	}

}
