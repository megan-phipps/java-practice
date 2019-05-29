package java_Day_38;
import java.util.*;
public class Collection_class_and_Sort {
	public static void main(String[] args) {
		//There is a collections class that contains a method called sort
		//It accepts arrayList objects and sorts values in ascending order
		
		//use the sort method from the collections class to sort the arrayList below
		List<Integer> numsList = new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		System.out.println(numsList); // prints [44, 1, 4, 1000, 3]
		
		Collections.sort(numsList);
		System.out.println(numsList); //prints[1, 3, 4, 44, 1000], a sorted list
		
		//Use the sort method from the collections class to sort the arrayList below
		List<String> strList = new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhabbat");
		strList.add("Maria");
		strList.add("Dina");
		strList.add("Bojan");
		strList.add("Anastasia");
		strList.add("Yaroslav");
		
		System.out.println(strList); //prints out names
		Collections.sort(strList); //Sort the arrayList
		System.out.println(strList); //print out new array list
		
		//MIN, MAX
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);
		
		System.out.println("maxNum: " + maxNum); //prints 1000
		System.out.println("minNum: " + minNum); //prints 1
		
		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);
		
		System.out.println("maxName: " + maxName); //prints maxName: Yaroslav
		System.out.println("minName: " + minName); //prints minName: Anastasia
		
		//Collections.shuffle shuffles the things in the arrayList
		Collections.shuffle(strList);
		System.out.println(strList);
		
		
	}
	
}
