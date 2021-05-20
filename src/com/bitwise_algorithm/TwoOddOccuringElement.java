package com.bitwise_algorithm;

public class TwoOddOccuringElement {

	public static void twoOddOccuringElement(int arr[]) {
		int xorvalue = 0;
		int rsb = 0;
		int result1 = 0;
		int result2 = 0;
		for(int i = 0;i < arr.length;i++) {
			xorvalue = xorvalue ^ arr[i];
		}
		rsb = findRSB(xorvalue);
		for(int i = 0;i<arr.length;i++) {
			if((arr[i] & rsb) == 0) {
				result1 = result1 ^ arr[i];
			}else {
				result2 = result2 ^ arr[i];
			}
		}
		System.out.println("Number 1 : "+result1);
		System.out.println("Number 2 : "+result2);
	}
	
	public static int findRSB(int value) {
		return value & ~(value - 1);
	}
	
	public static void main(String[] args) {
		int arr[] = {3,3,2,1,1,2,4,3,4,9};
		twoOddOccuringElement(arr);
	}

}
