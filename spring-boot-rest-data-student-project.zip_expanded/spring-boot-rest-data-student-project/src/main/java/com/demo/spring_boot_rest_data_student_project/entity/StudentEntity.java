package com.demo.spring_boot_rest_data_student_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="student_details")
public class StudentEntity {

	@Id
	@Column(name="s_id")
	private int studId;
	
	@Column(name="s_name")
	private String studName;
	
	@Column(name="s_score")
	private int studScore;
	
}
