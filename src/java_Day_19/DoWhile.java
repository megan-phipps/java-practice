package java_Day_19;

public class DoWhile {
	public static void main(String[] args) {

		// print 1 to 10 using do while loop;

		int i = 1;

		do {
			System.out.println(i++);
		} while (i <= 10);

		// write a do while loop to calc sum of numbers between 1 and 5

		int sum = 0;
		int j = 1;

		do {
			sum += j;
			j++;
		} while (j <= 5); // check the condition at the bottom

		System.out.println("sum from 1 to 5 is " + sum);

	}
}
