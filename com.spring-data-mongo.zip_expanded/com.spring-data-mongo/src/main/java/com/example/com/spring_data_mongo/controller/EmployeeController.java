package com.example.com.spring_data_mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.com.spring_data_mongo.dao.EmployeeDao;
import com.example.com.spring_data_mongo.entity.EmployeeEntity;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;
	
	@GetMapping("/employees")
	public List<EmployeeEntity> getAllEmplpoyess(){
		return employeeDao.findAll();
	}
	
	@PostMapping("/employees")
	public EmployeeEntity saveEmplpoyess(@RequestBody EmployeeEntity emp){
		return employeeDao.save(emp);
	}
}
