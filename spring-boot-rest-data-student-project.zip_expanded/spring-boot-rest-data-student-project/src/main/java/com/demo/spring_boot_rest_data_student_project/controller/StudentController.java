package com.demo.spring_boot_rest_data_student_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_boot_rest_data_student_project.entity.StudentEntity;
import com.demo.spring_boot_rest_data_student_project.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public ResponseEntity<List<StudentEntity>> getAllStudents(){
		return new ResponseEntity(studentService.fetchAllStudents(), HttpStatus.OK);
	}
	
	@GetMapping("/students/{sid}")
	public ResponseEntity<StudentEntity> getAStudent(@PathVariable("sid") int studId){
		return new ResponseEntity(studentService.fetchAStudent(studId), HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity newStud){
		return new ResponseEntity(studentService.addStudent(newStud), HttpStatus.OK);
	}
	
	@PutMapping("/students")
	public ResponseEntity<StudentEntity> updateStudent(@RequestBody StudentEntity upStud){
		return new ResponseEntity(studentService.updateStudent(upStud), HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{sid}")
	public ResponseEntity<Void> deleteStudent(@PathVariable("sid") int studId){
		studentService.deleteStudent(studId);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
