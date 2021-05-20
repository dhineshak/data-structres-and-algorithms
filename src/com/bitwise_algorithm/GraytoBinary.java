package com.bitwise_algorithm;

public class GraytoBinary {

	public static int grayToBinary(int n) {
        int value = 0;
        int position = (int)(Math.log10(n)/Math.log10(2))+1;
        value = 1 << (position-1);
        position--;
        while(position != 0) {
        	int binary = (value >> position) & 1;
        	int gray = (n >> (position - 1)) & 1;
        	value = value | ((binary ^ gray) << (position -1));
        	position--;
        }
        return value;
    }
	
	public static void main(String[] args) {
		System.out.println(grayToBinary(4));
	}

}
