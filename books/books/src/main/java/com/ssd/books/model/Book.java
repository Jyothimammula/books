package com.ssd.books.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity


public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String title;
	private String descripition;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescripition() {
		return descripition;
	}
	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}
	
	public Book(long id, String title, String descripition) {
		super();
		this.id = id;
		this.title = title;
		this.descripition = descripition;
	}
	
	public Book(String title, String descripition) {
		super();
		this.title = title;
		this.descripition = descripition;
	}
	public Book() {
		super();
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", descripition=" + descripition + "]";
	}
	
	
	
	

}
