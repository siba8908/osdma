package com.sunjray.osdma.AMcontroller;
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
@RequestMapping("am")
public class AMDashboardController {
	@Autowired
	private AMDashboardService dashboardService;

	//LOAD DASHBOARD
	@RequestMapping(value= "/am-dashboard",method=RequestMethod.GET)
	public ModelAndView getAllDetails(){
		List<AMDashboard> dashboard=dashboardService.getAllDetails();
		return new	ModelAndView ("AM/am-Dashboard","dashboard",dashboard);
	}

	//PAY
	@RequestMapping(value= "/dashboard_ajax",method=RequestMethod.POST)
	public  @ResponseBody AMDashboard paydashboard(@RequestBody List<AMDashboard> dashboard,HttpSession sesion) {		
		System.out.println("dashboard");
		sesion.getAttribute("userdtls");
		AMDashboard d = new AMDashboard();
		for(int i=0;dashboard.size()>i;i++) {	
			d.setDate(dashboard.get(i).getDate());
			d.setApprovedAmount(dashboard.get(i).getApprovedAmount());
			System.out.println("Date:"+dashboard.get(i).getDate());
			dashboardService.paydashboard(d);
		}	
		return 	d;		
	}

}
