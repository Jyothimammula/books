package com.ssd.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.books.model.Author;
import com.ssd.books.model.Book;
import com.ssd.books.repository.AuthorRepository;
import com.ssd.books.repository.BookRepository;

@Service
public class AuthorService {

	@Autowired
public AuthorRepository authorRepository;
	
	
	
	//insert values into database
	public Author createAuthor(Author author) {
		return authorRepository.save(author);
}
	
	//get all data
	
	public List<Author>getAllAuthors(){
		return authorRepository.findAll();
	}
	
	//get data by id
	
	public Author getAuthorById(Long id){
		return authorRepository.findById(id).get();
		
	}
	
	//Delete data by id;
	public void deleteAuthorByid(Long id) {
		authorRepository.deleteById(id);
	}
	
	//update data by id
	  public Author updateAuthor(Author author ,Long id) {
		Author ath=  authorRepository.findById(id).get();
		if(author.getName()!=null) {
			ath.setName(author.getName());
		}
		if(author.getBooks()!=null) {
			ath.setBooks(author.getBooks());
		}
			return authorRepository.save(ath);
	  }

	
		
	  
	
		}
			
		
	


