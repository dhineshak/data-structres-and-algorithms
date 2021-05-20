package com.recursion;

public class SubsetOfString {

	public static void subsetOfData(String data,String current,int position) {
		if(position == data.length()) {
			System.out.print(current+" ");
			return;
		}
		subsetOfData(data, current, position+1);
		subsetOfData(data, current+data.charAt(position), position+1);
	}
	
	public static void main(String[] args) {
		String data = "abc";
		subsetOfData(data, "", 0);
	}

}
