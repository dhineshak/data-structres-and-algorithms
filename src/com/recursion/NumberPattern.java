package com.recursion;

public class NumberPattern {

	public static void printPattern(int n) {
		if(n <= 0) {
			return;
		}
		System.out.print(n+" ");
		printPattern(n-1);
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		int n = 5;
		printPattern(n);
	}

}
