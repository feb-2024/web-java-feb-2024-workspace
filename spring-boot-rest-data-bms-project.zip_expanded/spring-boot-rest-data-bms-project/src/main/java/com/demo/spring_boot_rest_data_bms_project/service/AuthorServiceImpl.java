package com.demo.spring_boot_rest_data_bms_project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_boot_rest_data_bms_project.dao.AuthorDao;
import com.demo.spring_boot_rest_data_bms_project.entity.AuthorEntity;
import com.demo.spring_boot_rest_data_bms_project.entity.BookEntity;
import com.demo.spring_boot_rest_data_bms_project.pojo.AuthorPojo;
import com.demo.spring_boot_rest_data_bms_project.pojo.BookPojo;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorDao authorDao;
	
	@Override
	public List<AuthorPojo> fetchAllAuthors() {
		List<AuthorEntity> allAuthorsEntity = authorDao.findAll();
		// here we are copying a collection of AuthorEntity into a collection of AuthorPojo
		List<AuthorPojo> allAuthorsPojo = new ArrayList<>();
		for(AuthorEntity eachAuthorEntity: allAuthorsEntity) {
			AuthorPojo eachAuthorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachAuthorEntity, eachAuthorPojo); // this will copy all the properties from source to target
																		// but it will not copy the nested object/collection
			List<BookPojo> allBooksPojo = new ArrayList<>();
			for(BookEntity eachBookEntity: eachAuthorEntity.getAllBooks()) {
				BookPojo eachBookPojo = new BookPojo();
				BeanUtils.copyProperties(eachBookEntity, eachBookPojo);
				allBooksPojo.add(eachBookPojo);
			}
			eachAuthorPojo.setAllBooks(allBooksPojo);
		}
		return allAuthorsPojo;
	}

	@Override
	public AuthorPojo fetchAAuthor(int authorId) {
		AuthorEntity fetchedAuthorEntity = authorDao.findById(authorId).get();
		// next we copy the author entity data into author pojo object
		AuthorPojo fetchedAuthorPojo = new AuthorPojo();
		BeanUtils.copyProperties(fetchedAuthorEntity, fetchedAuthorPojo);
		List<BookPojo> allBooksPojo = new ArrayList<>();
		for(BookEntity eachBookEntity: fetchedAuthorEntity.getAllBooks()) {
			BookPojo eachBookPojo = new BookPojo();
			BeanUtils.copyProperties(eachBookEntity, eachBookPojo);
			allBooksPojo.add(eachBookPojo);
		}
		fetchedAuthorPojo.setAllBooks(allBooksPojo);
		return fetchedAuthorPojo;
	}

	@Override
	public AuthorPojo addAuthor(AuthorPojo newAuthor) {
		AuthorEntity newAuthorEntity = new AuthorEntity();
		BeanUtils.copyProperties(newAuthor, newAuthorEntity);
		authorDao.saveAndFlush(newAuthorEntity);
		newAuthor.setAuthId(newAuthorEntity.getAuthId());
		return newAuthor;
	}

	@Override
	public AuthorPojo updateAuthor(AuthorPojo editAuthor) {
		AuthorEntity newAuthorEntity = new AuthorEntity();
		BeanUtils.copyProperties(editAuthor, newAuthorEntity);
		authorDao.saveAndFlush(newAuthorEntity);
		editAuthor.setAuthId(newAuthorEntity.getAuthId());
		return editAuthor;
	}

	@Override
	public void deleteAuthor(int authorId) {
		authorDao.deleteById(authorId);
	}

}
