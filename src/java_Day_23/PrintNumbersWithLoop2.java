package java_Day_23;

public class PrintNumbersWithLoop2 {
	public static void main(String[] args) {

		// print triangle by using nested loops

		for (int j = 1; j <= 10; j++) {

			for (int i = 1; i <= j; i++) {
				System.out.print(i);
			}

			System.out.println();

		}

		for(int j = 10; j >= 1; j--) {		
			for(int i = 10; i >= j; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		for (int j = 10; j >= 1; j--) {
			
			for(int i = 1; i <= j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
