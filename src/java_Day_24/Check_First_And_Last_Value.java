package java_Day_24;

public class Check_First_And_Last_Value {
	public static void main(String[] args) {
		//print true if first and last number in array are the same
	
		int[] numbers = {2, 41, 213, 21, 42, 2};
		//.length is not a method, it's an instance variable (property)
		boolean equals = numbers[0] == numbers[numbers.length-1];
		System.out.println(equals);
		
	}
}
