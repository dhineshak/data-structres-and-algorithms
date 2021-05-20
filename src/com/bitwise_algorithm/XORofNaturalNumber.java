package com.bitwise_algorithm;

public class XORofNaturalNumber {

	/*
	 *  0001	0001  rem->1 (1)
		0010	0011  rem->2 (n+1)
		0011	0000  rem->3 (0)
		0100	0100  rem->0 (n)
		0101	0001  rem->1 (1)
		0110	0111  rem->2 (n+1)
		0111	0000  rem->3 (0)
		1000	1000  rem->0 (n)
	 */
	public static int xorOfNaturalNumbers(int number) {
		if((number % 4) == 0) {
			return number;
		}else if((number % 4) == 3) {
			return 0;
		}else if((number % 4) == 2) {
			return number + 1;
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(xorOfNaturalNumbers(n));
	}

}
