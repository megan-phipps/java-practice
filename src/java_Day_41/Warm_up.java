package java_Day_41;

import java.util.ArrayList;
import java.util.List;

public class Warm_up {
	public static void main(String[] args) {
		List <Integer> myList = new ArrayList<>();
		myList.add(4);
		myList.add(3);
		myList.add(9);
		System.out.println("myList doubled: " + doubleTheList(myList));
		
		List <Integer> myList2 = new ArrayList<>();
		myList.add(56);
		myList.add(34);
		myList.add(5);
		List<Integer> newList = doubleTheList(myList2);
		
	}
	
	public static List<Integer> doubleTheList(List<Integer> nums){
		for(int i = 0; i <= nums.size()-1; i++) {
			nums.set(i, nums.get(i)*2);
		}
		return nums;
	}
}
