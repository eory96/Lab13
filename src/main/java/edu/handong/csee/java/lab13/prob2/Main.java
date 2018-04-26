package edu.handong.csee.java.lab13.prob2;

public class Main {//this class is main class

	public static void main(String[] args) {//this method is main method
		// TODO Auto-generated method stub
		Book b1 = new Book("Simple Book");//instanciation Book class to b1
		Science b2 = new Science("Hello Physics!", "ScienceWorld");//instanciation Science class to b2
		History b3 = new History("What Is history?", "E.H.Carr" );//instanciation History class to b3
		
		b1.show();//invoke show method
		b2.show();//invoke science class show method
		b3.show();//invoke history class show method
	}

}
