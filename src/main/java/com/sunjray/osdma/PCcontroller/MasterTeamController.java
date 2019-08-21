package com.sunjray.osdma.PCcontroller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.MasterTeam;
import com.sunjray.osdma.PCmodel.PmTeamMember;
import com.sunjray.osdma.PCrepository.MasterTeamRepository;
import com.sunjray.osdma.PCservice.MasterTeamService;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.dto.TeamMemberDTO;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("/api")
public class MasterTeamController {
	
	private final Logger log = LoggerFactory.getLogger(MasterTeamController.class);
	
	@Resource
	MasterTeamRepository masterTeamRepository;
	
	@Resource
	MasterTeamService masterTeamService;
	
	/**
     * GET  /fetch-teams : get all the MasterTeams.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of MasterTeams in body
     */
    @GetMapping("/fetch-teams")
    public List<MasterTeam> getAllTeams() {
        log.debug("REST request to get all MasterTeams");
        return masterTeamRepository.findAll();
    }
    
    
    @PostMapping("/create-team-with-members")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> createTeamWithMembers(@RequestBody TeamMemberDTO teamMemberDTO) throws URISyntaxException {
        log.debug("REST request to create MasterTeams");
        masterTeamService.createTeamWithMembers(teamMemberDTO);
        return ResponseEntity.created(new URI("/api/create-team-with-members"))
	            .headers(HeaderUtil.createEntityCreationAlert("MasterTeam", "created"))
	            .body(new AppResponse("success"));
    }
    
    
    /**
     * POST  /fetch-team-members : get  PmTeamMembers.
     *
     * @param PmTeamMember 
     * @return the ResponseEntity with status 200 and with body the List of PmTeamMembers
     */
    @PostMapping("/get-team-members")
    public List<TeamMemberDTO> getTeamMemberByTeam(@RequestBody PmTeamMember pmTeamMember) {
        return masterTeamService.findByMasterTeam(pmTeamMember.getMasterTeam());
    }

}
