package java_Day_23;

public class PrintNumbersWithLoop {
	public static void main(String[] args) {
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//			
//		for(int j = 1; j <=2; j++) {
//			for(i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		}
//		}
//	}

		// print 5 rows of letters from a-z, in between line print stars

		for (int a = 1; a <= 5; a++) {
			for (char i = 'a'; i <= 'z'; i++) {
				System.out.print(i);
			}
			System.out.println();
			System.out.println("**************************");
		}
	}
}
