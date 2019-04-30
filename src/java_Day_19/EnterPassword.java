package java_Day_19;

import java.util.*;

public class EnterPassword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = "abc123";
		String input;

		do {
			System.out.println("Enter password");
			input = scan.next();
		} while (!input.contentEquals(password));
		//if input is not same a password, keep asking to enter password
	
	System.out.println("correct password");
	}
}
