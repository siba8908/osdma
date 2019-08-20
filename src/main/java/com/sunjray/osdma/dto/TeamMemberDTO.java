package com.sunjray.osdma.dto;

import java.util.List;

public class TeamMemberDTO {

	private String teamName;
	private List<Long> teamMembersEmployeeId;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Long> getTeamMembersEmployeeId() {
		return teamMembersEmployeeId;
	}

	public void setTeamMembersEmployeeId(List<Long> teamMembersEmployeeId) {
		this.teamMembersEmployeeId = teamMembersEmployeeId;
	}

	@Override
	public String toString() {
		return "TeamMemberDTO [teamName=" + teamName + ", teamMembersEmployeeId=" + teamMembersEmployeeId + "]";
	}

}
