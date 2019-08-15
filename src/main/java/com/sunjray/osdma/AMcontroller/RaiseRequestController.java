package com.sunjray.osdma.AMcontroller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.MasterSerProviderType;
import com.sunjray.osdma.AMservice.RaiseRequestService;

@Controller
@RequestMapping("am")
public class RaiseRequestController {
	@Autowired
	Gson gson;
	@Autowired
	private RaiseRequestService accountManagerService;
	
	@RequestMapping(value="raiseRequest",method=RequestMethod.GET)
	public ModelAndView raiseRequest()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("providerDetails", accountManagerService.getAllProviderType());
		mav.setViewName("AM/am_raise_request");
		return mav;
	}
	
	@RequestMapping(value="account_Manager_ajax",method=RequestMethod.POST)
	public @ResponseBody List<RaiseRequest> serviceProviderRequest(@RequestBody MasterSerProviderType masterSerProviderType)
	{
		System.out.println("AccountManager......");
		List<RaiseRequest> accountManagerObj=null;
		accountManagerObj=accountManagerService.getAllServiceProviderAccountDetails(masterSerProviderType);
		return accountManagerObj;
	}
	
	@RequestMapping(value="raiseRequest_ajax",method=RequestMethod.POST)
	public @ResponseBody String saveRaiseRequest(@RequestBody RaiseRequest accountManager) 
	{
		String message=null;
	
		message=accountManagerService.saveRaiseRequest(accountManager);
		return gson.toJson(message);
		
	}
}
