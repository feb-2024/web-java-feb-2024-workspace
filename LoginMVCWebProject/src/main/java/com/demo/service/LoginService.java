package com.demo.service;

import com.demo.model.UserPojo;

public interface LoginService {
	boolean validate(UserPojo userPojo);
}
