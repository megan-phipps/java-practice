//package java_Day_35_Easter_Review_Session;
//
//public class Warm_Up {
//	public static void main(String[] args) {
//		
//	
//	//print unique numbers from the array
//	
//	//1st way - in main method
//	//2nd way - void method that accepts an array
//	//3rd way - method that accepts int[] and returns int[] with unique values
//	
//	//1st
//	//declare array nums and assign values
//	int[] nums = {34,453,2,456,654,32,453,6,32,6,346,4,2};
//		for(int i = 0; i <= nums.length-1; i++) {
//			int count = 0;
//			for(int q = 0; q <= nums.length-1; q++) {
//				if(nums[i] == nums[q]) {
//					count++;
//				}
//					
//				}
//			if(count ==1) {
//				System.out.println(nums[i]);
//			}
//		}
//		
//	//printing out the 2nd way
//	int[] Arr = {324,4,74,643,33,3476,4,4,2,8,456};
//	countUnique(Arr);
//}
//	
//	
//	//2nd way
//	public static void countUnique (int[]countArray){
//		for(int i = 0; i <= countArray.length-1; i++) {
//			int count = 0;
//			for(int q = 0; q <= countArray.length-1; q++) {
//				if(countArray[i] == countArray[q]) {
//					count++;
//				}
//			}
//			if(count == 1) {
//				System.out.print(countArray[i] + ", ");
//			}
//		}
//	}
//	
//	//3rd way - method that accepts int[] and returns int[] with unique values
//	
//	//public static int[] uniqueArray(int[] numbers) { //accepts and returns int[]
//	for(int i = 0; i <= numbers.length-1; i++) { //once user types array, do what?//loop though that array and return an array with unique values
//			int count = 0;
//		for(int q = 0; q <= numbers.length-1; q++) {
//			if(numbers[i] == numbers[q]) {
//				count++;
//			}
//		}
//		if(count == 1) {
//			int[] newArray = new int[i];
//			for(int z = 0; z <= newArray.length-1; z++) {
//				
//		//		newArray[] = numbers[i]; 
//		}
//		}
//			
//			
////			
//		
//	}
//	
//	
//	
//}
//}