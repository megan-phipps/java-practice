package java_Day_25;

public class Warm_up {
	public static void main(String[] args) {
		//create an array called population that can accept count for 5 cities.
		//Assign some value to each city
		
		int [] population = new int [5];
		population [0] = 5000;
		population [1] = 10000;
		population [2] = 7000;
		population [3] = 8907;
		population [4] = 4455;
		
		//OR 
		
		int [] population2 = {5000, 10000, 7000, 8907, 4455};
		
		//String array called cities and assign cities to them. Should be 5
		
		String [] cities = {"Miami", "London", "Tokyo", "Rome", "New York"};
		for(String temp: cities) {
			System.out.println(temp);
			
		//another way using for loop
		for(int i = 0; i <= temp.length()-1; i++) {
			System.out.println(cities[i]);
			
		}
		}
		System.out.println("Population of " + cities[0] + " is " + population[0]);
		
		
		
		
		
	}
}
