package edu.handong.csee.java.lab13.prob5;

public class Equals {
	public static boolean equals(int[][] m1, int[][] m2) {
		int count = 0;
		if (m1.length != m2.length) // if the number of row is different, return false
		return false;
		      
		for (int i = 0; i < m1.length; i++) {
		     for (int j = 0; j < m1[i].length; j++){
		    	 if (m1[i][j] != m2[i][j])
		                count++;
		      }
		}
		if(count <= 3)
			return true;
		else
			return false;
	}
}
