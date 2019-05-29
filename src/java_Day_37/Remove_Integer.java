package java_Day_37;

import java.util.ArrayList;

public class Remove_Integer {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size() == 0);
		
		nums.add(4);
		nums.add(43);
		nums.add(345);
		nums.add(8);
		nums.add(1);
		nums.add(980);
		nums.add(4975);
		
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);
		
		nums.remove(n1);
		nums.remove(new Integer(4));
		System.out.println(nums.toString());
		
		nums.remove(5);
		System.out.println(nums.toString());
		
		
	}
}
