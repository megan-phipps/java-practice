package java_Day_24;

import java.util.Arrays;

public class Car_Shop {
	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla;
		// 1. create an array of Strings and store cars inside that array

		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		String[] cars2 = new String[8];

		// 2. Print car names that start with M
		
		for(String c : cars) {
			if(!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}
		System.out.println("**************");
		
		// 3. print all cars that contain r somewhere in name. Make search case, case insenstive
		
		for(String c : cars) {
			if(c.toLowerCase().contains("r")) {
				System.out.println(c);
			}
		}
		System.out.println("**************");
		
		// 4. print all cars that end in a. 
		
		for(String c : cars) {
			if(c.endsWith("a")) {
				System.out.println(c);
			}
		}
		System.out.println("**************");
		
		// 2 ways of doing the same thing thing
		
		// 5. Print all cars that have at least 6 letters
		for(String c : cars) {
			if(c.length() >= 6) {
				System.out.println(c);
			}
		}
		System.out.println("**************");
		
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].length() >=6) {
				System.out.println(cars[i]);
			}
		}
		System.out.println("**************");
	
		// 6. Swap first and last value in the array
		//before: "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"
		//after: "Tesla", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "BMW"
		
		String temp = cars[0];
		cars[0] = cars[cars.length-1];
		cars[cars.length-1] = temp;
		System.out.println(Arrays.toString(cars));
		
		System.out.println("**************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
