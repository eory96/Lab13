package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape {// this class inherit from Shape class
	private double radius;//variable for receive radius data and store value

	public Circle(double radius) {//constructor of this method
		this.radius = radius;//initialize this class radius to radius 
	}
	
	public double area() {//calculate circle area
		return radius*radius*3.14;//return circle area value
	}
	public double perimeter() {//calculate circle perimeter
		return 2*radius*3.14;//return circle perimeter
	}
}
