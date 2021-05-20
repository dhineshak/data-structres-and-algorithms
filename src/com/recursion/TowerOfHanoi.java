package com.recursion;

public class TowerOfHanoi {

	public static void switchTower(int n,String source,String target,String temp) {
		if(n == 1) {
			System.out.println("Move "+n+" from "+source+" to "+target);
			return;
		}else {
			switchTower(n-1,source,temp,target);
			System.out.println("Move "+n+" from "+source+" to "+target);
			switchTower(n-1,temp,target,source);
		}
	}
	
	public static void main(String[] args) {
		int n = 4;
		switchTower(n,"source","target","temp");

	}

}
