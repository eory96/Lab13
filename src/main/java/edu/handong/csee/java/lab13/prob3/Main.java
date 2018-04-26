package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;//use for scanner class

public class Main {//this is main class

	public static void main(String[] args) {//this is main method
		// TODO Auto-generated method stub
		double radius;//store radius of circle
		double width,height;//store date for rectangle
		Scanner keyboard = new Scanner(System.in);//instance for input data from keyboard
		System.out.print("Enter radius: ");//print out "Enter radius : "
		radius = keyboard.nextDouble();//input radius data
		Circle c1 = new Circle(radius);//instantiation Circle to c1
		System.out.println("Radius: "+ radius);//print out "Radius: " and value of radius
		c1.display();//call a c1(Circle) method display
		
		System.out.print("Enter height and width: ");//print out "Enter height and width : "
		height = keyboard.nextDouble();//input height data
		width = keyboard.nextDouble();//input width data
		Rectangle r1 = new Rectangle(height, width);//instantiation Rectangle to r1
		System.out.println("Height: "+ height);//print out "Height" and value of height
		System.out.println("Width: "+width);//print out "Width" and value of width
		r1.display();//call a r1(Rectangle) method display

	}

}
