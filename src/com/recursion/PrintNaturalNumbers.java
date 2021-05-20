package com.recursion;

public class PrintNaturalNumbers {

	/*
	 * printNaturalNumbers method prints from 1 to n
	 */
	public static void printNaturalNumbers(int n,int start) {
		if(start == (n+1)) {
			return ;
		}else {
			System.out.print(start+" ");
			printNaturalNumbers(n,start+1);
		}
	}
	
	/*
	 * printNaturalNumbers method prints in reverse order
	 */
	public static void printNaturalNumbers(int n) {
		if(n <= 0) {
			return ;
		}else {
			System.out.print(n+" ");
			printNaturalNumbers(n-1);
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		printNaturalNumbers(n);
		System.out.println();
		printNaturalNumbers(n,1);
	}

}
