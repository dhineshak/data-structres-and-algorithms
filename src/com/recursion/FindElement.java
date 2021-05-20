package com.recursion;

public class FindElement {

	public static String findElement(int arr[],int position,int element) {
		if(position == arr.length-1 && arr[position] != element) {
			return "Not found";
		}
		if(arr[position] == element) {
			return "found";
		}else {
			return findElement(arr,position+1,element);
		}
	}
	
	public static String findElementBySearchingBothSides(int arr[],int start,int end,int element) {
		if(start > end) {
			return "Not found";
		}
		else if((arr[start] == element) || (arr[end] == element)){
			return "found";
		}else {
			return findElementBySearchingBothSides(arr,start+1,end-1,element);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,6,5,9,13,4};
		int element = 7;
		System.out.println(findElement(arr,0,element));
		System.out.println(findElementBySearchingBothSides(arr,0,arr.length-1,element));
	}

}
