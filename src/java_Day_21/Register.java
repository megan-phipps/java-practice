package java_Day_21;

import java.util.*;

public class Register {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfItems = 0;
		String nameOfItem = "";
		double priceOfItem = 0.0;
		String allItems = "";
		double totalPrice =  0.0;
		
		System.out.println("how many items are you purchasing?");
		numberOfItems = scan.nextInt();
		 
			
		for(int i = 1; i <= numberOfItems; i++) {
			System.out.println("what is item " + i + "?");
			nameOfItem = scan.next();
			allItems += nameOfItem + ", ";
			
			System.out.println("what is the price of item " + i + "?");
			priceOfItem = scan.nextDouble();
			totalPrice += priceOfItem;
			
		}
		
		if(allItems.endsWith(", ")) {
			allItems = allItems.substring(0, allItems.length()-2);	
		}
		
		System.out.println(allItems);
		System.out.println(totalPrice);
		
		
		
		
		
		
		
	}
}
