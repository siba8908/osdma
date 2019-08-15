package com.sunjray.osdma.PCcontroller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.ProjProdMap;
import com.sunjray.osdma.PCrepository.ProjectProductMapRepository;

@RestController
@RequestMapping("/api")
public class ProjectProductMapController {
	@Resource
	private ProjectProductMapRepository projectProductMapRepository;

	@GetMapping("/fetch-material-status")
	public List<ProjProdMap> getAllProduct() {
		return projectProductMapRepository.findAll();
	}

	@PostMapping("/fetch-mapped-product")
	public List<ProjProdMap> getAllProductMappedByProject(@Valid @RequestBody ProjProdMap projProdMap) {
		return projectProductMapRepository.findByMasterStationTypeAndMasterWorkStage(projProdMap.getMasterStationType(),
				projProdMap.getMasterWorkStage());
	}
}
