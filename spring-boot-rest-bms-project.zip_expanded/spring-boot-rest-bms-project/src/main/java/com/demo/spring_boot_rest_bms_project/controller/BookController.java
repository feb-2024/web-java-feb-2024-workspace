package com.demo.spring_boot_rest_bms_project.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_boot_rest_bms_project.pojo.BookPojo;
import com.demo.spring_boot_rest_bms_project.service.BookService;

@RestController()
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookService;

	// http://localhost:8080/api/books
	@GetMapping("/books")	
	public List<BookPojo> fetchAllBooks(){
		return bookService.fetchAllBooks();
	}
	
	// http://localhost:8080/api/books/101
	@GetMapping(value="/books/{bid}")
	public BookPojo fetchABook(@PathVariable("bid") int bookId) {
		return bookService.fetchABook(bookId);
	}
}
