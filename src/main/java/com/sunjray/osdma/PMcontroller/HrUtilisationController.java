package com.sunjray.osdma.PMcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PMmodel.HrUtilisation;
import com.sunjray.osdma.PMRepository.HrUtilisationRepository;

@RestController
@RequestMapping("/api")
public class HrUtilisationController {
	@Autowired
	private HrUtilisationRepository hrUtilisationRepository;

	@GetMapping("/fetch-resource-utilisation")
	public List<HrUtilisation> getAllResourceUtilisation() {
		return hrUtilisationRepository.findAll();
	}

}
