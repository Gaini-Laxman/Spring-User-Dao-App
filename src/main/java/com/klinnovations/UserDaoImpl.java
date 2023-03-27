package com.klinnovations;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	
	public boolean save() {
		System.out.println("User Saved Successfully....");
		return true;
	}

}
