package edu.handong.csee.java.lab13.prob6;//prob6 package

public class Main {//this is main class

	public static void main(String[] args) {//this is main method
		UpPoint p1 = new UpPoint(3,3);//initiate UpPoint to p1
		DownPoint p2 = new DownPoint(2,5);//initiate DownPoint to p2
		DownPoint p3 = new DownPoint(4,7);//initiate DownPoint to p3
		UpPoint p4 = new UpPoint(9,12);//initiate UpPoint to p4
		Printer.print(p1);//print method of Printer class is execute 
		Printer.print(p2);//print method of Printer class is execute
		Printer.print(p3);//print method of Printer class is execute
		Printer.print(p4);//print method of Printer class is execute
	}

}
