package java_Day_42;
import java.util.*;
public class Starbucks {
	public static void main(String[] args) {
		
	//declare coffeeArray that can store 2 coffee objects
	Coffee[] coffeeArray = new Coffee[2];
	//create coffee object and assign data
	coffeeArray[0] = new Coffee();
	//access coffee object in index 0 and set data
	coffeeArray[0].setCoffeeInfo("Expresso", "tall", 2.55, 7); //to assign to Array List
	//Access coffee object and assign index 0
	coffeeArray[0].getCoffeeInfo(); //to print Arraylist
	
	//create a single object first
	Coffee latte = new Coffee();
	//assign data
	latte.setCoffeeInfo("Cafe Late", "Grande", 4.33, 93);
	//assign the latte object to index 1 of the array
	coffeeArray[1] = latte;
	//print data from object in index 1
	coffeeArray[1].getCoffeeInfo();
	
	//NEW CREATES AN OBJECT OF A CLASS IN AN ARRAY
	
	
	
	
	
	
	
	
	}
}
