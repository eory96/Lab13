package edu.handong.csee.java.lab13.prob4;//prob4 package

public class Cat extends Animal implements Pet{//it's parent class Animal and pet inherit Animal
	public String food() {//return type string method
		return "(Cat!)"+"Fish";//return "(Dog!)"+"Sausage"
	}
}
