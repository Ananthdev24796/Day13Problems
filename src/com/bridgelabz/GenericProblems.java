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
 * Given 3 Strings find the maximum
- Ensure to test code with the Test Case.
- Apple Peach Banana
- UC 3 Case
 */
public class GenericProblems {
	
	// creating method to find max for String
			public static void findMax(String a ,String b,String c) {
				String max =  a;
				if(b.compareTo(a)>0) {
					max = b;
				}
				if(c.compareTo(a)>0) {
					max =c;
				}
				System.out.println(max);
				
			}
	
		
	 public static void main(String[] args) {
		 String a = "Jeep";
		 String b = "Bmw";
		 String c = "Alfa Romeo";
		 findMax(a, b, c);
		 
		 
		 
		
	}
}
