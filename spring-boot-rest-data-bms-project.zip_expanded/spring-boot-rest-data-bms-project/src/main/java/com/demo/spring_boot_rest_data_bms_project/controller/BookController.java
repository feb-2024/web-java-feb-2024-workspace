package com.demo.spring_boot_rest_data_bms_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_boot_rest_data_bms_project.pojo.BookPojo;
import com.demo.spring_boot_rest_data_bms_project.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<BookPojo>> getAllBooks(){
		return new ResponseEntity(bookService.fetchAllBooks(), HttpStatus.OK);
	}
	
	@GetMapping("/books/genre/{bGenre}")
	public ResponseEntity<List<BookPojo>> getAllBooksByGenre(@PathVariable("bGenre") String bookGenre){
		return new ResponseEntity(bookService.fetchAllBooksByGenre(bookGenre), HttpStatus.OK);
	}
	
	@GetMapping("/books/{bid}")
	public ResponseEntity<BookPojo> getABook(@PathVariable("bid") int bookId){
		return new ResponseEntity(bookService.fetchABook(bookId), HttpStatus.OK);
	}
	
	@PostMapping("/books")
	public ResponseEntity<BookPojo> addBook(@RequestBody BookPojo newBook){
		return new ResponseEntity(bookService.addBook(newBook), HttpStatus.OK);
	}
	
	@PutMapping("/books")
	public ResponseEntity<BookPojo> updateBook(@RequestBody BookPojo upBook){
		return new ResponseEntity(bookService.updateBook(upBook), HttpStatus.OK);
	}
	
	@DeleteMapping("/books/{bid}")
	public ResponseEntity<Void> deleteStudent(@PathVariable("bid") int bookId){
		bookService.deleteBook(bookId);
		return new ResponseEntity(HttpStatus.OK);
	}


}
