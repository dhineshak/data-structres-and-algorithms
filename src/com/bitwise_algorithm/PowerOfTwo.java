package com.bitwise_algorithm;

public class PowerOfTwo {

	public static boolean powerOfTwo(int number) {
		return ((number & (number-1)) == 0);
	}
	public static void main(String[] args) {
		int number = 9;
		System.out.println(powerOfTwo(number));
	}

}
