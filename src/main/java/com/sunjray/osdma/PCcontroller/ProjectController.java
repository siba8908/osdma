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

import com.sunjray.osdma.PCmodel.Project;
import com.sunjray.osdma.PCmodel.SiteSurvey;
import com.sunjray.osdma.PCrepository.ProjectRepository;

@RestController
@RequestMapping("/api")
public class ProjectController {
	@Autowired
	private ProjectRepository projectRepository;
	
	@GetMapping("/fetch-project")
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}
	
	@PostMapping("/save-project")
	@ResponseStatus(HttpStatus.CREATED)
	public void registerAccount(@Valid @RequestBody Project project) {
		projectRepository.save(project);
	}
}
