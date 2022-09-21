/**
 * 
 */
package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Iam_A
 *
 */



/*
 * Extend the max method to also print the max to std out
 * using Generic Method - Write printMax Generic Method which is
  * UC 5 Case
 */
public class GenericProblems<T extends Comparable<T>> { 
	T x ,y,z;
	
	public GenericProblems(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return GenericProblems.maximum(x,y,z);
		
	}
	// determine the largest of three comparable objects
	public 	static <T extends Comparable <T>> T maximum(T x ,T y,T z) {
		T max = x;
		if(y.compareTo(x)>0) {
			max = y;
		}
		if(z.compareTo(x)>0) {
			max = z;
		}
		printMax(x,y,z,max);
		return max;
	
	}

	
	public static <T>void printMax(T x ,T y,T z, T max){
		 System.out.printf("max of %s ,%s and %s is %s\n",x ,y,z ,max);
	}
	public static void main (String[] args) {
		Integer xInt = 3, yInt = 6 , zInt =8;
		Float xF1 =6.6f ,yF2=8.8f ,zf3= 9.9f;
		String xStr ="pear",yStr = "apple",zStr="orange";

	 new GenericProblems<Integer>(xInt, yInt, zInt).maximum();
	 new GenericProblems<Float>(xF1, yF2, zf3).maximum();
	 new GenericProblems<String>(xStr, yStr, zStr).maximum();
	}
}
