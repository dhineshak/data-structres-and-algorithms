package com.bitwise_algorithm;

public class MaximumANDValue {

	public static int maxANDValue(int arr[]) {
		int maxandvalue = 0;
		for(int i = 30; i >= 0 ;i-- ) {
			int sum = 0 ;
			int temp = maxandvalue|(1<<i);
			for(int j = 0; j<arr.length;j++) {
				if((temp & arr[j]) == temp) {
					sum++;
				}
			}
			if(sum >= 2) {
				maxandvalue = temp;
			}
		}
		return maxandvalue;
	}
	
	public static void main(String[] args) {
		int arr[] = {18,15,13,12,12,11};
		System.out.println(maxANDValue(arr));
	}
}
/*
 * 01000
 * 10000
 * 00110
 * 00111
 * 10100
 * 11111
 */
