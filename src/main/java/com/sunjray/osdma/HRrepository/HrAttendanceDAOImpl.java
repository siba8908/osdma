package com.sunjray.osdma.HRrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.Attendance;
import com.sunjray.osdma.HRmodel.EmployeeDetails;
import com.sunjray.osdma.mapper.AttendanceRowMapper;
import com.sunjray.osdma.util.QueryConstant;


@Repository
public class HrAttendanceDAOImpl implements HrAttendanceDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	
	@Override
	public List<EmployeeDetails> getempdetails() {
		
		List<EmployeeDetails> empdlts=null;
		empdlts=jdbcTemplate.query(QueryConstant.GET_EMP_DETAILS_ATTN, new AttendanceRowMapper());
		return empdlts;
	}


	@Override
	public int postAtten(Attendance attendance) {
		// TODO Auto-generated method stub
		//java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		//System.out.print(attendance.getStatus());
		return jdbcTemplate.update(QueryConstant.Insert_Attendance, attendance.getEmployeeCode(),attendance.getAttendeeDate(),attendance.getAttendeeDay(),attendance.getStatus());
	}


	
}
	
