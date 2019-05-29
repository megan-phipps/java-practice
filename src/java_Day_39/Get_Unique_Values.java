package java_Day_39;
import java.util.*;
public class Get_Unique_Values {
	public static void main(String[] args) {
		//get unique values from arrayList
		
		List<Integer> nums = new ArrayList<>();
		nums.add(10); nums.add(10); nums.add(7); nums.add(8); nums.add(8); nums.add(3); nums.add(4); nums.add(8);
		
		//Print all values only once
		List<Integer> unique1 = new ArrayList<>();
		for(int num: nums) {
			//assign num to unique1 if num is not already in unique1
			if(!unique1.contains(num)) {
				unique1.add(num);
			}
		}
		System.out.println(unique1);
		
		//find unique (appearing once) values
		List<Integer> unique2 = new ArrayList<>();
		
		for (int i = 0; i <= nums.size()-1; i++) {
				int count = 0;
			
			for (int k = 0; k <= nums.size()-1; k++) {
				if(nums.get(k) == nums.get(i) && i !=k) {
					count++;
					break;
				}
			}
		
		if(count == 0) {
			unique2.add(nums.get(i));
		}
		}
		
		System.out.println(unique2);
	
		
		
		
}
}
