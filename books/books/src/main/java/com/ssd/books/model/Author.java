package com.ssd.books.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity

public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long id;
	private String name;
	
	@OneToMany(cascade =CascadeType.ALL)
	
	//@JoinColumn(referencedColumnName = "id", name="author_id")
	
	
	private List<Book>books;
	
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Author(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Author(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
