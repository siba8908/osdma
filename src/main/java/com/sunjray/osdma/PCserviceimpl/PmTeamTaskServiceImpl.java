package com.sunjray.osdma.PCserviceimpl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.PmTeamTaskMap;
import com.sunjray.osdma.PCrepository.PmTeamMemberRepository;
import com.sunjray.osdma.PCrepository.PmTeamTaskRepository;
import com.sunjray.osdma.PCservice.PmTeamTaskService;

@Service
public class PmTeamTaskServiceImpl implements PmTeamTaskService {
	@Autowired
	private PmTeamTaskRepository pmTeamTaskRepository;

	@Autowired
	private PmTeamMemberRepository pmTeamMemberRepository;

	@Override
	public void update(@Valid PmTeamTaskMap pmTeamTaskMap) {
		if (pmTeamTaskMap.getMasterTeam().getPmTeamMembers().stream().findFirst().get()
				.getStatus() == Status.ACCEPTED) {
			pmTeamMemberRepository.save(pmTeamTaskMap.getMasterTeam().getPmTeamMembers().stream().findFirst().get());
		} else {
			//MailUtil.sendMail("siba8908@gmail.com", "Task Rejected", "Dear User, "+pmTeamTaskMap.getMasterTask().getTaskName()+"is Rejected by PC");
			pmTeamMemberRepository.save(pmTeamTaskMap.getMasterTeam().getPmTeamMembers().stream().findFirst().get());
		}

	}

}
