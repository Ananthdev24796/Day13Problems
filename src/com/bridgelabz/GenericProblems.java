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
- UC 4 Case
 */
public class GenericProblems {
	
	// creating method to find max for String
			public static <T extends Comparable <T>> T  findMax(T a ,T b, T c, T d) {
				T max =  a;
				if(b.compareTo(a)>0) {
					max = b;
				}
				if(c.compareTo(a)>0) {
					max =c;
				}
				if(d.compareTo(a)>0) {
					max =d;
				}
				return max;
				
			}
	
		
	 public static void main(String[] args) {
		 String a = "Jeep";
		 String b = "Bmw";
		 String c = "Alfa Romeo";
		 String d = "Lamborghini";
		System.out.println(findMax(a, b, c,d)); 
		 
		 
		 
		
	}
}
