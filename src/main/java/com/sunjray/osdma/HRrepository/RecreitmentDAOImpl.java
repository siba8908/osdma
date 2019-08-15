package com.sunjray.osdma.HRrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.User;
import com.sunjray.osdma.mapper.UserAllRowMapper;
import com.sunjray.osdma.mapper.UserRowMapper;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class RecreitmentDAOImpl implements RecreitmentDAO {

	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public void addUser(String email, String name) {
	
		 jdbcTemplate.update(QueryConstant.INSERT_USER,email,name);
	}

	@Override
	public Iterable<User> findAll() {
		
		return jdbcTemplate.query(QueryConstant.DISPLAY_USER_LIST,new UserRowMapper());
	}

	@Override
	public void deleteUser(Long userid) {
		System.out.println("Query");
		jdbcTemplate.update(QueryConstant.DELETE_USER,userid);
		
	}


	@Override
	public List<User> findAllActiveUser() {
		
		return jdbcTemplate.query(QueryConstant.DISPLAYALL_USER_LIST,new UserAllRowMapper());
	}

	@Override
	public int saveUser(User user) {
		
		return jdbcTemplate.update(QueryConstant.UPDATE_USER,user.getEmail(),user.getName(),user.getUserId());
	}
}
