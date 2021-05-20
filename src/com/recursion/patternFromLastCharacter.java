package com.recursion;

public class patternFromLastCharacter {

	/*
	 * printPattern method is used to print pattern starting with last character.
	 * @parameter String word
	 * @return void
	 */
	public static void printPattern(String word) {
		int wordLength = word.length();
		for(int i = 0; i < word.length(); i++) {
			for(int j = 0; j < word.length(); j++) {				
				if(j == wordLength - 1) {
					System.out.print(word.substring(j));
					wordLength -= 1;
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String word = "PROGRAM";
		printPattern(word);
	}

}
