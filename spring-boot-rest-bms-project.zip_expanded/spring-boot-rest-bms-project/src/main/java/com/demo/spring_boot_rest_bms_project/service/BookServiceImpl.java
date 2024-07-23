package com.demo.spring_boot_rest_bms_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_boot_rest_bms_project.dao.BookDao;
import com.demo.spring_boot_rest_bms_project.dao.BookDaoCollectionImpl;
import com.demo.spring_boot_rest_bms_project.pojo.BookPojo;

@Service
public class BookServiceImpl implements BookService{

	// BookDao bookDao = new BookDaoCollectionImpl(); // dont do this
	
	@Autowired
	BookDao bookDao;
	
	@Override
	public List<BookPojo> fetchAllBooks() {
		return bookDao.fetchAllBooks();
	}

	@Override
	public List<BookPojo> fetchBookByGenre(String genre) {
		return bookDao.fetchBookByGenre(genre);
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		return bookDao.fetchABook(bookId);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		return bookDao.addBook(newBook);
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		return bookDao.updateBook(updateBook);
	}
}
