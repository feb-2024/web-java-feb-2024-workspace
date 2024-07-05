package com.demo.service;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.model.UserPojo;

public class LoginServiceImpl implements LoginService{

	LoginDao loginDao;
	
	public LoginServiceImpl() {
		loginDao = new LoginDaoImpl();
	}

	@Override
	public boolean validate(UserPojo userPojo) {
		return loginDao.validate(userPojo);
	}

}
