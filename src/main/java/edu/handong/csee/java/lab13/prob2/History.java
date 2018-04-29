package edu.handong.csee.java.lab13.prob2;//prob2 package

public class History extends Book{// this class inherit from Book class
	private String author;//store name of Author
	public History(String Name, String author) {//constructor of History class and initialize book of name and Author 
		super(Name);//super mean parent class(Book) so name of book is stored to bookName
		this.author = author;//Author is stored to this class Author
	}
	
	public String toString() {//this method for return book name, id, and Author
		return super.toString()+"\nAuthor: "+author;//return parent class toString method and Author
	}
	public void show() {//this method print out name, id, Author
		System.out.println("<<<History>>>"+ toString());//print out <<<History>>> and parent class toString method and Author
	}

}
