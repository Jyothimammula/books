package com.ssd.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssd.books.model.Author;
import com.ssd.books.model.Book;
import com.ssd.books.repository.BookRepository;

public class BookService {

	@Autowired
	public BookRepository bookRepository;
	

	
	
	public List<Book> getAllBooks(Long id){
		return (List<Book>) bookRepository.findById(id).get();
	}
}
