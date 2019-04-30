package java_Day_30;
import java.util.*;
public class Warm_up {
	public static void main(String[] args) {
		//make a method called print5stars
		//prints *****
		//print5Stars();
		
		//call print5Stars 100 times
		for(int i = 0; i <= 100; i++) {
		//	print5Stars();
		}
		
		//create a method name introduce
		//create a Scanner
		//ask for name and assign to String name
		//then print "Nice to meet you" + name
		
		
		introduce();
	}
		
		
//	}
//		public static void print5Stars() {
//			System.out.println("* * * * *");
//	}

		
		public static void introduce() {
			String name;
			Scanner scan = new Scanner(System.in);
			System.out.println("What is your name?");
			name = scan.next();
			System.out.println("Nice to meet you " + name);
		}
	
		
		
	
		
		
		
		
		
		
		
		
}
