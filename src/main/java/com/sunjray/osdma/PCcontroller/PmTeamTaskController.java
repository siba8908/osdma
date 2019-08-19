package com.sunjray.osdma.PCcontroller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.PmTeamTaskMap;
import com.sunjray.osdma.PCrepository.PmTeamTaskRepository;
import com.sunjray.osdma.PCservice.PmTeamTaskService;

@RestController
@RequestMapping("/api")
public class PmTeamTaskController {
	@Autowired
	private PmTeamTaskRepository pmTeamTaskRepository;
	@Autowired
	private PmTeamTaskService pmTeamTaskService;

	@GetMapping("/fetch-pm-team-task")
	public List<PmTeamTaskMap> getAllTeamTask() {
		return pmTeamTaskRepository.findAll();
	}

	@PostMapping("/update-pm-team-task")
	@ResponseStatus(HttpStatus.CREATED)
	public void registerAccount(@Valid @RequestBody PmTeamTaskMap pmTeamTaskMap) {
		pmTeamTaskService.update(pmTeamTaskMap);
	}
	
	
	@GetMapping("/get-work-status")
	public List<Map<String, String>> getAllWorkStatus() {
		return pmTeamTaskService.getAllWorkStatus();
	}
}
