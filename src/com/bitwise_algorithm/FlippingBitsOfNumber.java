package com.bitwise_algorithm;

public class FlippingBitsOfNumber {

	/*
	 * 10111->01000
	 * Flipped_Value = 11111 - 10111 
	 * else
	 * Do XOR => Flipped_Value = 11111 ^ 10111
	 */
	public static int flippingBits(int number) {
		int sum = 0;
		int temp = number;
		while(temp > 0) {
			temp = temp >> 1;
			sum++;
		}
		sum = (int)Math.pow(2, sum);
		return (sum-1) ^ number;
	}
	
	public static void main(String[] args) {
		int number = 11;
		System.out.println(flippingBits(number));
	}

}
