package edu.handong.csee.java.lab13.prob5;//prob5 package

import java.util.Scanner;//import Scanner package for using keyboard

public class Main {//this it main class

	public static void main(String[] args) {//this is main method
		int n1, n2 = 0;//it will save row size, and column size
		Scanner keyboard = new Scanner(System.in);//using for keyboard
		System.out.print("Enter row size(maximum 5): ");//printout "Enter row size(maximum 5): "
		n1 = keyboard.nextInt();//save row size to n1
		System.out.print("Enter column size(maximum 5): ");//printout "Enter column size(maximum 5): "
		n2 = keyboard.nextInt();//save column size to n2
		int[][] m1 = new int[n1][n2];//make array (row size n1 column size n2)
		System.out.print("Enter row size(maximum 5): ");//print out "Enter row size(maximum 5): "
		n1 = keyboard.nextInt();//save row size to n1
		System.out.print("Enter column size(maximum 5): ");//print out "Enter column size(maximum 5): "
		n2 = keyboard.nextInt();//save column size to n2
		int[][] m2 = new int[n1][n2];//make 2d array(row size n1, column size n2)
		
		System.out.print("Enter List1: ");//print out "Enter List1: " 
		for (int i = 0; i < m1.length; i++) {//loop to fill out 2d array
			for (int j = 0; j < m1[i].length; j++)//loop for fill out 2d array
				m1[i][j] = keyboard.nextInt();//fill out 2d array
		}
		
		System.out.print("Enter list2: ");//printout "Enter List2:"
		for (int i = 0; i < m2.length; i++){//loop for fill out 2d array
			for (int j = 0; j < m2[i].length; j++)//loop for fill out column 
				m2[i][j] = keyboard.nextInt();//fill out 2d array
		}
		    	
		for (int i = 0; i < m1.length; i++){//loop for print out 2d array
			for (int j = 0; j < m1[i].length; j++)//loop for print out 2d array
				System.out.print(m1[i][j] + " ");//print out 2d array
			System.out.println();//print out enter
		}
		System.out.println();//print out enter
		
		for (int i = 0; i < m2.length; i++){//loop for print out 2d array
			for (int j = 0; j < m2[i].length; j++)//loop for print out 2d array
				System.out.print(m2[i][j] + " ");//print out 2d array
			System.out.println();//print out enter
		}
		System.out.println();//print out enter
		
		
		if (m1.equals(m2)) //compare m1 and m2 array
			System.out.println("The two arrays are approximately identical.");//if m1 and m2 same printout "The two arrays are approximately identical."
		else //m1 and m2 is not same
			System.out.println("The two arrays are not identical");//printout "The two arrays are not identical"
	}
	
}	


