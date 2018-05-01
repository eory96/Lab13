package edu.handong.csee.java.lab13.prob6;//prob6 package

public class Printer {//this class for printing result
	
	public static void print(Object object){//parameter type is object
		String str = object.toString();//save object(p1,p2,p3,p4) toString method
		System.out.println(str);//print out str variable
	}
}
