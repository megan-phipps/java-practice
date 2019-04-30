package java_Day_34;

public class Method_Overloading {
	public static void main(String[] args) {
		add(4, 8);
		add(4.6, 8.3);
		add("pine", "apple");
	}
	
	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("result: " + result);
	}
	
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("result: " + result);
	}
	
	public static void add(String str1, String str2) {
		String result = str1 + str2;
		System.out.println("result: " + result);
	}
}
