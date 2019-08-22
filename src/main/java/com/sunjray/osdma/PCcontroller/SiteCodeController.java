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

import com.sunjray.osdma.PCmodel.Sitecode;
import com.sunjray.osdma.PCrepository.SitecodeRepository;

@RestController
@RequestMapping("/api")
public class SiteCodeController {

	@Autowired
	private SitecodeRepository sitecodeRepository;

	@GetMapping("/fetch-site-code")
	public List<Sitecode> getAllSitecode() {
		return sitecodeRepository.findAll();
	}

	@PostMapping("/save-site-code")
	@ResponseStatus(HttpStatus.CREATED)
	public void registerAccount(@Valid @RequestBody List<Sitecode> sitecode) {
		sitecodeRepository.saveAll(sitecode);
	}

}
