package java_Day_18;

public class Counter_While_Loop {
	public static void main(String[] args) throws InterruptedException {
		int num = 1;
		
		while(num <= 10) {
		System.out.print(num + ", ");
		num++;
		//Thread.sleep(750);
	}
		System.out.println("\nnum after loop: " + num);
		
		
		//print backwards
		num = 10;
		while(num >= 1) {
			System.out.print(num + ", ");
			num--;
			Thread.sleep(456);
		}
		System.out.print("\nHappy New Year!");
		
		
}
}
