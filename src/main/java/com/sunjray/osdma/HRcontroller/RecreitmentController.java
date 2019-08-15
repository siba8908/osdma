package com.sunjray.osdma.HRcontroller;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.sunjray.osdma.HRmodel.User;
import com.sunjray.osdma.HRservice.RecreitmentService;
import com.sunjray.osdma.constants.AppConstants;;


@Controller
@RequestMapping("hr")
public class RecreitmentController {
	
	@Autowired
	private RecreitmentService recreitmentService;
	@Autowired
	Gson gson;
	
	/****************** Show List******************* */
	
    User user=null;
	
	@RequestMapping(value= "/recruitmentList",method=RequestMethod.GET)
	public ModelAndView login(){
		System.out.println("....HR....");
		return new ModelAndView ("HR/hr-recruitment-list");
	}
	
	/*
	 * @RequestMapping(value= "/postdata",method=RequestMethod.POST)
	 * public @ResponseBody void postdata(@RequestBody Map<String, ArrayList<User>>
	 * Users){ System.out.println("....DATA...."); //return
	 * hrservice.addUser(Users); }
	 */
/*
 * Get Dynamic Field Value
 */
	/**************************** Add User********************* */
	
	@RequestMapping(value="/postformdata",method=RequestMethod.POST)
	public  @ResponseBody String  postTimesheet(@RequestBody HashMap<Integer, User> u,HttpSession session) 
	{
		try {
		System.out.println(u.size());
	
		user=new User();
		for(int i=0;i<u.size();i++) {
			user.setName(u.get(i).getName());
			System.out.println(u.get(i).getName());
			user.setEmail(u.get(i).getEmail());
			recreitmentService.addUser(user);
			
		}
		return  gson.toJson(AppConstants.INSERTSUCESSMSG);
		}catch(Exception e) {
			return  gson.toJson(AppConstants.ERRORMSG);
		}
	}
		
		
	
	/****************** Get All Active User*************************** */
	
	@RequestMapping(value = "/getuser_ajax")
	public @ResponseBody Iterable<User> getUsers(HttpSession session) {
		System.out.println("ajax.....");

		return recreitmentService.findAllActiveUser();
	}
	
	


	
	/*
	 * @RequestMapping(value = "/deleteemployee_ajax", method = RequestMethod.POST)
	 * public @ResponseBody int employeeDelete(HttpSession session, @RequestBody
	 * User user) { System.out.println("++++++++"); return
	 * hrservice.employeeDelete();
	 * 
	 * }
	 */
	
	/********************** Delete User************************* */
	

  @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
  public @ResponseBody String deleteUser(@RequestBody User user) { 
	  //String Status="INACTIVE";
  	System.out.println("tttttttttttttttt"+user.getUserId());
  	recreitmentService.deleteUser(user.getUserId());
  return null; 
  }
  
	/***************************** Update User **************************/
  
  @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
  public @ResponseBody String upadteUsers(@RequestBody User user,HttpSession session) { 
	  System.out.println(user.getUserId());
	  int count=recreitmentService.saveUser(user,session);
	  if(count!=0)
	  {
		System.out.println("bibhu"+user.getUserId());
	  }
	  
	  return null; 
  }
  
	 
  
  
  
  }
 
