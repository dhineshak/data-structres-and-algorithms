package com.bitwise_algorithm;

public class CountSetBits {

	public static int countSetBits(int number) {
		int sum = 0;
		while(number != 0) {
			if((number&1) == 1) {
				sum++;
			}
			number = number>>1;
		}
		return sum;
	}
	/*
	 * This method will clear last set bit in binary number
	 */
	public static int countSetBitsUsingBrianKerningham(int number) {
		int sum = 0;
		while(number !=0) {
			number = number & (number-1);
			sum++;
		}
		return sum;
	}
	/*
	 * table stores number of set bit in each number
	 */
	public static int countSetBitUsingLookupTable(int number) {
		int table[] = new int[256];
		table[0]= 0;
		for(int i = 1; i < table.length ; i++) {
			table[i] = (i&1) + table[i/2];
		}
		return table[(number)&0xff] + table[(number)>>8&0xff] + 
				table[(number)>>16&0xff] + table[(number>>24)&0xff];
	}
	
	public static void main(String[] args) {
		int number = 255;
		System.out.println(countSetBits(number));
		System.out.println(countSetBitsUsingBrianKerningham(number));
		System.out.println(countSetBitUsingLookupTable(number));
	}

}
