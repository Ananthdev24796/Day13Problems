/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */



/*
 * Given 3 Float find the maximum
- Ensure to test code with the Test Case.
- UC 2 Case
 */
public class GenericProblems {
	
	// creating method to find max for Float
			public static void findMax(Float a ,Float b,Float c) {
				Float	max =  a;
				if(b.compareTo(a)>0) {
					max = b;
				}
				if(c.compareTo(a)>0) {
					max =c;
				}
				System.out.println(max);
				
			}
	
		
	 public static void main(String[] args) {
		 Float a = 100.6f;
		 Float b = 150.4f;
		 Float c = 30.6f;
		 findMax(a, b, c);
		 
		 
		 
		
	}
}
