package java_Day_24;

import java.util.Arrays;

public class Lottery_Ticket {
	public static void main(String[] args) {
		int[] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.parallelSort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		
		// binary search works only with sorted array
		int index = Arrays.binarySearch(lotteryNumbers, 45);
		System.out.println("Position: " + index);
		
		//if value doesn't exist
		int index2 = Arrays.binarySearch(lotteryNumbers, 40);
		System.out.println("Position: " + index2);
		
	}
}
