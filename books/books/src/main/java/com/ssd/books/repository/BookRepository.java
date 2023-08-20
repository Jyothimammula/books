package com.ssd.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.books.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
