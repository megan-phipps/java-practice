package java_Day_27;

import java.util.*;

public class Arrays_Class {
	public static void main(String[] args) {
		
	//.Split belongs to Strings
	//The rest below belong to Arrays
		
	//toString method
		//convert the array to a string and print
		//In general, you have 2 options to print values: you can loop or convert to toString
		int[] nums = {43, 12, 4, 1, 3, 5};
		String str = Arrays.toString(nums);
		System.out.println(str);
		
	//sort method
		//sorts array in ascending order (from small to large)
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));  //cannot print without using toString or loop
		
	
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic"};
		System.out.println(Arrays.toString(languages));   //Convert to String
		Arrays.sort(languages);							  //Sort the languages alphabetically
		System.out.println(Arrays.toString(languages));	  //Print out the new sorted String
		
		//When sorting, numbers come first, then uppercase, then lowercase
		
		
		int[] nums2 = {345, 665, 3333, 11, 3, 66};
		//find lowest and highest values from nums2 array
		Arrays.sort(nums2);  //first sort
		System.out.println("Lowest number is " + nums2[0] );
		System.out.println("Highest number is " + nums2[nums2.length-1]);
		
		
	//binarySearch method
		//Searches for a value in the array, and returns index
		//Has precondition...array must be sorted first
		
		int[] nums3 = {4, 10, 20, 50};   //this is already sorted
		System.out.println(Arrays.binarySearch(nums3, 10));  //must specify the array name then the number.
															 //will return index of the specified number
		
		int[] nums4 = {4, 6, 7, 10, 55};
		System.out.println(Arrays.binarySearch(nums4, 7));  //2
		System.out.println(Arrays.binarySearch(nums4, 5));  //-2
		
		int i = Arrays.binarySearch(nums4, 10);
		System.out.println(i);  //prints 3
		
		//binary search will return negative number if numbers are not in order
		
		//if not in ascending order will likely show incorrect index
		int[] nums5 = {40, 6, 17, 10, 55};
		System.out.println(Arrays.binarySearch(nums5, 10));  //prints -1
		
		//Now try to sort and see what happens
		Arrays.sort(nums5);  //sorting
		System.out.println(Arrays.toString(nums5));  //printing to see sorted numbers. Must make into a String first
		System.out.println(Arrays.binarySearch(nums5, 10)); //prints 1
		
	//Equals method
		//compares 2 arrays and returns true if they are same / equal, returns false if they are different
		//(different value or length)
		
		int [] arr1 = {4, 5, 6, 10, 100};
		int [] arr2 = {4, 5, 6, 10, 100};
		System.out.println(Arrays.equals(arr1, arr2)); //prints true
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("They are exactly the same");
		}else {
			System.out.println("Mismatched values present");
		}
		
		String [] strArr1 = {"one", "two", "three"};
		String [] strArr2 = {"One", "Two", "Three"};
		System.out.println(Arrays.equals(strArr1, strArr2));
		boolean match = Arrays.equals(strArr1, strArr2);
		System.out.println("match: " + match);
		
		// Why wont the code below compile?
		// Arrays.equals(strArr1, nums2);
		// because one is String and one is int. Can only compare same data type
		
//		Webpage:
//		"apple,orange,orange"
//		Database:
//		"apple,apple,orange"
//		//split into 2 arrays then made 2 loops to compare
//		
//		Store into 2 variables
//		String st1 = "apple,orange,orange";
//		String st2 = "apple,apple,orange";
//		String[] stringARR = st1.split(",");
//		String[] stringARR2 = st2.split(",");
//		for(int i = 0; i < str.Arr1.length; i++) {
//			if(!strArr1[i].equals(strArr2[i])) {
//				print mismatch strArr1
//				
//				
//				
//	Arrays.equals(s, a2)
//	
		
	//copyOf method
		double[] d1 = {2.3, 4.5, 12.4};
		double[] d2 = d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 1000.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1] = 4000.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double [] d3 = Arrays.copyOf(d2, d2.length); //specify which array you want to copy and 
													 //which part you want to copy
													 //if whole thing then use.length
		
		//when you do copyOf it's like making a copy on google docs. Any changes you make don't affect the original
		//1) you can copy values from one array into another without pointing to the same object in memory
		//2) When you copy into a new array 
		
		System.out.println("D3: " + Arrays.toString(d3));
		d2[0] = 1;
		System.out.println("D3: " + Arrays.toString(d3));
		
		//Copy all the values from the array and add 2 spaces to the end
		int[] nums6 = {34, 56, 23, 1, 55};
		int[] nums7 = Arrays.copyOf(nums6, nums6.length + 2); //taking the length plus 2 more spaces
		System.out.println(Arrays.toString(nums7));
		
		//Assign the last 2 values and print
		
		use copyOfRange to get a copy of nums6 from index 1 to 3;
		int[] nums8 = Arrays.copyOfRange(nums6, 1, 3); // 
		
		nums7[5] = 100;
		nums7[6] = 200;
		System.out.println(Arrays.toString(nums7));
		
		int[] brandNew = {34, 23, 54, 23};
		System.out.println("Length before: " + brandNew.length);
		brandNew = Arrays.copyOf(brandNew, brandNew.length + 5);
		System.out.println("Length after: " + brandNew.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		}
	

