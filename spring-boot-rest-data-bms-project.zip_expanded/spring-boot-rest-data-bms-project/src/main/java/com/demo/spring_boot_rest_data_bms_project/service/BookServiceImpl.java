package com.demo.spring_boot_rest_data_bms_project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_boot_rest_data_bms_project.dao.BookDao;
import com.demo.spring_boot_rest_data_bms_project.entity.AuthorEntity;
import com.demo.spring_boot_rest_data_bms_project.entity.BookEntity;
import com.demo.spring_boot_rest_data_bms_project.pojo.AuthorPojo;
import com.demo.spring_boot_rest_data_bms_project.pojo.BookPojo;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;
	
	@Override
	public List<BookPojo> fetchAllBooks() {
		List<BookEntity> allBooksEntity = bookDao.findAll();
		// we have to copy collection of BookEntity into a collection of BookPojo
		List<BookPojo> allBooksPojo = new ArrayList<>();
		for(BookEntity eachBookEntity: allBooksEntity) {
			BookPojo eachBookPojo = new BookPojo();
			BeanUtils.copyProperties(eachBookEntity, eachBookPojo);
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachBookEntity.getAuthor(), authorPojo);
			eachBookPojo.setAuthor(authorPojo);
			allBooksPojo.add(eachBookPojo);
		}
		return allBooksPojo;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		BookEntity fetchedBookEntity = bookDao.findById(bookId).get();
		BookPojo eachBookPojo = new BookPojo();
		BeanUtils.copyProperties(fetchedBookEntity, eachBookPojo);
		AuthorPojo authorPojo = new AuthorPojo();
		BeanUtils.copyProperties(fetchedBookEntity.getAuthor(), authorPojo);
		eachBookPojo.setAuthor(authorPojo);
		return eachBookPojo;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		BookEntity newBookEntity = new BookEntity();
		BeanUtils.copyProperties(newBook, newBookEntity);
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(newBook.getAuthor(), authorEntity);
		newBookEntity.setAuthor(authorEntity);
		
		bookDao.saveAndFlush(newBookEntity);
		newBook.setBookId(newBookEntity.getBookId());
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		BookEntity newBookEntity = new BookEntity();
		BeanUtils.copyProperties(editBook, newBookEntity);
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(editBook.getAuthor(), authorEntity);
		newBookEntity.setAuthor(authorEntity);
		
		bookDao.saveAndFlush(newBookEntity);
		return editBook;
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteById(bookId);
	}

	@Override
	public List<BookPojo> fetchAllBooksByGenre(String bookGenre) {
		List<BookEntity> allBooksEntity = bookDao.findByBookGenre(bookGenre);
		// we have to copy collection of BookEntity into a collection of BookPojo
		List<BookPojo> allBooksPojo = new ArrayList<>();
		for(BookEntity eachBookEntity: allBooksEntity) {
			BookPojo eachBookPojo = new BookPojo();
			BeanUtils.copyProperties(eachBookEntity, eachBookPojo);
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachBookEntity.getAuthor(), authorPojo);
			eachBookPojo.setAuthor(authorPojo);
			allBooksPojo.add(eachBookPojo);
		}
		return allBooksPojo;
	}

}
