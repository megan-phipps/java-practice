package my_mentoring;
import java.util.*;
public class Salihs_Mentoring {
	public static void main(String[] args) {
		int previousNumber = 0;
		int nextNumber = 0;
		int maxNumber = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers you want in fibonacci?");
		maxNumber = scan.nextInt();
		
		System.out.println("First " + maxNumber + "Fibonacci Numbers");
		
		for(int i = 1; i <= maxNumber; i++) {
			System.out.println(previousNumber + " ");
			
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
		
		
	}
}
