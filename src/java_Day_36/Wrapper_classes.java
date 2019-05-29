package java_Day_36;

public class Wrapper_classes {
	public static void main(String[] args) {
		
		//How to create a wrapper class object?
			//new key word
			//valueOf method
		//Integer num1 = new Integer(345);
		//Integer num2 = new Integer("345");
		//Integer num3 = Integer.valueOf(5666);
		//Integer num4 = Integer.valueOf("8");
			//Variable with type wrapper class and assign value of primitive
		//Integer i = 1234 //same thing as saying new Integer(1234);
		
		int n1 = 10;
		Integer n2 = new Integer(20);
		System.out.println(n2);
		
		double d1 = 44.5;
		Double d2 = new Double(123.1);
		Double d3 = new Double("5.2");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1 + d2 + d3);
		
		char ch1 = 'a';
		Character ch2 = new Character('b');
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		byte b1 = 100;
		Byte b2 = new Byte((byte) 10);
		Byte b3 = new Byte("-55");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1 + b2 + b3);
		
		Integer num1 = Integer.valueOf(1234);
		Integer num2 = Integer.valueOf("567");
		
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf(false);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(bool1);
		System.out.println(bool2);
		
		
	}
}
