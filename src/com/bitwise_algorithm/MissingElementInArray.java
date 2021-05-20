package com.bitwise_algorithm;

import java.util.Arrays;

public class MissingElementInArray {
	/*
	 * oneMissingNumber method is used to find one missing number in array
	 * @parameter int arr
	 * @return int missingnumber
	 */
	public static int oneMissingNumber(int arr[]) {
		int missingnumber = 0;
		for(int i = 0;i < arr.length;i++) {
			missingnumber = missingnumber ^ arr[i];
			missingnumber = missingnumber ^ (i+1);
		}
		missingnumber = missingnumber ^ (arr.length + 1);
		return missingnumber;
	}
	
	/*
	 * moreMissingNumber method is used to find one missing number in array
	 * @parameter int arr
	 * @return String missingNumber
	 */
	public static String moreMissingNumber(int arr[],int totalNumbers) {
		String missingNumber = "";
		int j = 0;
		int count = 0;
		for(int i = 1;i <= totalNumbers;i++,j++) {
			if(arr[j] != i) {
				missingNumber += (i)+",";
				j--;
				count += 1;
				if(count == totalNumbers-arr.length) {
					return missingNumber.substring(0, missingNumber.length()-1);
				}
			}
			if(i == totalNumbers-1) {
				return missingNumber += i+1;
			}
		}
		return missingNumber;
	}
	
	/*
	 * arr[length] contains number from 1 to length+1 with one missing number
	 */
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 6, 10, 8};
		int totalNumbers = 10;
		if(arr.length == totalNumbers - 1 ) {
			System.out.println("missing number is " + oneMissingNumber(arr));
		}else {
			Arrays.sort(arr);
			System.out.println("missing numbers are " + moreMissingNumber(arr,totalNumbers));
		}
		
	}

}
