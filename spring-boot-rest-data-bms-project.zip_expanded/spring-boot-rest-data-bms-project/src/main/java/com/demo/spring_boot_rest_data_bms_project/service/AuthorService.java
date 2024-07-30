package com.demo.spring_boot_rest_data_bms_project.service;

import java.util.List;

import com.demo.spring_boot_rest_data_bms_project.pojo.AuthorPojo;

public interface AuthorService {
	List<AuthorPojo> fetchAllAuthors();
	AuthorPojo fetchAAuthor(int authorId);
	AuthorPojo addAuthor(AuthorPojo newAuthor);
	AuthorPojo updateAuthor(AuthorPojo editAuthor);
	void deleteAuthor(int authorId);
}
