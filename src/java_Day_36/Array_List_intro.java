package java_Day_36;
import java.util.ArrayList;
public class Array_List_intro {
	public static void main(String[] args) {
		//Introduction to ArrayList
				//ArrayList is one of the most popular data structures in Java
				//It is based on regular Array
				//Main difference is regular arrays are fixed size in Java
				//ArrayList is resizable and size can be increased or deleted anytime
				//It's like a dynamic array
				
				//To use ArrayList in our code, we need to import java.util.Arraylist
		
		//create an ArrayList
		String [] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();	
		
		//assign values into ArrayList
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");
		
		nums.add(100);
		nums.add(99);
		nums.add(656);
		
		//how to read from ArrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println(names.get(5));
		
		//Basic ArrayList Actions:
		//1) create / declare 
		//ArrayList<Integer> nums = new ArrayList<>();
		
		//2) assign / add values to arrayList
		//==> add method
		//nums.add(343)
		//nums.add(52);
		
		//3) read from arrayList
		//==> get(index) method and we need to pass index number
		System.out.println(nums.get(0));  //==> 343
		System.out.println(nums.get(1)); //==> 
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
		
	}
}
