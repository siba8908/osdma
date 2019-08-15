package com.sunjray.osdma.PCcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/pc-dashboard")
	String pcdashboard() {
		return "PC/pc-dashboard";
	}

	@RequestMapping("/pc-site-survey")
	String pcsitesurvey() {
		return "PC/pc-site-survey";
	}

	@RequestMapping("/pc-letter-of-clearance")
	String pcletterofclearance() {
		return "PC/pc-letter-of-clearance";
	}

	@RequestMapping("/pc-team-update")
	String pcteamupdate() {
		return "PC/pc-team-update";
	}

	@RequestMapping("/pc-material-request")
	String pcmaterialrequest() {
		return "PC/pc-material-request";
	}

	@RequestMapping("/pc-material-status")
	String pcmaterialstatus() {
		return "PC/pc-material-status";
	}

	@RequestMapping("/pc-daily-work-status")
	String pcdailyworkstatus() {
		return "PC/pc-daily-work-status";
	}

	@RequestMapping("/pc-fund-Request")
	String pcfundRequest() {
		return "PC/pc-fund-Request";
	}

	@RequestMapping("/pc-fund-requisition-status")
	String pcfundrequisitionstatus() {
		return "PC/pc-fund-requisition-status";
	}

	@RequestMapping("/pc-project-status")
	String pcprojectstatus() {
		return "PC/pc-project-status";
	}

}
