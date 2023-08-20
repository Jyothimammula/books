package com.ssd.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.books.model.Author;


public interface AuthorRepository extends JpaRepository<Author, Long>{

	
}
