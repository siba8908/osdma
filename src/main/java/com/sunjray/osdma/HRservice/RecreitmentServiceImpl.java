package com.sunjray.osdma.HRservice;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjray.osdma.HRmodel.EmployeeBean;
import com.sunjray.osdma.HRmodel.Leave;
import com.sunjray.osdma.HRmodel.User;
import com.sunjray.osdma.HRrepository.RecreitmentDAO;



@Service
public class RecreitmentServiceImpl implements RecreitmentService {
	
	
	@Autowired
	RecreitmentDAO recreitmentDAO;
	
	@Transactional
	  @Override 
	  public void addUser(User u) {
	  System.out.println("bibhu......................."); 
		/*
		 * User ue= hrRepository.save(u); System.out.println(ue.getUser_id());
		 */
	  String email=u.getEmail();
	  String name=u.getName();
	  recreitmentDAO.addUser(email,name);
	 
	  }
		/*
		 * @Modifying
		 * 
		 * @Query(value =
		 * "insert into t_os_user (account_non_expired, account_non_locked, credentials_non_expired, email, enabled, name, password, received_status, sent_status, updated_date, username) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
		 * , nativeQuery = true) public void addUser(User user) {
		 * 
		 * }
		 */
	

	@Override
	public Iterable<User> getUsers() {
		// TODO Auto-generated method stub
		Iterable<User>u=null;
		u=recreitmentDAO.findAll();
	
		return u;
	}


	

	


	


	@Override
	public void deleteUser(Long userid) {
		recreitmentDAO.deleteUser(userid);
		
	}


	@Override
	public List<User> findAllActiveUser() {
		return recreitmentDAO.findAllActiveUser();
	}


	@Override
	public int saveUser(User user, HttpSession session) {
		//user.setStatus("ACTIVE");
		System.out.println("name"+user.getName());
		return recreitmentDAO.saveUser(user);
		
	}


	

	 

	

	 
}
