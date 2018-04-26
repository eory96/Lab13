package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape {
	private double radius;
	//private double width;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double area() {
		return radius*radius*3.14;
	}
	public double perimeter() {
		return 2*radius*3.14;
	}
	public double getRadius() {
		return radius;
	}

}
