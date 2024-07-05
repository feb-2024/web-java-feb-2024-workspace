package com.demo.dao;

import com.demo.model.UserPojo;

public class LoginDaoImpl implements LoginDao{

	@Override
	public boolean validate(UserPojo userPojo) {
		return ("admin".equals(userPojo.getUserName()) && "admin".equals(userPojo.getPassword()));
	}

}
