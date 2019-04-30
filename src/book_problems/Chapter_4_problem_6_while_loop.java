package book_problems;

import java.util.*;

public class Chapter_4_problem_6_while_loop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int population = 0;
		
		System.out.println("Enter the population of the city: ");
			population = scan.nextInt();
			
		while(population > 0) {
			System.out.println("the population of the city is: " + population);
		}
		if(population <= 0) {
			System.out.println("please enter a non-negative number");
		}
			
			
			
			
			
			
	}
}
