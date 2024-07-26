package com.demo.spring_boot_rest_data_student_project.service;

import java.util.List;

import com.demo.spring_boot_rest_data_student_project.entity.StudentEntity;

public interface StudentService {
	List<StudentEntity> fetchAllStudents();
	StudentEntity fetchAStudent(int studId);
	StudentEntity addStudent(StudentEntity newStud);
	StudentEntity updateStudent(StudentEntity updateStud);
	void deleteStudent(int studId);
}
