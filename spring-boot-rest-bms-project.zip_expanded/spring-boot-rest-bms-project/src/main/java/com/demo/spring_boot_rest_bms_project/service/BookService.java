package com.demo.spring_boot_rest_bms_project.service;

import java.util.List;

import com.demo.spring_boot_rest_bms_project.pojo.BookPojo;

public interface BookService {
	List<BookPojo> fetchAllBooks();
	List<BookPojo> fetchBookByGenre(String genre);
	BookPojo fetchABook(int bookId);
	void deleteBook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
}
