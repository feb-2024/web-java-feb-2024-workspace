package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.model.UserPojo;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao loginDaoImpl;
	
	public LoginServiceImpl() {
		//loginDao = new LoginDaoImpl();// commented beacuse let the spring framework create the object
	}

	@Override
	public boolean validate(UserPojo userPojo) {
		return loginDaoImpl.validate(userPojo);
	}

}
