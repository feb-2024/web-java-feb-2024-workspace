package com.demo.dao;

import com.demo.model.UserPojo;

public interface LoginDao {
	boolean validate(UserPojo userPojo);
}
