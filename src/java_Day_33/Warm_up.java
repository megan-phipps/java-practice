package java_Day_33;

public class Warm_up {
	public static void main(String[] args) {
		
		addVoid(3, 20);
		System.out.println(add(3, 7));
		System.out.println(multiply(4.6, 8.4));
		System.out.println(subtract(345, 755));
		System.out.println(divide(534,54));
	}
	
	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static double multiply(double num1, double num2) {
		double product = num1 * num2;
		return product;
	}
	public static double subtract(double a, double b) {
		double minus = a - b;
		return minus;
	}
	public static float divide(float num1, float num2) {
		if(num2 == 0) {
			System.out.println("cannot divide by 0");
			return 0;
		}else {
		float division = num1 / num2;
		return division;
		}
	}
}
