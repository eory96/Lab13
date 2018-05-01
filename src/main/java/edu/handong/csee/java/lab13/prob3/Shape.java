package edu.handong.csee.java.lab13.prob3;//prob3 package

public abstract class Shape {//this is abstract class and contain abstract method that doesn't have body
	public abstract double calculateArea();//abstract area method this will be override
	public abstract double calculatePerimeter();//abstract perimeter method this will be override
	public void displayrResult(){//this method print out calculate result
		System.out.println("Area: "+calculateArea()+"\nPerimeter: "+calculatePerimeter() +"\n");//printout "Area: "+area()+"\nPerimeter: "+perimeter() +"\n" 
	}
}
