package com.Example;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookDetails("Java Basics", "John Doe", 450);
		System.out.println(book.getBookDetails());

	}

}
