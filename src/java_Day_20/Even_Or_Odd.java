package java_Day_20;

public class Even_Or_Odd {

	public static void main(String[] args) {

		// using for loop 1-100
		// 1. print all even numbers in same line

		// 2. print all odd numbers in same line

		// 3. sumOfOdds, sumOfEvens - calc them
		// and print out after the loop

		int sumOfEvens = 0;
		int sumOfOdds = 0;
		
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i < 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int num = 1; num <= 100; num++) {
			if(num % 2 == 0) {
				sumOfEvens += num;
			}else {
				sumOfOdds += num;
			}
			
		}
		System.out.println(sumOfEvens);
		
		System.out.println(sumOfOdds);
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

