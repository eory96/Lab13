package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{// this class inherit from Book class
	private String publisher;//store name of publisher
	public Science(String Name, String publisher) {//constructor of History class and initialize book of name and Author 
		super(Name);//super mean parent class(Book) so name of book is stored to bookName
		this.publisher = publisher;//publisher is stored to this class publisher
	}
	
	public String toString() {//this method for return book name, id, and publisher
		return super.toString()+"\npublisher: "+publisher;//return parent class toString method and publisher
	}
	public void show() {//printout name, id, publisher method
		System.out.println("<<<Science>>>"+ toString());//print out <<<History>>> and parent class toString method and pulisher
	}
}
