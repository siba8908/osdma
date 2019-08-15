package com.sunjray.osdma.HRservice;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.sunjray.osdma.HRmodel.EmployeeBean;
import com.sunjray.osdma.HRmodel.Leave;
import com.sunjray.osdma.HRmodel.User;



public interface RecreitmentService {

	public void addUser(User u);

	public Iterable<User> getUsers();

	void deleteUser(Long userid);
	
	List<User> findAllActiveUser();

	int saveUser(User user,HttpSession session);

	/* public List<> showPayroll(); */
	

	 
	

}
