package com.bitwise_algorithm;

public class MostSignificantBitValue {

	public static void main(String[] args) {
		int number = 32;
		int msbvalue = 0;
		msbvalue = (int)Math.pow(2, LogBaseTwo.logBaseTwo(number));
		System.out.println(msbvalue);
	}

}
