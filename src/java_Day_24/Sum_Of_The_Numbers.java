package java_Day_24;

import java.util.Arrays;

public class Sum_Of_The_Numbers {
	public static void main(String[] args) {
		//create an array of integers length 3
		
		int [] numbers = new int[3];
		numbers[0] = 25; 
		numbers[1] = 10;
		numbers[2] = 20;
		
		//if you print an array you will get location / hashcode
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		//toString method comes from arrays class. Used to print array as String so we can see what's
		//in our array
		
		//Use for loop to loop through the array. 
		//Calc sum of all elements
		//numbers.length --> returns number of elements in array.
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
		
		
		//find largest value in array
		int max = Integer.MIN_VALUE;
		System.out.println(max);				//	5,10,7,20,25
		
		for(int i = 0; i < numbers.length; i ++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
			System.out.println("max value: " + max);
		
		//find the minimum value in the array
			
			int min = Integer.MAX_VALUE;
			
			for(int i = 0; i < numbers.length; i++) {
				if(numbers[i] < min) {
					min = numbers[i];
				}
			}
		System.out.println("min value: " + min);
		
		
		
		
		
}
}
