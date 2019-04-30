package java_Day_27;

import java.util.*;

public class Warm_up {
	public static void main(String[] args) {
		
		//declare 2 int arrays time1 and time2
		//Both of them have 2 items/values that represent hour and minute
		//hours 0-23
		//minutes 0-59
		//time1 = {11, 10} means 11 hours, 10 mins
		//time2 = {15, 25} 
		
		
		int[] time1 = {15, 0};
		int[] time2 = {15, 0};
		
		// Write a condition to test if time1 and time2 have been assigned valid hours and minutes. If not write invalid time
		
		if(time1[0] < 0 || time1[0] > 23 || time1[1] < 0 || time1[1] > 59) {
			System.out.println("Invalid time");
			return;
		}else if(time2[0] < 0 || time2[0] > 23 || time2[1] < 0 || time2[1] > 59) {
			System.out.println("Invalid time");
			return;
		}
	
		// compare arrays to tell which one is earlier without using a loop.

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
		//Print only the last numbers of every String
		//147 --> Java Programming
		//204 --> Mentoring Sessions
		//149 --> SDLC
		//152 --> QA Testing
		//144 --> Team Activity
		//143 --> Welcome Kit
				
		//Split by "/" and get the last value from the array
		//convert it to integer. Integer.parseInt(...) --> int value
		//use switch statement to find course name
		
		
		String javaProgramming = "https://learn.cybertekschool.com/courses/147";  
		String [] javaArray = (javaProgramming.split("/"));  //convert String to Array to use Split method
		int number = Integer.parseInt(javaArray[4]);
		//switch()
		
		
		String SDLC_url = "https://learn.cybertekschool.com/courses/149";
		String [] SDLC_Arr = SDLC_url.split("/");            //convert to array to use split method
		System.out.println("Length: " + SDLC_Arr.length);	 //print length of indexes to find the last index
		System.out.println(SDLC_Arr[SDLC_Arr.length-1]);     //
		int courseID = Integer.parseInt(SDLC_Arr[4]);		 //convert to int and print the last index
		
		
		
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
		
		
		
		
		
		
	}
}

