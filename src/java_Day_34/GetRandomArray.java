package java_Day_34;
import java.util.*;
public class GetRandomArray {
	public static void main(String[] args) {
		
	
	System.out.println(Arrays.toString(getRandomArray(6)));	
	}
	
	
	
	
	public static int[] getRandomArray(int size){
		Random rand = new Random();  //create random class object
		int[] nums = new int[size];  //declare array with size number of elements
		for(int i = 0; i <= size-1; i++) {
			nums[i] = rand.nextInt(101);  //get random number and assign to array
		}
		return nums;
	}
	
}
