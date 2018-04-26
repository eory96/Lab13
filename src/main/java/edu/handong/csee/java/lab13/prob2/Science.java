package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{
	private String publisher;
	public Science(String Name, String publisher) {
		super(Name);
		this.publisher = publisher;
	}
	
	public String toString() {
		return super.toString()+"\npublisher: "+publisher;
	}
	public void show() {
		System.out.println("<<<Science>>>"+ toString());
	}
}
