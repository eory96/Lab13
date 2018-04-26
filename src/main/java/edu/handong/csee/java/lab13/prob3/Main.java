package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double width,height;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = keyboard.nextDouble();
		Circle c1 = new Circle(radius);
		System.out.println("Radius: "+ radius);
		c1.display();
		
		System.out.print("Enter height and width: ");
		height = keyboard.nextDouble();
		width = keyboard.nextDouble();
		Rectangle r1 = new Rectangle(height, width);
		System.out.println("Height: "+ height);
		System.out.println("Width: "+width);
		r1.display();

	}

}
