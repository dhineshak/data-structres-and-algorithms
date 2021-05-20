package com.bitwise_algorithm;

public class SwapUsingXOR {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 7;
		number1 = number1 ^ number2; //Number1 will have XOR value 
		number2 = number1 ^ number2; //Number2 will have Number1(Doing XOR with same number twice will cancel)
		number1 = number1 ^ number2;
		System.out.println("number1 : "+number1+"\nnumber2 : "+number2);
	}

}
