package java_Day_35_Easter_Review_Session;

public class Cheaper_Method {
	public static void main(String[] args) {
		
	}
	//declare empty string
	//find unique numbers and add to that string
	//split that string by space
	//declare new int[] and assign each number from split
	//return the int[] array
	public static int[] getUniqueArrayCheapV2(int[] nums) {
		//declare empty string
		String unique = ""; //0 6 7 1 
		for(int i = 0; i < nums.length; i++) {//outer loop 
			
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {//inner/nested loop
				if(nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {//is it still 0. then it is unique
				//find unique numbers and add to unique string
				unique += temp+" ";
			}	
		}
		//split that string by space
		String[] strArr = unique.trim().split(" ");
		//declare new int[] and assign each number from split
		int[] uniqueArr = new int[strArr.length];
		for(int k = 0; k < strArr.length; k++) {
			uniqueArr[k] = Integer.parseInt(strArr[k]);
		}
		//return the int[] array
		return uniqueArr;
	
}
}
