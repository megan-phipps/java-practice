package java_Day_28;

import java.util.Arrays;

public class Soccer_Teams {
	public static void main(String[] args) {
		String[][] teams = new String[2][6]; //how many arrays you need[2], how many items in the String[6]
		//declare MultiD Array with 2 rows and 6 
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";
		
		//print first player of first team
		System.out.println("First player of first team: ");
		System.out.println(teams[0][0]);
		
		//print habib
		System.out.println(teams[0][3]);
		
		//print dmitriy
		System.out.println(teams[1][5]);
		
		//print how many rows / teams / arrays
		System.out.println("How many teams: " + teams.length); //prints 2
		
		//print how many players in team 1
		System.out.println("amount of players in team 1: " + teams[0].length); //prints 6
		
		////print how many players in team 2
		System.out.println("amount of players in team 1: " + teams[1].length);
		
		//print both arrays
		System.out.println(Arrays.deepToString(teams));   
		
		
		//declare a new multi d array 
		int[][] nums = new int[3][4];
		
		nums[0][0] = 100;
		nums[0][1] = 34534;
		nums[0][2] = 343242;
		nums[0][3] = 77242;
		
		nums[1][0] = 256;
		nums[1][1] = 64546;
		nums[1][2] = 257776;
		nums[1][3] = 999776;
		
		nums[2][0] = 1256;
		nums[2][1] = 164546;
		nums[2][2] = 23846864;
		nums[2][3] = 34782;
		
		//Given the data above, print all arrays
		System.out.println(Arrays.deepToString(nums)); 		 //use deepToString when printing all arrays
		
		//Given the data above, print first array 
		System.out.println(Arrays.toString(nums[0]));        //use when printing one specific array
		
		
		
		int[][] scores = { {3, 5, 10}, {6, 4, 2, 10} };
		
		//Given the data above, print the number of arrays
		System.out.println("Days played / Number of arrays: " + scores.length);
		
		//Given the data above, print the number of values in first array
		System.out.println("Number of values in 1: " + scores[0].length);
		
		//Given the data above, print the number of values in second array
		System.out.println("Number of values in 2: " + scores[1].length);
		
		
		//Another way of declaring array. Used when you don't know how many items you need. Now you know
		//you want 4 arrays but not sure how many values in each array
		int[][] values = new int [4][];
		values[0] = new int[] {34, 23, 5};  //values[0] means all values in this array
		values[1] = new int[] {34, 54, 755, 756, 57, 32, 587, 97, 34, 234, 53, 76};
		
		
		values[2] = new int[2];
		values[2][0] = 55;
		values[2][1] = 88;
		
		values[3] = new int[] {5, 12, 45, 77, 34};
		
		System.out.println(Arrays.deepToString(values));
		
		
		
		
		
		
	}
}
