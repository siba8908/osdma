package com.sunjray.osdma.PCcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.MasterTeam;
import com.sunjray.osdma.PCrepository.MasterTeamRepository;

@RestController
@RequestMapping("/api")
public class MasterTeamController {
	
	private final Logger log = LoggerFactory.getLogger(MasterTeamController.class);
	
	@Resource
	MasterTeamRepository masterTeamRepository;
	
	/**
     * GET  /fetch-teams : get all the MasterTeams.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of MasterTeams in body
     */
    @GetMapping("/fetch-teams")
    public List<MasterTeam> getAllCropSymptoms() {
        log.debug("REST request to get all CropSymptoms");
        return masterTeamRepository.findAll();
    }

}
