package java_Day_23;

import java.util.*;

public class CalculateSum {
	public static void main(String[] args) {
		//user will provide 6 numbers
		//add these numbers together
		//if any numbers are negative then do not add them to sum
		
		Scanner scan = new Scanner(System.in);
//		int sum = 0;
//		int num = 0;	
//		
//		for(int i = 1; i <=6; i++) {
//			System.out.println("print a number");
//			num = scan.nextInt();	
//			if(num <= 0) {
//				continue;
//			}
//			sum+= num;
//		}
//		System.out.println("sum of numbers is: " + sum);
//		
		
		//have user enter 6 words. If user enters java skip that word
		String input = "";
		String concat = "";
		
		for(int i = 1; i <= 6; i++) {
			System.out.println("enter a word");
				input = scan.next();
			if(input.equalsIgnoreCase("java")) {
				continue;
			}
			concat += input + ", ";
		}
	
		concat = concat.substring(0, concat.length()-2);
		System.out.println(concat);
		
		
}
}
