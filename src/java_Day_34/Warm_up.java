package java_Day_34;

import java.util.Arrays;

public class Warm_up {
	public static void main(String[] args) {
		
	//Start OCA certification book by Jeanne. Only 6 chapters. First 3 chapters will go fast
		//make sure to take OCA Java SE 8 edition, not Java SE 11
	//Do practice questions by Enthuware. This is much harder than the real exam
		//OCA, SCM, AWS certifications
		
		//printing out countArray
		int[] array = {5, 6, 8, 6, 2, 5};
		System.out.println(countArray(array , 6));
		
		//printing getArray
		System.out.println(Arrays.toString(getArray()));
		
		
	}	
		
		//find number of occurances of value in array
		public static int countArray(int [] array, int value) {
			//look for value in array and count the occurances
			
			int count = 0;
			for(int temp: array) {
				if(temp == value) {
					count++;
				}
				
			}
		
			return count;
	}
		//creating an array and returning that array
		public static int[] getArray(){
			int [] retArray = new int[] {3, 998, 5, 57, 3};
			return retArray;
		}
}
