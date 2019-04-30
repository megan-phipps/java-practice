package java_Day_20;

import java.util.*;

public class Multiplication_Table {

	public static void main(String[] args) {

	int x = 1;
	Scanner scan = new Scanner(System.in);
	int num = 0;
	System.out.println("Enter number");
		num = scan.nextInt();
		
	
	if(num < 1 || num > 10) {
		System.out.println("Error");
		return;
	}
		
		
	for(x = 1; x <= 10; x++) {
		System.out.println(num + " x " + x + " = " + (num * x));
		}
	}

	
	
	
	
	
}
