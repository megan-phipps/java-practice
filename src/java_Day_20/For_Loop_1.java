package java_Day_20;

import java.util.*;

public class For_Loop_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//using for loop, print "Love java" 10 times
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Love java");
		}
		
		System.out.println();
		// print numbers from 5 to 15 using for loop
		
		for(int i = 5; i <= 15; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		//for loop print 20 to 10. Decrease by 2 at a time
		
		for(int num = 20; num >= 10; num -= 2) {
			System.out.print(num + ", ");
			Thread.sleep(500);
		}
		
	}
}
