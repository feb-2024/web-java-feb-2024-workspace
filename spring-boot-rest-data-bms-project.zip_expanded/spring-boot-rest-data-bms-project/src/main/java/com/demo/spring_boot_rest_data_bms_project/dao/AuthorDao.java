package com.demo.spring_boot_rest_data_bms_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_boot_rest_data_bms_project.entity.AuthorEntity;

@Repository
public interface AuthorDao extends JpaRepository<AuthorEntity, Integer>{

}
