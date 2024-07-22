package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.model.UserPojo;


public interface LoginService {
	boolean validate(UserPojo userPojo);
}
