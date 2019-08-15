package com.sunjray.osdma.HRrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.sunjray.osdma.HRmodel.LeaveManagement;
import com.sunjray.osdma.mapper.LeaveManageRowMapper;

import com.sunjray.osdma.util.QueryConstant;

@Repository("LeaveManageDao")
public class LeaveMangeDaoImpl implements LeaveManageDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private JdbcTemplate jt;
	
	
	
	  @Override public int save(LeaveManagement leaveManagement) { 
		 // TODO Auto-generated method stub 
	 int count=0; 
	 java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
	  count=jt.update(QueryConstant.Insert_Leave,leaveManagement.getEmp_code(),leaveManagement.getFrom_date(),leaveManagement.getTo_date(),leaveManagement.getLeave_type()); return count;
	  }
	 
	  @Override
		public Iterable<LeaveManagement> findAllLeave() {
			
			 return jdbcTemplate.query(QueryConstant.DISPLAYALL_LEAVE,new LeaveManageRowMapper());
		}

}
