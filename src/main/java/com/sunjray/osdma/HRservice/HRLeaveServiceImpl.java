package com.sunjray.osdma.HRservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.LeaveManagement;
import com.sunjray.osdma.HRrepository.LeaveManageDao;

@Service
public class HRLeaveServiceImpl implements HRLeaveService {
	
	 @Autowired
	   private LeaveManageDao adao;
	
	@Override
	public int LeaveManagement(LeaveManagement leaveManagement) {
		// use DAO
	      return adao.save(leaveManagement);


	}
	
	@Override
	public Iterable<LeaveManagement> getLeave() {
		// TODO Auto-generated method stub
		Iterable<LeaveManagement>ur=null;
		ur=adao.findAllLeave();
		return ur;
	}

}
