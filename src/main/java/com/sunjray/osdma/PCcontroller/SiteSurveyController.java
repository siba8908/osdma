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

import com.sunjray.osdma.PCmodel.SiteSurvey;
import com.sunjray.osdma.PCservice.SiteSurveyService;

@RestController
@RequestMapping("/api")
public class SiteSurveyController {
	@Autowired
	private SiteSurveyService siteSurveyService;

	@PostMapping("/save-site-survey")
	@ResponseStatus(HttpStatus.CREATED)
	public void registerAccount(@Valid @RequestBody List<SiteSurvey> siteSurvey) {
		siteSurveyService.save(siteSurvey);
	}

}
