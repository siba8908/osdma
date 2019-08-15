package com.sunjray.osdma.PCservice;

import javax.validation.Valid;

import com.sunjray.osdma.PCmodel.PmTeamTaskMap;

public interface PmTeamTaskService {

	void update(@Valid PmTeamTaskMap pmTeamTaskMap);

}
