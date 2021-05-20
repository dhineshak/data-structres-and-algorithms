package com.bitwise_algorithm;

public class ShiftOperators {

	public static void main(String[] args) {
		int i=-28,j=28,x=7;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(j));
		i = i>>>26;
		j = j>>>1;
		x = (x<<1) + x + (x>>1);
		System.out.println(i);
		System.out.println(j);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(j));
		System.out.println(x+"x : "+Integer.toBinaryString(x));
		int d = -5;
		System.out.println(Integer.toBinaryString(d));
		d=~d;
		System.out.println(Integer.toBinaryString(d));
	}

}
