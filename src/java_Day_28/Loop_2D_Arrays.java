package java_Day_28;

import java.util.Arrays;

public class Loop_2D_Arrays {
	public static void main(String[] args) {
		String[][] pizzas = {{"pineapple", "pepperoni"}, //0
							{"anchovies", "mushrooms", "olives"}, //1
							{"4 cheese"},  //2
							{"chicken", "tomatoes", "jalapenoes", "onions"}, //3
							{"green peppers", "zuccini", "brocolli", "spinach", "shrimp"}}; //4
		
		System.out.println(Arrays.toString(pizzas[0]));
		
		System.out.println("******************************");
		for(String[] temp: pizzas) {
			System.out.print(temp.length + "-");
			System.out.println(Arrays.toString(temp));
		}
		
		System.out.println("******************************");
		//for loop
		for(int i = 0; i <= pizzas.length-1; i++) {
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		System.out.println("******************************");
		
		//for each loop for each pizza
		
		for(String Pizza_toppings_1: pizzas[0]) {
			System.out.print(Pizza_toppings_1 + " ");
		}
		
		System.out.println("******************************");
		
		
		int[][] students = {{4,5,6}, {12,5,7}, {23, 55, 12, 55, 3}};
		
		//use nested for each loop to print
		
		for(int[] group: students) {
			for(int studentID: group) {
				System.out.print(studentID + ", ");
			}
			System.out.println();
		}
		
		int[][] nums = { {10, 20}, 
						 {20, 30, 40, 50}, 
						 {100, 200, 400}, 
						 {555, 333, 111, 444, 666, 78} };
		
		for(int i = 0; i <= nums.length-1; i++) {
			for(int q = 0; q <= nums[i].length-1; q++) {
				System.out.println(nums[i][q] + " ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
