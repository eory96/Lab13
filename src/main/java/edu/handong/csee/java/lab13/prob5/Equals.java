package edu.handong.csee.java.lab13.prob5;//prob5 package

public class Equals {//this class compare to m1-2d array and m2-2d array
	
	public static boolean compareEquals(int[][] m1, int[][] m2) {//this method don't have to initiate 
		int count = 0;//variable for count number of same
		if (m1.length != m2.length) // if the number of row is different, return false
		return false;//return false
		      
		for (int i = 0; i < m1.length; i++) {//loop for comparing 2d-array
		     for (int j = 0; j < m1[i].length; j++){//loop for comparing 2-d array
		    	 if (m1[i][j] != m2[i][j])//if m1 and m2 is not same
		                count++;//plus one to count
		      }
		}
		if(count <= 3)//if count is less than 3
			return true;//return true
		else
			return false;//return false
	}
}
