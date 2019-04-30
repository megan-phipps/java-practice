package java_Day_31;
import java.util.*;
public class Calculator_4 {
/*
 * add, subtract, multiply, divide
 */

	public static void main(String[] args) {
		add(5, 10);
		subtract(51, 30);
		multiply(3, 2);
		divide(12, 6);
		remainder(13, 2);
		
		//using Scanner, pass 2 numbers and operator
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: +, -, *, /, % " );
		String operator = scan.next();
		
		switch(operator) {
		case "+": 
			add(n1, n2);
			break;
		case "-":
			subtract(n1, n2);
			break;
		case "*":
			multiply(n1,n2);
			break;
		case "/":
			divide(n1, n2);
			break;
		case "%":
			remainder(n1, n2);
			break;
		default:
			System.out.println("Not a valid operator");
		}
		
		
		
		
		
		
	}
	

public static void add(double num1, double num2) {
	double result = num1 + num2;
	System.out.println(result);
}
public static void subtract(double num1, double num2) {
	double result = num1 - num2;
	System.out.println(result);
}
public static void multiply(double num1, double num2) {
	double result = num1 * num2;
	System.out.println(result);
}
public static void divide(double num1, double num2) {
	if(num2 == 0) {
		System.out.println("Cannot divide by 0");
	}else {
	double result = num1 / num2;
	System.out.println(result);
}
}
public static void remainder(double num1, double num2) {
	double result = num1 % num2;
	System.out.println(result);
}



}