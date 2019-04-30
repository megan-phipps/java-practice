package java_Day_27;

import java.util.Arrays;

public class Recap_Answers {
	
	public static void main(String[] args) {

		//declare 2 int arrays time1 and time2. Both arrays must have 2 values. The first value 
		//at index 0 represents hours and the second value at index 1 represents minutes.
		// hours must be between 0-23
		// minutes must be between 0-59
				//For example:
				//time1 = {11, 10} means 11 hours, 10 mins
				//time2 = {15, 25} means 
		
		int[] time1 = {15, 0};
		int[] time2 = {15, 0};
		
		//Now that you've declared 2 int arrays and assigned them values, write 
		//a condition to test if time1 and time2 have been assigned valid hours and minutes. 
		//If hours or minutes are invalid print "invalid time"
				
		if(time1[0] < 0 || time1[0] > 23 || time1[1] < 0 || time1[1] > 59) {
			System.out.println("Invalid time");
			return;
		}else if(time2[0] < 0 || time2[0] > 23 || time2[1] < 0 || time2[1] > 59) {
			System.out.println("Invalid time");
			return;
		}
			
		//Finally, compare the arrays to tell which time is earlier without using a loop. 

		if (time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		} else if (time1[0] > time2[0]) {
			System.out.println("Time2 is earlier");
		} else {
			if (time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			} else if (time1[1] > time2[1]) {
				System.out.println("Time2 is earlier");
			} else {
				System.out.println("time1 equals time2");
			}
		}
		
		
		System.out.println("**********************************");
		
		
		//Print only the last 3 numbers from the following Strings 
		//plan: 1) Convert to array to use split method
			//	2) convert last 3 numbers to integer. Integer.parseInt(...) --> int value
			//	3) print
		
		String javaProgramming_url = "https://learn.cybertekschool.com/courses/147";
		String mentoringSessions_url = "https://learn.cybertekschool.com/courses/204";
		String SDLC_url = "https://learn.cybertekschool.com/courses/149";
		String QA_Testing_url = "https://learn.cybertekschool.com/courses/152";
		String team_Activity_url = "https://learn.cybertekschool.com/courses/144";
		String welcome_Kit_url = "https://learn.cybertekschool.com/courses/143";
		
		String[] javaArray = javaProgramming_url.split("/");					//convert to Array then use split method
			int javaNumber = Integer.parseInt(javaArray[javaArray.length-1]);	//convert the last index of the array to int
				System.out.println("last 3 digits of java are: " + javaNumber); //print the int
				
		String[] mentoringArray =  mentoringSessions_url.split("/");
			int mentoringNumber = Integer.parseInt(mentoringArray[mentoringArray.length-1]);
				System.out.println("last 3 digits of Mentoring Session are: " + mentoringNumber);
				
		String[] SDLC_Array = SDLC_url.split("/");
			int SDLC_Number = Integer.parseInt(SDLC_Array[SDLC_Array.length-1]);
				System.out.println("last 3 digits of SDLC are " + SDLC_Number);
		
		String[] QA_Testing_Array = QA_Testing_url.split("/");
			int QA_Number = Integer.parseInt(QA_Testing_Array[QA_Testing_Array.length-1]);
				System.out.println("last 3 digits of QA are " + QA_Number);
		
		String[] team_Activity_Array = team_Activity_url.split("/");
			int team_Activity_Number = Integer.parseInt(team_Activity_Array[team_Activity_Array.length-1]);
				System.out.println("last 3 digits of team activity are " + team_Activity_Number);
				
		String[] welcome_Kit_Array = welcome_Kit_url.split("/");
			int welcome_Number = Integer.parseInt(welcome_Kit_Array[welcome_Kit_Array.length-1]);
				System.out.println("last 3 digits of team activity are " + welcome_Number);
				
					
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
				
				int courseID = 149;
				
				switch(courseID) {
				case 147:
					System.out.println("Java Programming");
					break;
				case 204:
					System.out.println("Mentoring Sessions");
					break;
				case 149:
					System.out.println("SDLC");
					break;
				case 152:
					System.out.println("QA Testing");
					break;
				case 144:
					System.out.println("Team Activity");
					break;
				case 143:
					System.out.println("Welcome Kit");
					break;
				}
			
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
				
				
				
				for(String temp: tools) {
					switch(temp.toLowerCase()) {
					case "java":
						System.out.println("programming language");
						break;
					case "selenium":
						System.out.println("test automation");
						break;
					case "testng":
						System.out.println("Unit tests");
						break;
					case "junit":
						System.out.println("unit testing");
						break;
					case "cucumber":
						System.out.println("BDD Style Testing");
						break;
					case "git":
						System.out.println("Version control");
						break;
					case "maven":
						System.out.println("Building and execution for project");
						break;
					default:
						System.out.println("Unknown tool");
				}
				}


//		*******************************************************************************************************************
		//Looking at patterns
		//split method must be used on Strings but the value of that string will be put in an Array
		//The rest of the methods below must be used on Arrays
					
				//toString method
					//converts an array to a string and allows you to 
					//print out all the values of an array without using a loop
					
					int[] nums = {43, 12, 4, 1, 3, 5};
					//print the values in the array using the toString method
					
					String str = Arrays.toString(nums);
					System.out.println(str);
					
		System.out.println("**********************************");			
					
//				//sort method
//					//sorts array in ascending order (from small to large)
					//Use the sort method to tort the array nums above and print it out. 
					//Remember, there are 2 ways to print an array, using a loop or using the toString method
					Arrays.sort(nums);
					System.out.println(Arrays.toString(nums));  
					
			
		
					String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic"};
					//Sort the languages in alphabetical order then print out the new sorted String
					//General tip: When sorting, numbers come first, then uppercase, then lowercase
					
					
					System.out.println(Arrays.toString(languages));   //Convert to String
					Arrays.sort(languages);							  //Sort the languages alphabetically
					System.out.println(Arrays.toString(languages));	  //Print out the new sorted String
					
					
					
					int[] nums2 = {345, 665, 3333, 11, 3, 66};
					//find lowest and highest values from nums2 array
					
					Arrays.sort(nums2);  //first sort
					System.out.println("Lowest number is " + nums2[0] );
					System.out.println("Highest number is " + nums2[nums2.length-1]);
					
		System.out.println("**********************************");			
					
//				//binarySearch method
//					//Searches for a value in the array, and returns index
//					//Has precondition...array must be sorted first
					//binary search will return negative number if numbers are not 
					//in order or if number does not appear in array
					
					//Use the binarySearch method to find the index of number 10 in the nums3 array 
					int[] nums3 = {4, 10, 20, 50};   //this is already sorted
					System.out.println(Arrays.binarySearch(nums3, 10));  //must specify the array name then the number.
																		 //will return index of the specified number
					
					
					int[] nums4 = {4, 6, 7, 10, 55};
					//Use the binarySearch method to find the index of number 7 in the nums4 array
					System.out.println(Arrays.binarySearch(nums4, 7));  //2
					
					//Use the binarySearch method to find the index of number 5 in the nums4 array. 
					//What number appears and why?
					System.out.println(Arrays.binarySearch(nums4, 5));  //-2
					
					
					int i = Arrays.binarySearch(nums4, 10);
					System.out.println(i);  //prints 3
					
					
					//if not in ascending order will likely show incorrect index. For example: try to print 10
					int[] nums5 = {40, 6, 17, 10, 55};
					System.out.println(Arrays.binarySearch(nums5, 10));  //prints -1
					
					//Now try to sort and see what happens
					Arrays.sort(nums5);  //sorting
					System.out.println(Arrays.toString(nums5));  //printing to see sorted numbers. Must make into a String first
					System.out.println(Arrays.binarySearch(nums5, 10)); //prints 1
				
		System.out.println("**********************************");	
		
				//Equals method
					//compares 2 arrays and returns true if they are same / equal, returns false if they are different
					//(different value or length)
					
					int [] arr1 = {4, 5, 6, 10, 100};
					int [] arr2 = {4, 5, 6, 10, 100};
					//use the equals method to see if the 2 arrays above are equal to each other
					System.out.println(Arrays.equals(arr1, arr2)); //prints true
					
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
					boolean match = Arrays.equals(strArr1, strArr2);
					System.out.println("match: " + match);
					
					
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
					
					
					//make a copy of d2. Call it d3. Print d3. 
					double [] d3 = Arrays.copyOf(d2, d2.length); //specify which array you want to copy and 
																 //which part you want to copy
																 //if whole thing then use.length
					
					//change the value of d2 at index 0 to 1. Then print out d3 again. Did anything change?
					System.out.println("D3: " + Arrays.toString(d3));
					d2[0] = 1;
					System.out.println("D3: " + Arrays.toString(d3));
					
					//Make a copy of array nums6, then add 2 spaces to the end and print.
					int[] nums6 = {34, 56, 23, 1, 55};
					int[] nums7 = Arrays.copyOf(nums6, nums6.length + 2); //taking the length plus 2 more spaces
					System.out.println(Arrays.toString(nums7));
					
					//Assign values to the last 2 indexes and print
					nums7[5] = 100;
					nums7[6] = 200;
					
					//use copyOfRange to get a copy of nums6 from index 1 to 3 then print;
					int[] nums8 = Arrays.copyOfRange(nums6, 1, 3); 
					System.out.println(Arrays.toString(nums8));
					
					
					int[] brandNew = {34, 23, 54, 23};
					//print the length of this array, then add 5 and print again
					System.out.println("Length before: " + brandNew.length);
					brandNew = Arrays.copyOf(brandNew, brandNew.length + 5);
					System.out.println("Length after: " + brandNew.length);
					
				
//				Webpage:
//				"apple,orange,orange"
//				Database:
//				"apple,apple,orange"
//				//split into 2 arrays then made 2 loops to compare
//				
//				Store into 2 variables
//				String st1 = "apple,orange,orange";
//				String st2 = "apple,apple,orange";
//				String[] stringARR = st1.split(",");
//				String[] stringARR2 = st2.split(",");
//				for(int i = 0; i < str.Arr1.length; i++) {
//					if(!strArr1[i].equals(strArr2[i])) {
//						print mismatch strArr1
//						
//						
//						
//			Arrays.equals(s, a2)

					
			}
		}
