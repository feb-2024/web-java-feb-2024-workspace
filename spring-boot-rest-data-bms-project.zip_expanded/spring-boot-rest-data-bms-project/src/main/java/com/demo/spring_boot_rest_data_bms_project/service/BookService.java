package com.demo.spring_boot_rest_data_bms_project.service;

import java.util.List;

import com.demo.spring_boot_rest_data_bms_project.pojo.BookPojo;

public interface BookService {
	List<BookPojo> fetchAllBooks();
	BookPojo fetchABook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo editBook);
	void deleteBook(int bookId);
	
	List<BookPojo> fetchAllBooksByGenre(String bookGenre);
}
