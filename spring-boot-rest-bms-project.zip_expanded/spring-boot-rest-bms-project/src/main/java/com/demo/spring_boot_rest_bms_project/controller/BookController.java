package com.demo.spring_boot_rest_bms_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<List<BookPojo>> fetchAllBooks(){
		return new ResponseEntity(bookService.fetchAllBooks(), HttpStatus.OK);
	}
	
	// http://localhost:8080/api/books/101
	@GetMapping(value="/books/{bid}")
//	public BookPojo fetchABook(@PathVariable("bid") int bookId) {
	public ResponseEntity<BookPojo> fetchABook(@PathVariable("bid") int bookId) {
		//return bookService.fetchABook(bookId);
		return new ResponseEntity<BookPojo>(bookService.fetchABook(bookId), HttpStatus.OK);
	}
	
	// http://localhost:8080/api/books/genre/Comedy
	@GetMapping(value="/books/genre/{genre}")
	public ResponseEntity<List<BookPojo>> fetchBooksByGenre(@PathVariable("genre") String bookGenre) {
		return new ResponseEntity(bookService.fetchBookByGenre(bookGenre), HttpStatus.OK);
	}
	
	// http://localhost:8080/api/books/102
	@DeleteMapping(value="/books/{bookId}")
//	public void removeBook(@PathVariable("bookId") int bookId) {
	public ResponseEntity<Void> removeBook(@PathVariable("bookId") int bookId) {
		bookService.deleteBook(bookId);	
		return new ResponseEntity(HttpStatus.OK);
	}
	
	// http://localhost:8080/api/books
	@PostMapping(value="/books")
//	public BookPojo addBook(@RequestBody BookPojo newBook) {
	public ResponseEntity<BookPojo> addBook(@RequestBody BookPojo newBook) {
		return new ResponseEntity(bookService.addBook(newBook), HttpStatus.OK);
	}
	
	// http://localhost:8080/api/books
	@PutMapping(value="/books")
//	public BookPojo updateBook(@RequestBody BookPojo updateBook) {
	public ResponseEntity<BookPojo> updateBook(@RequestBody BookPojo updateBook) {
		return new ResponseEntity(bookService.updateBook(updateBook), HttpStatus.OK);
	}
}
