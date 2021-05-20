package com.recursion;

import java.util.ArrayList;

public class StringPermutation {
	static ArrayList<String> list = new ArrayList<String>();

	public static void permutation(int index,String cur){
		if(index == cur.length()-1) {
			list.add(cur);
			return;
		}
		swap(cur,index);
	}
	
	public static void swap(String cur,int index) {
		char swapChar = cur.charAt(index);
		for(int i = index ; i < cur.length() ; i++) {
			String tem = cur;
			StringBuffer temp =new StringBuffer(cur);
			temp.setCharAt(index, cur.charAt(i));
			temp.setCharAt(i, swapChar);
			cur = temp.toString();
			permutation(index+1,cur);
			cur = tem;
		}
	}
	
	public static void main(String[] args) {
		String data = "abc";
		permutation(0,data);
		System.out.println(list);
	}

}
