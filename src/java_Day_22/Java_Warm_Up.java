package java_Day_22;

import java.util.*;

public class Java_Warm_Up {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int months = 0;
		do {
			System.out.println("Enter month");
			months = scan.nextInt();
		} while (months > 0 && months <= 12);

		System.out.println("Invalid month: " + months);
		
		
		
	}
}
