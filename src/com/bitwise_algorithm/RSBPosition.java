package com.bitwise_algorithm;

public class RSBPosition {

	public static int rsbPosition(int number) {
		if(number > 0) {
			return (int)(Math.log10(number & ~(number - 1))/Math.log10(2))+1;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int number = 16;
		System.out.println(rsbPosition(number));
	}

}
