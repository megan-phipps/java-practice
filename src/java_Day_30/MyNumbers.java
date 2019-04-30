package java_Day_30;
import java.util.*;
public class MyNumbers {
	public static void main(String[] args) {
		
		showMe5Numbers();
		do10PushUps();
		rangePrint();
	}
	
	//to go back hit the yellow arrow button
	//make method rangePrint
	
	public static void showMe5Numbers() {
	for(int i = 1; i <= 5; i++) {
		Random random = new Random();
		int num = random.nextInt(1000);
		System.out.print(num + ", ");
		
	}
		System.out.println();
	}
	
	
	public static void do10PushUps(){
		for(int i = 1; i <= 10; i++) {
			System.out.println("pushup - " + i);
		}
		System.out.println("Time to rest!");
	}
	
	public static void rangePrint() {
		int num1 = 0;
		int num2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Type first number");
			num1 = scan.nextInt();
		System.out.println("Type second number");
			num2 = scan.nextInt();
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
				
		}else if(num1 > num2) {
			for(int i = num1; i >= num2; i--) {
				System.out.println(i);
			}
		}else if(num1 == num2) {
			System.out.println(num1);
		}
		
	}
	
	
}
