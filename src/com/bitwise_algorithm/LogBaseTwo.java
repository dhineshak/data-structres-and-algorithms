package com.bitwise_algorithm;

public class LogBaseTwo {

	/*
	 * This will return floor of logbase2(Not exact logbase2)
	 */
	public static int logBaseTwo(int number) {
		int sum = 0;
		while(number > 1) {
			number = number >> 1;
			sum++;
		}
		return sum;
	}
	
	public static double logBase2(int number) {
		return (Math.log10(number)/Math.log10(2));
	}
	
	public static void main(String[] args) {
		int number = 31;
		System.out.println(Integer.toBinaryString(number));
		System.out.println(logBaseTwo(number));
		System.out.println(logBase2(number));
	}

}
