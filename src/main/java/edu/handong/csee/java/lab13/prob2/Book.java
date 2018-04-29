package edu.handong.csee.java.lab13.prob2;//prob2 package

public class Book {//this class parent class of History and Science class
	private int id=0;//this is for numbering
	private String bookName;//store name of book
	private static int idPluse=0;//this is for pluse count
	
	public Book(String name) {//constructor of Book class this initialize this class
		this.bookName = name;//name is stored to bookName
		idPluse++;//increase idPluse
		id+=idPluse;//counting up
	}
	public String toString() {//this method for return book name and id
		return "\nId: "+ id + "\nBook Name: " + bookName;//return id and book name
	}
	public void show() {//this method is invoked by main class
		System.out.println("<<<BOOK>>>"+ toString());//printout <<<BOOK>>>and return of toString
	}

}
