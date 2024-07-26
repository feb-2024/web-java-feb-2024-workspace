package com.demo.spring_boot_rest_data_student_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.spring_boot_rest_data_student_project.dao.StudentDao;
import com.demo.spring_boot_rest_data_student_project.entity.StudentEntity;

public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<StudentEntity> fetchAllStudents() {
		return studentDao.findAll();
	}

	@Override
	public StudentEntity fetchAStudent(int studId) {
		return studentDao.findById(studId).get();
	}

	@Override
	public StudentEntity addStudent(StudentEntity newStud) {
		return studentDao.saveAndFlush(newStud);
	}

	@Override
	public StudentEntity updateStudent(StudentEntity updateStud) {
		return studentDao.saveAndFlush(updateStud);
	}

	@Override
	public void deleteStudent(int studId) {
		studentDao.deleteById(studId);
	}
}
