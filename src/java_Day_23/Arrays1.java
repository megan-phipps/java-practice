package java_Day_23;

public class Arrays1 {
	public static void main(String[] args) {
		int [] numbers = new int[3];
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		//assign to the first element in the array value of num1
		
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//create an array of strings with size of 5
		
		String[] names = new String[5];
		String [] names2 = {"Shaun", "Roman", "Vlad", "Burak", "MARIA"};
		
		System.out.println(names2[4]);
		System.out.println("number of items: " + names2.length);
		
		String[]fruits = new String[] {"apple", "orange"};
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		
		
	}
}
