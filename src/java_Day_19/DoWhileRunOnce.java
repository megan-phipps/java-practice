package java_Day_19;

public class DoWhileRunOnce {

	public static void main(String[] args) {

		// do while loop runs once then tests condition after.

		int count = 10;
		do {
			System.out.println("count: " + count);
			count++;
		} while (count <= 5);

	}
}
