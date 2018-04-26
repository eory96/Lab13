package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{//this class inherit from Shape class
	private double width;//variable for receive width data and store value
	private double height;//variable for receive height data and store value
	
	public Rectangle(double width, double height) {//constructor of this class
		this.width = width;//initialize this class width to width 
		this.height = height;//initialize this class height to height 
	}

	public double perimeter() {//calculate rectangular perimeter
		return 2*(width+height);//return perimeter of rectangular
	}
	public double area() {//calculate rectangular area
		return width*height;//return perimeter of rectangular
	}
}
