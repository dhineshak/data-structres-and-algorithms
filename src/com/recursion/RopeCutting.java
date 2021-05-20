package com.recursion;

public class RopeCutting {
	 
	public static int findMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int cutRope(int ropelength,int arr[]) {
		if(ropelength == 0) {
			return 0;
		}else if(ropelength < 0) {
			return -1;
		}else {
			int count[] = new int[arr.length];
			int max = -1;
			for(int i = 0; i < arr.length; i++) {
				count[i] = cutRope(ropelength - arr[i],arr);
			}
			max = findMax(count);
			if(max == -1) {
				return -1;
			}
			return max+1;
		}
	}

	public static void main(String[] args) {
		int ropelength = 24;
		int arr[] = {2};
		System.out.println(cutRope(ropelength,arr));
	}

}
