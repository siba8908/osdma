package com.sunjray.osdma.HRrepository;

import java.util.List;

import com.sunjray.osdma.HRmodel.User;

public interface RecreitmentDAO {


	void addUser(String email, String name);

	Iterable<User> findAll();

	void deleteUser(Long userid);

	

	List<User> findAllActiveUser();

	int saveUser(User user);
}
