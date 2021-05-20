package com.recursion;

public class Josephus {

	public static int Survivor(int totalPeople, int killIndex) {
		if(totalPeople == 1) {
			return 1;			//If starting position considered as 0 => return 0;
		}
		//If starting position considered as 0,
		//return (Survivor(totalPeople-1,killIndex) + killIndex ) % totalPeople;
		//And add 1 to driver function(To change as starting position 1)
		return (Survivor(totalPeople-1,killIndex) + killIndex -1) % totalPeople +1;
	}
	
	public static void main(String[] args) {
		int totalPeople = 5;
		int killIndex = 3;
		int survivor = Josephus.Survivor(totalPeople,killIndex);
		System.out.println(survivor);
	}

}
