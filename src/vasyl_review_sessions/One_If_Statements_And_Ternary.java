package vasyl_review_sessions;

import java.util.*;

public class One_If_Statements_And_Ternary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("How old are you?");
//		int age = scan.nextInt();
//		if(age < 0) {
//			System.out.println("Invalid input");
//		}else if(age < 21) {
//			System.out.println("Underage!");
//		}else {
//			System.out.println("You are fine!");
//		}

//	int time = 20;
//	
//	System.out.println(time < 18 ? "Good Afternoon" : "Good Evening");

//	System.out.println("Enter Score:");
//	int score = scan.nextInt();
//	System.out.println(score >= 64 ? "Passed" : "Failed");

		// write program that will print season name based off of int value provided by
		// the scanner.
		// 1, 2, and 12 - winter
		// 3 - 5 - spring
		// 6 - 8 - Summer
		// 9 - 11 - fall
		// else - invalid
//
		int month = 0;
		String message = "";
//		System.out.println("What season is it?");
//		month = scan.nextInt();
//		if (month >= 1 && month <= 2 || month == 12) {
//			System.out.println("winter");
//		} else if (month >= 3 && month <= 5) {
//			System.out.println("spring");
//		} else if (month >= 6 && month <= 8) {
//			System.out.println("summer");
//		} else if (month >= 9 && month <= 11) {
//			System.out.println("fall");
//		} else {
//			System.out.println("invalid input");
//		}

		System.out.println("what month is it?");
		month = scan.nextInt();
		
		switch (month) {
		case 1: case 2: case 3: case 12:
			message = "Winter";
			break;
		case 4: case 5: case 6:
			message = "Spring";
			break;
		case 7: case 8:
			message = "Summer";
			break;
		case 9: case 10: case 11:
			message = "Fall";
			break;
	}
		System.out.println(message);
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
