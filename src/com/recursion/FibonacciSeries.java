package com.recursion;

public class FibonacciSeries {

	public static int nthFibonacciNumber(int n) {
		if(n < 0) {
			return 0;
		}
		if((n == 0) || (n==1)) {
			return n;
		}
		return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
	}
	
	/*
	 * nthFibonacciNumber uses memoization technique
	 */
	public static int nthFibonacciNumber(int n,int arr[],int k) {
		if(n < 0) {
			return arr[0];
		}
		if((n == 0) || (n==1)) {
			return arr[n];
		}
		arr[k] = arr[k-1] + arr[k-2];
		if(n == k) {
			return arr[n];
		}
		return nthFibonacciNumber(n, arr, k+1);
	}
	
	public static void main(String[] args) {
		int n = 10;
		int arr[] = new int[n+1]; 
		arr[0] = 0;
		if(arr.length > 0) {
			arr[1] = 1;
		}
		int k = 2;
		System.out.println(nthFibonacciNumber(n));
		System.out.println(nthFibonacciNumber(n,arr,k));
	}

}
