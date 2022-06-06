package com.sachinmukherjee.composition;

import java.util.List;

/*
 * Library cannot exists without books
 * books is a part of library
 */
public class Library {
	
	private List<Book> books;

	public Library(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
