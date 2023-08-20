 package com.ssd.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.books.model.Author;
import com.ssd.books.model.Book;
import com.ssd.books.service.AuthorService;
import com.ssd.books.service.BookService;

import jakarta.websocket.server.PathParam;

@RestController

public class AuthorController {
	
	
	@Autowired
	public AuthorService authorService;
	
	@Autowired(required = false)
	public BookService bookService;
	
	
	@PostMapping("/authors")
	
	public ResponseEntity<Author> createAuthor(@RequestBody Author author){
	Author a=authorService.createAuthor(author);
	return new ResponseEntity<Author>(a,HttpStatus.CREATED);
	
	}
      
	@GetMapping("/authors")
	public  ResponseEntity<List<Author>> getAllAuthors(){
		
		List<Author>list= authorService.getAllAuthors();
		System.out.println(list);
		return new ResponseEntity<List<Author>>(list,HttpStatus.OK);
	}
		
		
		@GetMapping("/authors/{id}")
		public ResponseEntity<Author> getAuthor(@PathVariable Long id) {
			Author a1=authorService.getAuthorById(id);
			
			return new ResponseEntity<Author>(a1,HttpStatus.OK) ;
		}
		
		
		@DeleteMapping("/authors/{id}/")
		public void getAuthor1(@PathVariable Long  id) {
			
			authorService.deleteAuthorByid(id);
			
			
	     }	
     
		
		@PutMapping("/authors/{id}")
		public ResponseEntity<Author> updateAuthor(@RequestBody Author a, @PathVariable("id") Long id) {
			Author up=authorService.updateAuthor(a, id);
			return new ResponseEntity<Author>(up,HttpStatus.OK) ;
		}
		
		@GetMapping("/authors/{id}/{Book}")
		//@org.springframework.beans.factory.annotation.Autowired(required=true)

		public ResponseEntity<List<Book>> getBooks(@PathVariable Long id){
        List<Book>b= (List<Book>) bookService.getAllBooks(id);
			
        return new ResponseEntity<List<Book>>(b,HttpStatus.OK);
		}
		
			
		}
		


		
	
	
	

