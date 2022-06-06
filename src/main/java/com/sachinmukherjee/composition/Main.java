package com.sachinmukherjee.composition;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

		// Creating the list which contains number of books
		List<Book> books = new ArrayList<>();

		// Adding books
		// using add() method
		books.add(b1);
		books.add(b2);
		books.add(b3);

		Library library = new Library(books);

		// Calling method to get total books in library
		// and storing it in list of user0defined type -
		// Books
		List<Book> bks = library.getBooks();

		// Iterating over books using for each loop
		for (Book bk : bks) {

			// Printing the title and author name of book on
			// console
			System.out.println("Title : " + bk.getTitle() + " and " + " Author : " + bk.getAuthor());
		}
	}
}
