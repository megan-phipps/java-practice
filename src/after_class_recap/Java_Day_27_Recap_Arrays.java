package after_class_recap;
import java.util.*;
public class Java_Day_27_Recap_Arrays {
	public static void main(String[] args) {

		//declare 2 int arrays time1 and time2. Both arrays must have 2 values. The first value 
		//at index 0 represents hours and the second value at index 1 represents minutes.
		// hours must be between 0-23
		// minutes must be between 0-59
				//For example:
				//time1 = {11, 10} means 11 hours, 10 mins
				//time2 = {15, 25} means 
		
		int[] time1 = {12, 15};
		int[] time2 = {15, 35};
		
		
		//Now that you've declared 2 int arrays and assigned them values, write 
		//a condition to test if time1 and time2 have been assigned valid hours and minutes. 
		//If hours or minutes are invalid print "invalid time"
				
		
		
		//Finally, compare the arrays to tell which time is earlier without using a loop. 

		
		
		
		System.out.println("**********************************");
		
		
		//Print only the last 3 numbers from the following Strings 
		String javaProgramming_url = "https://learn.cybertekschool.com/courses/147";
		String mentoringSessions_url = "https://learn.cybertekschool.com/courses/204";
		String SDLC_url = "https://learn.cybertekschool.com/courses/149";
		String QA_Testing_url = "https://learn.cybertekschool.com/courses/152";
		String team_Activity_url = "https://learn.cybertekschool.com/courses/144";
		String welcome_Kit_url = "https://learn.cybertekschool.com/courses/143";
		//plan: 1) Convert to array to use split method
			//	2) convert last 3 numbers to integer. Integer.parseInt(...) --> int value
			//	3) print
		
		String[] javaArray = javaProgramming_url.split("/");
			int javaNumber = Integer.parseInt(javaArray[javaArray.length-1]);
				System.out.println(javaNumber);
		
		String[] mentoringArray = mentoringSessions_url.split("/");
			int mentoringNumber = Integer.parseInt(mentoringArray[mentoringArray.length-1]);
				System.out.println(mentoringNumber);
		
		String[] SDLC_Array = SDLC_url.split("/");
			int SDLC_number = Integer.parseInt(SDLC_Array[SDLC_Array.length-1]);
				
					
		//Below we can see the course ID associated with each course. 
		//Write a switch statement that will print the name of the course based on the course ID.  
		//In this case, use courseID = 149
		//if the number for course ID does not match any of the courses, print "unknown course."
				
				//147 --> Java Programming
				//204 --> Mentoring Sessions
				//149 --> SDLC
				//152 --> QA Testing
				//144 --> Team Activity
				//143 --> Welcome Kit
				
				
			
		System.out.println("**********************************");		
		
		//Below we can see tools that have different descriptions. For example, Selenium is used for test automation. 
		//Write a switch statement that will print each tool description based on the name of the tool.  
		//Make sure to use the array below and loop through the switch case
		//if the tools do not match the tool description, print "unknown tool."
				
				
				//java - programming language
				//Selenium test automation
				//testNG Unit tests
				//JUnit - unit testing
				//Cucumber - BDD Style Testing
				//Git - Version control
				//Maven - Building and execution for project
				
				
		String [] tools = {"Java", "selenium", "testNG", "JUnit", "cucumber", "Git", "Maven"};
				
				
				


//		*******************************************************************************************************************
		//toString, Split, sort, binarySearch, equals, copyOf
		
		
		
		//Looking at patterns
		//split method must be used on Strings but the value of that string will be put in an Array
		//The rest of the methods below must be used on Arrays
					
				//toString method
					//converts an array to a string and allows you to 
					//print out all the values of an array without using a loop
					
		int[] nums = {43, 12, 4, 1, 3, 5};
		//print the values in the array using the toString method
		String numbers = Arrays.toString(nums);
		System.out.println(numbers);
		
		
					
		System.out.println("**********************************");			
					
			//sort method
				//sorts array in ascending order (from small to large)
					//Use the sort method to to sort the array nums above and print it out. 
					//Remember, there are 2 ways to print an array, using a loop or using the toString method
			Arrays.sort(nums);
			System.out.println("HERE" + Arrays.toString(nums));
					
			
		
					String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic"};
					//Sort the languages in alphabetical order then print out the new sorted String
					//General tip: When sorting, numbers come first, then uppercase, then lowercase
				
			Arrays.sort(languages);	
			System.out.println(Arrays.toString(languages));
				
					
					int[] nums2 = {345, 665, 3333, 11, 3, 66};
					//find lowest and highest values from nums2 array
				Arrays.sort(nums2);	
				System.out.println(Arrays.toString(nums2));
				System.out.println("The smallest number is " + nums2[0]+ ". The largest number is "+ nums2[nums2.length-1]);	
					
		System.out.println("**********************************");			
					
				//binarySearch method
					//Searches for a value in the array, and returns index
					//Has precondition...array must be sorted first
					//binary search will return negative number if numbers are not 
					//in order or if number does not appear in array
					
				
				//Use the binarySearch method to find the index of number 10 in the nums3 array 
				int[] nums3 = {4, 10, 20, 50}; 
				System.out.println("10 is at index: " + Arrays.binarySearch(nums3, 10));
				
				
					
				int[] nums4 = {4, 6, 7, 10, 55};
				//Use the binarySearch method to find the index of number 7 in the nums4 array
				System.out.println("The index of 7 is: " + Arrays.binarySearch(nums4, 7));
				
					
				//Use the binarySearch method to find the index of number 5 in the nums4 array. 
				//What number appears and why?
				System.out.println("Index of 5 is: " + Arrays.binarySearch(nums4, 5));
				//It's negative because 5 isn't in the array
					
				
				int i = Arrays.binarySearch(nums4, 10);
				System.out.println(i);  //prints 3
					
					
				//if not in ascending order will likely show incorrect index. For example: try to print 10
				int[] nums5 = {40, 6, 17, 10, 55};
				System.out.println("Trying to print index of 10: " + Arrays.binarySearch(nums5, 10));
					
				//Now try to sort and see what happens
				Arrays.sort(nums5);
				System.out.println(Arrays.toString(nums5));
				System.out.println("Printing the index of 10 after array is sorted: " + Arrays.binarySearch(nums5, 10));
				
		System.out.println("**********************************");	
		
				//Equals method
					//compares 2 arrays and returns true if they are same / equal, returns false if they are different
					//(different value or length)
					
					//use the equals method to see if the 2 arrays above are equal to each other
					int [] arr1 = {4, 5, 6, 10, 100};
					int [] arr2 = {4, 5, 6, 10, 100};
					
					System.out.println(Arrays.equals(arr1, arr2));
					
					//Write an if condition using the equals method. If arr1 equal arr2 print "They are exactly the same"
					//else print "Mismatched values present"
					if(Arrays.equals(arr1, arr2)) {
						System.out.println("They are exactly the same");
					}else {
						System.out.println("Mismatched values present");
					}
					
					String [] strArr1 = {"one", "two", "three"};
					String [] strArr2 = {"One", "Two", "Three"};
					//use the equals method to see if the 2 arrays above are equal to each other
					System.out.println(Arrays.equals(strArr1, strArr2));
					
					//Since the equals method returns true/false, you can store this in a boolean variable 
					//and print. Try it
					boolean bool = Arrays.equals(strArr1, strArr2);
					System.out.println(bool);
					
					
					// Why wont the code below compile?
					//Arrays.equals(strArr1, nums2);
					
					
					// because one is String and one is int. Can only compare same data type
					
		System.out.println("**********************************");
				
				//copyOf method
					//makes a copy of an array
		//when you do copyOf it's KIND OF like making a copy on google docs. Any changes you make don't affect the original
		//however if you make changes to the original it will affect the copy if the changes are made before the copy
		//you can copy values from one array into another without pointing to the same object in memory
					
					double[] d1 = {2.3, 4.5, 12.4};
					double[] d2 = d1;
					//print out array d1 and array d2. Are they the same?
					System.out.println(Arrays.toString(d1));
					System.out.println(Arrays.toString(d2));
					
					//We are going to change index 0 of d1 to 1000.3. 
					//Do you think the values of the 2 arrays will change or just the values of 1 array
					//print out array d1 and array d2. 
					d1[0] = 1000.3;
					System.out.println(Arrays.toString(d1));
					System.out.println(Arrays.toString(d2));
					
					//We are going to change index 1 of d2 to 4000.5. 
					//Do you think the values of the 2 arrays will change or just the values of 1 array
					//print out array d1 and array d2. 
					d2[1] = 4000.5;
					System.out.println(Arrays.toString(d1));
					System.out.println(Arrays.toString(d2));
					//the value of both change
					
					//make a copy of d2. Call it d3. Print d3. 
					double[]d3 = Arrays.copyOf(d2, d2.length);
					System.out.println(Arrays.toString(d3));
					
					
					//change the value of d2 at index 0 to 1. Then print out d3 again. Did anything change?
					d2[0] =1;
					System.out.println("NEW" + Arrays.toString(d3));
					//Nothing changed
					
					//Make a copy of array nums6, then add 2 spaces to the end and print.
					int[] nums6 = {34, 56, 23, 1, 55};
					int[] nums7 = Arrays.copyOf(nums6, nums6.length + 2);
					System.out.println(Arrays.toString(nums7));
					
					//Assign values to the last 2 indexes and print
					nums7[5] = 30;
					nums7[6] = 50;
					System.out.println(Arrays.toString(nums7));
					
					//use copyOfRange to get a copy of nums6 from index 1 to 3 then print;
					Arrays.copyOfRange(nums6, 1, 3);
					System.out.println(Arrays.toString(Arrays.copyOfRange(nums6, 1, 3)));
					
					
					int[] brandNew = {34, 23, 54, 23};
					//print the length of this array, then add 5 and print again
					System.out.println(Arrays.toString(brandNew));
					int [] newer = Arrays.copyOf(brandNew, brandNew.length+5);
					System.out.println(Arrays.toString(newer));
					
					
					//Webpage:
					String str1 = "apple,orange,orange";
					//Database:
					String str2 = "apple,apple,orange";
					//See if the arrays are the same
					
					String[] str1_Array = str1.split(",");
					String[] str2_Array = str2.split(",");
					
					Arrays.sort(str1_Array);
					Arrays.sort(str2_Array);
					System.out.println(Arrays.equals(str1_Array, str2_Array));
					
					System.out.println();
					
					//Better way to do it
					System.out.println(Arrays.equals(str1.split(","), str2.split(",")));
					
	}
}
