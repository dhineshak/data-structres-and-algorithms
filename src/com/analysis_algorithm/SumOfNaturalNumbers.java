package com.analysis_algorithm;

public class SumOfNaturalNumbers {

	public static int sumUsingFormula(int number) {
		return (number*(number+1))/2;
	}

	public static int sumUsingDoubleLoop(int number) {
		int sum = 0;
		for(int i = 1 ;i <= number ; i++) {
			for(int j = 1 ;j <= i ; j++) {
				sum++; 
			}
		}
		return sum;
	}
	
	public static int sumUsingSingleLoop(int number) {
		int sum = 0;
		for(int i = 1 ;i <= number ; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static int sumUsingRecursive(int number) {
		if(number == 1) {
			return number;
		}
		else {
			return number + sumUsingRecursive(number - 1);			
		}
	}
	
	public static void main(String[] args) {
		int number = 10;
		System.out.println(sumUsingFormula(number));
		System.out.println(sumUsingDoubleLoop(number));
		System.out.println(sumUsingSingleLoop(number));
		System.out.println(sumUsingRecursive(number));
	}

}
