package com.demo.dao;

import org.springframework.stereotype.Repository;

import com.demo.model.UserPojo;

//@Component

public interface LoginDao {
	boolean validate(UserPojo userPojo);   
}
