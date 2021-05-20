package com.recursion;

public class Factorial {

	/*
	 * This is efficient because it is tail recursive
	 */
	public static int factorial(int number,int factorial) {
		if((number == 0) || (number == 1)) {
			return factorial;
		}else {
			return factorial(number-1,factorial*number);
		}
	}
	
	public static int factorial(int number) {
		if((number == 0) || (number == 1)) {
			return 1;
		}else {
			return number * factorial(number - 1);
		}
	}
	
	public static void main(String[] args) {
		int number = 5;
		System.out.println(factorial(number));
		System.out.println(factorial(number,1));
	}

}
