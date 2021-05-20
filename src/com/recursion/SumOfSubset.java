package com.recursion;

public class SumOfSubset {

	public static int checkingSumOfSubset(int array[],int n,int sum){
		if(n == 0) {
			return (sum == 0)? 1 : 0;
		}
		return checkingSumOfSubset(array,n-1,sum)+checkingSumOfSubset(array,n-1,sum-array[n-1]);
		//ignoring unwanted cases
		//return ((sum>=0)?checkingSumOfSubset(array,n-1,sum):0)+ 
		//((sum>=0)?checkingSumOfSubset(array,n-1,sum-array[n-1]):0);
	}
	
	public static void main(String[] args) {
		int array[] = {10,20,5,15};
		int sum = 25;
		System.out.println(checkingSumOfSubset(array,array.length,sum));
	}

}
