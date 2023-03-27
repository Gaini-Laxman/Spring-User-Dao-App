package com.klinnovations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public UserDao dao;
	@Autowired
	public UserService(UserDao dao) {
		System.out.println("User Service constructor");
	}
	
	public void saveUser() {
		 dao.save();
		 System.out.println("Add user");
	}

}
