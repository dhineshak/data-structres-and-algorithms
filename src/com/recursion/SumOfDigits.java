package com.recursion;

public class SumOfDigits {

	public static int sumOfDigits(int number) {
		if(number == 0) {
			return 0;
		}
		return (number%10)+(sumOfDigits(number/10));
	}
	
	/*
	 * Using Tail Recursive
	 */
	public static int sumOfDigit(int number,int sum) {
		if(number == 0) {
			return sum;
		}
		sum = sum + number%10;
		return sumOfDigit(number/10,sum);
	}
	
	public static void main(String[] args) {
		int number = 999;
		int sum = 0;
		System.out.println(sumOfDigits(number));
		System.out.println(sumOfDigit(number,sum));
	}

}
