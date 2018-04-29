package edu.handong.csee.java.lab13.prob4;//prob4 package
import java.util.Scanner;//import Scanner package for inputing data

public class Main {//this is main class

	public static void main(String[] args) {//this is main method
		String cat_name, dog_name;//variable to store name of cat and dog 

		Master master = new Master();//initiate Master class to master
		Cat cat = new Cat();//initiate Cat class to cat
		Dog dog = new Dog();//initiate Dog class to dog

		Scanner keyboard = new Scanner(System.in);//for using keyboard
		System.out.print("Enter the cat name and dog name: ");//printout "Enter the cat name and dog name: " 
		cat_name = keyboard.next();//receive data from keyboard
		dog_name = keyboard.next();//receive data form keyboard

		cat.setName(cat_name);//send name of cat to cat class's parent class
		cat.getName();//get name from cat class's parent class
		master.feed(cat);//print out food information about cat

		dog.setName(dog_name);//send name of cat to Dog class's parent class
		dog.getName();//get name from Dog class's parent class
		master.feed(dog);//print out food information about dog
	}

}

