package java_Day_39;
import java.util.*;
public class CustomListMethods {
	public static void main(String[] args) {
		
		//print out printlList method
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10); nums.add(10);nums.add(7); nums.add(8); nums.add(8); nums.add(3); nums.add(4); nums.add(8);
		printList(nums);
		
		//print out sumList method
		List<Double> nums2 = new ArrayList<>();
		nums2.add(23.75); nums2.add(34.9); nums2.add(98.3); nums2.add(12.1);
		System.out.println("Sum of nums2 is " + sumList(nums2));
		
		//print getList Method
		System.out.println("numbers: " + getList(7));
		
		//print getRandomList method
		System.out.println("Random numbers: " + getRandomList(5));
		
		//print convertToIntList method
		List<String> str = new ArrayList<>();
		str.add("432"); str.add("234"); str.add("23"); str.add("21");
		System.out.println(convertToIntList(str));
		
		
		
		
		
	}
	//make method ArrayList
	public static void printList(ArrayList<Integer> nums) {
		for(Integer n: nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	//make method sumList
	public static int sumList(List<Double> nums2) {
		int sum = 0;
		for(Double number: nums2) {
			sum+= number;
		}
		return sum;
	}
	//make method getList
	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i = 1; i <= size; i++) {
		nums.add(i);
		}
		return nums;
	}
	//make method getRandomList
	public static List<Integer> getRandomList(int size){
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= size; i++) {
			list.add(random.nextInt(101));
		}
		return list;
	}
	
	//make method convertToIntList - takes String, converts to int, returns as Integer List
	public static List<Integer> convertToIntList(List<String> strL){
		List<Integer> intList = new ArrayList<>();
		for(String temp: strL) {
			intList.add(Integer.parseInt(temp));
			
		}
		return intList;
	}
	
}
