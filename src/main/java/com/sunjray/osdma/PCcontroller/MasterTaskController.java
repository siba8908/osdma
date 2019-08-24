package com.sunjray.osdma.PCcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.MasterTask;
import com.sunjray.osdma.PCrepository.MasterTaskRepository;

@RestController
@RequestMapping("/api")
public class MasterTaskController {
	@Autowired
	private MasterTaskRepository masterTaskRepository;

	@PostMapping("/save-master-task")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveMasterTask(@Valid @RequestBody List<MasterTask> masterTask) {
		masterTaskRepository.saveAll(masterTask);
	}

	@GetMapping("/fetch-master-task")
	public List<MasterTask> getAllMasterTask() {
		return masterTaskRepository.findAll();
	}

}
