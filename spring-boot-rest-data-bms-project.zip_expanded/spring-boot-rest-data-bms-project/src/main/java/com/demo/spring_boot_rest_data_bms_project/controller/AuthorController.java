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

import com.demo.spring_boot_rest_data_bms_project.pojo.AuthorPojo;
import com.demo.spring_boot_rest_data_bms_project.service.AuthorService;

@RestController
@RequestMapping("api")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping("/authors")
	public ResponseEntity<List<AuthorPojo>> getAllAuthors(){
		return new ResponseEntity(authorService.fetchAllAuthors(), HttpStatus.OK);
	}
	
	@GetMapping("/authors/{aid}")
	public ResponseEntity<AuthorPojo> getAAuthor(@PathVariable("aid") int authId){
		return new ResponseEntity(authorService.fetchAAuthor(authId), HttpStatus.OK);
	}
	
	@PostMapping("/authors")
	public ResponseEntity<AuthorPojo> addAuthor(@RequestBody AuthorPojo newAuthor){
		return new ResponseEntity(authorService.addAuthor(newAuthor), HttpStatus.OK);
	}
	
	@PutMapping("/authors")
	public ResponseEntity<AuthorPojo> updateAuthor(@RequestBody AuthorPojo upAuthor){
		return new ResponseEntity(authorService.updateAuthor(upAuthor), HttpStatus.OK);
	}
	
	@DeleteMapping("/authors/{aid}")
	public ResponseEntity<Void> deleteAuthor(@PathVariable("aid") int authId){
		authorService.deleteAuthor(authId);
		return new ResponseEntity(HttpStatus.OK);
	}
}
