package com.recursion;

public class LongestWordWithoutRepeatation {
	
	/*
	 * checkRepeatation is used to check whether characters in word is repeated or not.
	 * @parameter word
	 * @return int
	 */
	public static int checkRepeatation(String word) {
		for(int i = 0; i < word.length()-1; i++) {
			for(int j = i+1; j < word.length();j++) {
				if(word.charAt(i) == (word.charAt(j))) {
					return 0;
				}
			}
		}
		return word.length();
	}

	public static void main(String[] args) {
		String input = "Step on no pets please";
		String words[] = input.split(" ");
		String longestWord = "";
		int count = 0;
		for(int i = 0; i < words.length; i++) {
			int nonRepeatWordLength;
			nonRepeatWordLength = checkRepeatation(words[i]);
			if(nonRepeatWordLength > count) {
				longestWord = words[i];
				count = nonRepeatWordLength;
			}else if(nonRepeatWordLength == count && (count != 0)) {
				longestWord = longestWord + " / " + words[i];
			}
		}
		System.out.println(longestWord);

	}

}
