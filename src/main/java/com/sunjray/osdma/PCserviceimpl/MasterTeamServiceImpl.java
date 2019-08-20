package com.sunjray.osdma.PCserviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.MasterTeam;
import com.sunjray.osdma.PCmodel.PmTeamMember;
import com.sunjray.osdma.PCrepository.MasterTeamRepository;
import com.sunjray.osdma.PCrepository.PmTeamMemberRepository;
import com.sunjray.osdma.PCservice.MasterTeamService;
import com.sunjray.osdma.PMrepository.EmployeePersonalDetailsRepository;
import com.sunjray.osdma.dto.TeamMemberDTO;

@Service
public class MasterTeamServiceImpl implements MasterTeamService {
	
	@Resource
	MasterTeamRepository masterTeamRepository;
	
	@Resource
	PmTeamMemberRepository pmTeamMemberRepository;
	
	@Resource
	EmployeePersonalDetailsRepository employeePersonalDetailsRepository;
	

	@Override
	public MasterTeam createTeamWithMembers(TeamMemberDTO teamMemberDTO) {
		MasterTeam masterTeam = new MasterTeam();
		masterTeam.setTeamName(teamMemberDTO.getTeamName());
		MasterTeam result = masterTeamRepository.save(masterTeam);
		
		List<PmTeamMember> pmTeamMembers = new ArrayList<>();
		
		teamMemberDTO.getTeamMembersEmployeeId().forEach(employeeId -> {
			PmTeamMember pmTeamMember = new PmTeamMember();
			pmTeamMember.setMasterTeam(result);
			pmTeamMember.setEmployeePersonalDetails(employeePersonalDetailsRepository.findById(employeeId).get());
			pmTeamMember.setStatus(Status.ACCEPTED);
			
			pmTeamMembers.add(pmTeamMember);
		});
		
		pmTeamMemberRepository.saveAll(pmTeamMembers);
		return result;
		
	}

}
