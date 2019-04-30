package java_Day_23;

import java.util.*;

public class BruteForce {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		String expectedUsername = "admin";
		String expectedPassword = "admin123";
		int attempts = 5;
		String username = "";
		String password = "";
		
		do {
			if(attempts > 5) {
				System.out.println("You have exceeded the number of attempts. Your account is now locked.");
				return;
			}
			
			System.out.println("enter username");
			username = scan.next();
			if(!username.equals(expectedUsername)) {
				
			}
				
			System.out.println("enter password");
			password = scan.next();
		}while(!username.equals(expectedUsername) || (!password.equals(expectedPassword)));
		

		System.out.println("access granted");
}
}