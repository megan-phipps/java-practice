package java_Day_21;

import java.util.*;

public class Warm_up_task {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// ask user to enter 2 ints:
		// if sum of those ints is not more than 100, then keep asking for 2 numbers
		//once sum of those 2 numbers > 100 print "good numbers. Program ends
		
		int num1 = 0;
		int num2 = 0;
		
		do {
		System.out.println("enter 2 numbers with one or more spaces in between");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		}while(num1 + num2 < 100);
		
	
		System.out.println(num1 + num2);
		
		
	//****** IMPORTANT given a String word, print out unique characters from the word.
		String word = "wooden spoon";
		//print woden sp
				
		String word2 = "java";
		//print jav
		
		String word3 = "aabbccddef";
		//print abcdef
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
	}

