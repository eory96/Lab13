package edu.handong.csee.java.lab13.prob4;

public class Animal {//this is parent class for cat and dog classes
	private String name;//variable to store name of pet
		public void setName(String name){//setter of name method
			this.name = name;//this class name change to name
		}
		public void getName(){//getter of name method
			System.out.println("Name: "+name);//call this method will printout "Name :"and name value
		}
}
