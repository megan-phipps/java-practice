package java_Day_34;

import java.util.Arrays;

public class Var_Args {
	public static void main(String[] args) {
		//VAR-ARGS(...)  varying arguments
		//When we write a method, we can put var-args as a parameter. 
		//When using var-args, it can also accept an array in the parameters or a variable too
		
		
		
		printWords("red", "blue");  //2 values
		printWords("gray");  //1 value
		printWords(); //empty, so array is empty
	
		String[]myPets = {"cat", "dog", "fish"};
		printWords(myPets);
		
		System.out.println((sum(10, 20, 30)));
		
		//using the sum method to compare our budget to our spending \
		int budget = 200;
		if(sum(10, 45, 110, 30)<= budget){
			System.out.println("Within budget");
		}else {
			System.out.println("broke");
		}
		
		//print cook method
		cook("spagetti", "noodles", "sauce");
		
		//shoppingList(1000, efgieuub,jhsfvuev, jefvjev, ejfjhv);
	}
	
	//making a method accepting multiple Strings
	public static void printWords(String... words) {
		//handle it like an array
		for(String w : words) {
		System.out.println(w);
		}	
	}
	
	//make a method sum to add all the numbers user inputs
	public static int sum(int...nums) {
		int sum = 0;
		for(int n: nums) {
			sum += n;
		}
		
		return sum;
	}
	
	//using var-args with something else, var-args must always be on the end
	public static void cook(String name, String...ings) {
		System.out.print("Food: " + name + " ");
		System.out.println(Arrays.toString(ings));
	}
	
	//public static void shoppingList(int totalPrice, String...)
	
}
