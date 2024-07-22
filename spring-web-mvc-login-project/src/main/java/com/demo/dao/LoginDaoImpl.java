package com.demo.dao;

import org.springframework.stereotype.Repository;

import com.demo.model.UserPojo;

@Repository
public class LoginDaoImpl implements LoginDao{

	@Override
	public boolean validate(UserPojo userPojo) {
		return (("admin".equals(userPojo.getUserName()) && "admin".equals(userPojo.getPassword())) || 
				("john".equals(userPojo.getUserName()) && "smith".equals(userPojo.getPassword())));
	}

}
