package after_class_recap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.*;


public class Java_Day_28_Recap_2D_Arrays {

	public static void main(String[] args) throws IOException {

		//Create a String variable sentence and assign any value. 
		String sentence = "java loves me";
			
		//print the number of words in the string
		//then declare a new String called reversed and print the reversed sentence.
		String[]sentenceArr = sentence.split(" ");
		System.out.println(sentenceArr.length);
		for(int i = sentenceArr.length-1; i>= 0; i--) {
			System.out.print(sentenceArr[i] + " ");
		}
		
		System.out.println();	
		//Do the same thing again	
		//Create a String variable sentence and assign value.
		String beach = "I like going to the beach";
		//print the number of words in the string
		String[] beachArr = beach.split(" ");
		System.out.println(beachArr.length);
		//assign to new String called reversed2 then print the reversed sentence.
			
		for(int i = beachArr.length-1; i >=0; i--) {
			System.out.print(beachArr[i] + " ");
		}
		System.out.println();
		
//*****************************************************************************************************************************
		
		//use .readAllLines and Paths.get to read all the data from the fast food list and assign that to an array
		String []fastFoodArr = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		//Print out the length of the array
		System.out.println(fastFoodArr.length);
		
		//print first, second, and last row of the array
		System.out.println(fastFoodArr[0]);
		System.out.println(fastFoodArr[1]);
		System.out.println(fastFoodArr[fastFoodArr.length-1]);
		//Print each Restaurant info in separate lines and number them 
		for(int i = 0; i <= fastFoodArr.length-1; i++) {
			System.out.println(i + " " + fastFoodArr[i]);
		}
		
		//Not a question, just some notes from class
		
		//How to find if files are identical
		//FastFoodRestaurants1.csv --> String [] data1
		//FastFoodRestaurants2.csv --> String [] data2
		//Arrays.equals(data1, data2);
		
		System.out.println("**************************************");
		//Print all restaurant information in state of Virginia. 
		//Print out the number of restaurants in Virginia on the list as well
		
		int count = 0;
		for(String temp: fastFoodArr) {
			if(temp.contains(".mcdonalds")) {
				count++;
				System.out.println(count + " " + temp);
			}
		}
			
		//Print the restaurant names in VA along with city names
		//Example: Subway - Herndon
		for(String temp: fastFoodArr) {
			String[] tempArr = temp.split(",");
			System.out.println(tempArr[3] + " " + tempArr[4]);
		}
		
		
//****************************************************************************************************************************		
	
		//declare a String Multi-dimentional Array called teams with 2 rows / arrays and 6 elements
		String[][] teams = new String [2][6];
		
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";
		
		//print first player of first team
		System.out.println(teams[0][0]);
		
		//print habib
		System.out.println(teams[0][3]);
		
		//print dmitriy
		System.out.println(teams[1][5]);
		
		//print how many rows / teams / arrays
		System.out.println(teams.length);
		
		//print how many players in team 1
		System.out.println(teams[0].length);
		
		//print how many players in team 2
		System.out.println(teams[1].length);
		
		//print both arrays
		System.out.println(Arrays.deepToString(teams));

		
		//declare a new multi d array based on the data below
		int[][] nums = new int[3][4];
		
		nums[0][0] = 100;
		nums[0][1] = 34534;
		nums[0][2] = 343242;
		nums[0][3] = 77242;
		
		nums[1][0] = 256;
		nums[1][1] = 64546;
		nums[1][2] = 257776;
		nums[1][3] = 999776;
		
		nums[2][0] = 1256;
		nums[2][1] = 164546;
		nums[2][2] = 23846864;
		nums[2][3] = 34782;
		
		//Given the data above, print all arrays
		System.out.println(Arrays.deepToString(nums));
		
		
		//Given the data above, print first array 
		
		System.out.println(Arrays.deepToString(nums));
		for(int[] group: nums) {
			for(int temp: nums[0]) {
				System.out.print(temp + " ");
		}
		}
		System.out.println();
		
		int[][] scores = { {3, 5, 10}, {6, 4, 2, 10} };
		
		//Given the data above, print the number of arrays
		System.out.println(scores.length);
		
		//Given the data above, print the number of values in first array
		System.out.println(scores[0].length);
		
		//Given the data above, print the number of values in second array
		System.out.println(scores[1].length);
		
		
		//Another way of declaring array. Used when you don't know how many items you need. Now you know
		//you want 4 arrays but not sure how many values in each array
//		int[][] values = new int [4][];
//		values[0] = new int[] {34, 23, 5};  //values[0] means all values in this array
//		values[1] = new int[] {34, 54, 755, 756, 57, 32, 587, 97, 34, 234, 53, 76};
//		
//		
//		values[2] = new int[2];
//		values[2][0] = 55;
//		values[2][1] = 88;
//		
//		values[3] = new int[] {5, 12, 45, 77, 34};
//		
//		System.out.println(Arrays.deepToString(values));	
		
//****************************************************************************************************************************
		
				String[][] pizzas = {{"pineapple", "pepperoni"}, //0
									{"anchovies", "mushrooms", "olives"}, //1
									{"4 cheese"},  //2
									{"chicken", "tomatoes", "jalapenoes", "onions"}, //3
									{"green peppers", "zuccini", "brocolli", "spinach", "shrimp"}}; //4
	
	//Print out the 2 elements(toppings) for the first array 
	System.out.println(Arrays.deepToString(pizzas[0]));
	
	System.out.println("******************************");
	//Print out the number of topping for each pizza, followed by " - ", then print out the toppings of each pizza
	//Output should look like this:  2 - [pineapple, pepperoni];


	System.out.println("******************************");
	//do the same thing above using a for loop instead
	

	System.out.println("******************************");
	//write a for each loop that prints out the topping for the third pizza
	
	
	
	System.out.println("******************************");
	
	
	int[][] students = {{4,5,6}, {12,5,7}, {23, 55, 12, 55, 3}};
	
	//print out all the numbers from the arrays
	
	
	
	int[][] nums2 = { {10, 20}, 
					 {20, 30, 40, 50}, 
					 {100, 200, 400}, 
					 {555, 333, 111, 444, 666, 78} };
	
	//print out all the numbers from the array starting with the last array and ending with the first array so it looks like this:
			//[555, 333, 111, 444, 666, 78]
			//[100, 200, 400]
			//[20, 30, 40, 50]
			//[10, 20]
	
	
		
			
		
		
}
}
