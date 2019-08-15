package com.sunjray.osdma.PCcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
