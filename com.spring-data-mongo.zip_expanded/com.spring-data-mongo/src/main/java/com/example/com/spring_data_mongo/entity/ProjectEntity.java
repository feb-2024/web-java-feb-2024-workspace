package com.example.com.spring_data_mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Document("project_details")
public class ProjectEntity {
	
	@Id
	@Field("proj_id")
	private int projId;
	
	@Field("proj_name")
	private String projName;

}
