package java_day_52;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		final int[] TEAMS = {11, 11};
		System.out.println("Team 1: " + TEAMS[0]);
		System.out.println("Team 2: " + TEAMS[1]);
		
		TEAMS[0] = 10;
		System.out.println(TEAMS[0]);
		TEAMS[1] = 9;
		System.out.println(TEAMS[1]);
		
		//will not let you create a new array using new keyword
		
		
		int[] nums = new int[] {23, 55, 35543};
		System.out.println(Arrays.toString(nums));
		
		nums = new int[] {2342, 345645, 43,46,45,5,1};
		System.out.println(Arrays.toString(nums));
		
		final int [] finalNums = {213, 346,74,475};
		System.out.println(Arrays.toString(finalNums));
		
		//finalNums = new int[] {22, 44, 56, 64,547,4,75};
		
		
		final double [] PRICES = new double[3];
		PRICES[0] = 85.5;
		PRICES[1] = 99.99;
		PRICES[2] = 99.98;
		
		System.out.println(Arrays.toString(PRICES));
		PRICES[0] = 81.1;
		System.out.println(Arrays.toString(PRICES));
		
		
		
		
		
		
		
		
		
		
	}
}
