package com.demo.spring_boot_rest_data_student_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_boot_rest_data_student_project.entity.StudentEntity;

@Repository
public interface StudentDao extends JpaRepository<StudentEntity, Integer> {

}
