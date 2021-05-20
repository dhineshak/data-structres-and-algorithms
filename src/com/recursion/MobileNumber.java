package com.recursion;

import java.util.ArrayList;

public class MobileNumber
{
	static String alphabets[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void possibleValues(int[] num,int index,String data) {
		if(index == num.length) {
			list.add(data);
			return;
		}
		for(int i = 0; i < MobileNumber.alphabets[num[index]].length() ; i++) {
			possibleValues(num,index+1,data+alphabets[num[index]].charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {3,4,5};
		possibleValues(num,0,"");
		System.out.println(MobileNumber.list);
	}

}
