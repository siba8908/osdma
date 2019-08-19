package com.sunjray.osdma.PMcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PMIndexController {

	@RequestMapping("/pm-create-site-code")
	String pmcreatesitecode() {
		return "PM/pm-create-site-code";
	}

	@RequestMapping("/pm-create-team")
	String pmcreateteam() {
		return "PM/pm-create-team";
	}

	@RequestMapping("/pm-create-project")
	String pmcreateproject() {
		return "PM/pm-create-project";
	}

	@RequestMapping("/pm-create-task")
	String pmcreatetask() {
		return "PM/pm-create-task";
	}

	@RequestMapping("/pm-create-assign-task")
	String pmcreateassigntask() {
		return "PM/pm-create-assign-task";
	}

	@RequestMapping("/pm-Daily-work-status")
	String pmDailyworkstatus() {
		return "PM/pm-Daily-work-status";
	}

	@RequestMapping("pm-fund-requisition")
	String pmfundrequisition() {
		return "PM/pm-fund-requisition";
	}

	@RequestMapping("/pm-resourse-utilisation")
	String pmresourseutilisation() {
		return "PM/pm-resourse-utilisation";
	}

}
