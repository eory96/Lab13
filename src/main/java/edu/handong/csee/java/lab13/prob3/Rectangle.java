package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double perimeter() {
		return 2*(width+height);
	}
	public double area() {
		return width*height;
	}
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
}
