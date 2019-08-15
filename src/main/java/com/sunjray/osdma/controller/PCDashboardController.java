package com.sunjray.osdma.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.sunjray.osdma.AMmodel.AMDashboard;
import com.sunjray.osdma.AMservice.AMDashboardService;
@Controller
@RequestMapping("pc")
public class PCDashboardController {
	@Autowired
	private AMDashboardService dashboardService;

	//LOAD DASHBOARD
	@RequestMapping(value= "/pc-dashboard",method=RequestMethod.GET)
	public ModelAndView getPCDetails(){
		return new	ModelAndView ("PC/pc-Dashboard","dashboard",null);
	}

}
