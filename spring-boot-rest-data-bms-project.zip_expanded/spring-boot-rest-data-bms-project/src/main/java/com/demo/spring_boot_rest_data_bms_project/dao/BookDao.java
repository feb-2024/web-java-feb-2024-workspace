package com.demo.spring_boot_rest_data_bms_project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_boot_rest_data_bms_project.entity.BookEntity;

@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer>{

	// we can create finder methods for queries other than th e basic crud operations
	List<BookEntity> findByBookGenre(String bGenre);
}
