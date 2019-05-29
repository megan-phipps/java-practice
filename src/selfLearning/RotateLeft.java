package selfLearning;
import java.util.*;
public class RotateLeft {
	public static void main(String[] args) {
		
		rotateLeft3(new int[]{1, 2, 3});
	}	
		public static int[] rotateLeft3(int[] nums) {
			  int [] extraValue = Arrays.copyOf(nums, nums.length+1); //make copy with extra value
			  	extraValue[extraValue.length-1] = extraValue[0];    //assigning first value as last value
			  int [] rotatedArray = Arrays.copyOfRange(extraValue, 1, extraValue.length);
			  return rotatedArray;
			}
	
}
