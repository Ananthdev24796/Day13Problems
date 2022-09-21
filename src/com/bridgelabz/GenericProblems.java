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
 * Given 3 Integers find the maximum
- Ensure to test code with the Test Case.
- To ensure your Code works you need 3 test cases with Max Number at 1st, 2nd and 3rd
- Use Integer Object and compareTo
UC 1 method to test the maximum number
 */
public class GenericProblems {
	
	// creating method to find max for Integer
			public static void findMax(Integer a ,Integer b,Integer c) {
				Integer	max =  a;
				if(b.compareTo(a)>0) {
					max = b;
				}
				if(c.compareTo(a)>0) {
					max =c;
				}
				System.out.println(max);
				
			}
	
		
	 public static void main(String[] args) {
		 Integer a = 100;
		 Integer b = 150;
		 Integer c = 30;
		 findMax(a, b, c);
		 
		 
		 
		
	}
}
