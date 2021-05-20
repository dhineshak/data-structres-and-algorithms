package com.bitwise_algorithm;

public class OneOddOccuringElement {

	public static int oddOccuringElement(int arr[]) {
		int xorvalue = 0;
		for(int i = 0;i < arr.length;i++) {
			xorvalue = xorvalue ^ arr[i];
		}
		return xorvalue;
	}
	public static void main(String[] args) {
		int arr[] = {3,3,2,1,1,2,4,3,4};
		System.out.println(oddOccuringElement(arr));
	}

}
