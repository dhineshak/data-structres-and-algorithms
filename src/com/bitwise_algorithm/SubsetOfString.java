package com.bitwise_algorithm;

public class SubsetOfString {

	/*
	 * subsetlength 2->4,3->8,4->16 (2 power data length)
	 * 
	 */
	public static void SubsetOfData(String data) {
		int subsetlength = (int)Math.pow(2, data.length());
		String subset[] = new String[subsetlength];
		for(int i = 0 ; i < subsetlength ; i++) {
			String subdata = "";
			int j = 0; 
			while((i>>j) != 0){
				if(((i>>j)&1) == 1) {
					subdata += data.charAt(j);
				}
				j++;
			}
			subset[i] = subdata;
			subdata = "";
		}
		for(int i = 0;i < subsetlength ; i++) {
			System.out.print(subset[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		String data = "abc";
		SubsetOfData(data);			
	}
}
