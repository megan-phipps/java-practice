package java_Day_32;

import java.util.Arrays;

public class Array_Parameters {
	public static void main(String[] args) {
		/*
		 * Method: printArray
		 * return type: void
		 * 
		 * Method name:
		 */
		int [] myArray = {3, 4, 5, 7, 9};  //Assigning values to an array using variable
		printArray(myArray);
		
		printArray(new int[] {33, 45, 54, 78});  //Assigning values to an array directly
		
		print2Arrays(new int [] {5, 7, 4, 6, 2}, new int[] {6, 90, 2, 54, 5, 78, 53, 65,87});  //assigning values 
																							   //to 2 arrays directly
		print2ArraysV2(new int [] {5, 7, 4, 6, 2}, new int[] {6, 90, 2, 54, 5, 78, 53, 65,87});
	
	}
	
	public static void printArray(int[] nums) {
		for(int n: nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public static void print2Arrays(int[] a, int[] b) {
		if(a.length > b.length) {
			System.out.println(Arrays.toString(b) + " " + Arrays.toString(a));
		}else {
			System.out.println(Arrays.toString(a) + " " + Arrays.toString(b));
		}
	}
		
	public static void print2ArraysV2(int[] a, int[] b) {
			if(a.length > b.length) {
				printArray(b);
				printArray(a);
				
			}else {
				printArray(a);
				printArray(b);
			}
		}
	
	
}
