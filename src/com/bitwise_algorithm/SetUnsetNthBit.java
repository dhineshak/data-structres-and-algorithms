package com.bitwise_algorithm;

public class SetUnsetNthBit {

	public static int setNthbit(int number,int n) {
		return number | (1<<(n-1));
	}
	
	public static int unsetNthbit(int number,int n) {
		return number & (~(1<<(n-1)));
	}
	
	public static int togglebit(int number,int n) {
		return number ^ (1<<(n-1));
	}
	
	public static boolean bitsetcheckusingleftshift(int number, int n) {
		return (number & 1<<(n-1)) != 0;
	}
	
	public static boolean bitsetcheckusingrightshift(int number, int n) {
		return (number>>(n-1) & 1) != 0;
	}
	
	public static void main(String[] args) {
		int number = 5;
		int n = 2;
		System.out.println(Integer.toBinaryString(number));
		System.out.println(setNthbit(number,n));
		System.out.println(unsetNthbit(number,n));
		System.out.println(togglebit(number,n));
		System.out.println(bitsetcheckusingleftshift(number,n));
		System.out.println(bitsetcheckusingrightshift(number,n));
	}

}
