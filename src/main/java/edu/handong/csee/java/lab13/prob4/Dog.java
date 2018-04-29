package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{//it's parent class Animal and pet inherit Animal
	public String food() {//return type string method
		return "(Dog!)"+"Sausage";//return "(Dog!)"+"Sausage"
	}
}
