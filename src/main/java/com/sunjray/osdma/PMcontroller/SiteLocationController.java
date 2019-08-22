package com.sunjray.osdma.PMcontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PMRepository.SiteLocationRepository;
import com.sunjray.osdma.PMmodel.SiteLocation;

@RestController
@RequestMapping("/api")
public class SiteLocationController {
	@Autowired
	private SiteLocationRepository siteLocationRepository;

	@PostMapping("/save-site-location")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveSiteLocation(@Valid @RequestBody SiteLocation siteLocation) {
	   siteLocationRepository.save(siteLocation);
	}
}
