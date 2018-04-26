package edu.handong.csee.java.lab13.prob2;

public class Book {
	private int id=0;
	private String bookName;

	public Book(String name) {
		this.bookName = name;
		id++;
		//System.out.println("Book Name : " + name);
	}
	public String toString() {
		return "\nId: "+ id + "\nBook Name: " + bookName;
	}
	public void show() {
		System.out.println("<<<BOOK>>>"+ toString());
	}

}
