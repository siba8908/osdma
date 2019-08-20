package com.sunjray.osdma.PCservice;

import com.sunjray.osdma.PCmodel.MasterTeam;
import com.sunjray.osdma.dto.TeamMemberDTO;

public interface MasterTeamService {

	MasterTeam createTeamWithMembers(TeamMemberDTO teamMemberDTO);

}
