package java_Day_23;
import java.util.*;
public class Warm_Up {

	public static void main(String[] args) {
		//write a program that will verify if number is prime
		//prime number is a whole number > 1 && is divisible by only itself and 1
		//ask user to provide number
		//If prime number, display "number - is a prime number"
		//if not, display, "number - is not a prime number
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
				
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				count++;
			}
			
		}
		
			
			
			
			
		
		
	}
}
