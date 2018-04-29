package edu.handong.csee.java.lab13.prob3;//prob3 package

public abstract class Shape {//this is abstract class and contain abstract method that doesn't have body
	public abstract double area();//abstract area method this will be override
	public abstract double perimeter();//abstract perimeter method this will be override
	public void display(){//this method print out calculate result
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() +"\n");//printout "Area: "+area()+"\nPerimeter: "+perimeter() +"\n" 
	}
}
