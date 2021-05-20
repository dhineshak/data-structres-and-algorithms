package com.recursion;

public class Palindrome {

	public static boolean isPalindrome(String data) {
		if(data.length()<=1) {
			return true;
		}
		if(data.charAt(0) != data.charAt(data.length()-1)) {
			return false;
		}else {
			return isPalindrome(data.substring(1, data.length()-1));
		}
	}
	
	public static boolean isPalindrome(String data,int start,int end) {
		if(start >= end) {
			return true;
		}
		if(data.charAt(start) != data.charAt(end)) {
			return false;
		}
		return isPalindrome(data,start+1,end-1);
	}
	
	public static void main(String[] args) {
		String data = "malayalam";
		System.out.println(isPalindrome(data));
		System.out.println(isPalindrome(data,0,data.length()-1));
	}

}
