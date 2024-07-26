package com.example.com.spring_data_mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Document("employee_details")
public class EmployeeEntity {

	@Id
	@Field("emp_id")
	private int empId;
	
	@Field("emp_name")
	private String empName;
	
	@Field("emp_city")
	private String empCity;
	
	@DBRef
	private ProjectEntity project;
}
