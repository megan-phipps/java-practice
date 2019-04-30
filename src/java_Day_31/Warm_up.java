package java_Day_31;
import java.util.*;
public class Warm_up {
	public static void main(String[] args) {
		//void - does not return a value
		
		//create 2 class counters using methods
	// 1) name: countUp
	//	  return type: void
	//	  param: int
	//    it prints from 1 to the value of the param countUp(5)
	//    1 2 3 4 5
	//    if param value less than 1 print "invalid input"
		
		//now try adding a scanner
		
	// 2) name countDown
	//    return type: void
		//	  param: int
		//    it prints from param value till 1 
		//    5 4 3 2 1 
	
		
		
				countUp(9);
				countDown(5);
				
				Scanner scan = new Scanner(System.in);
				System.out.println("enter number");
				int inputNum = scan.nextInt();
				//get number from keyboard
				countUp(inputNum);
				//call countUp method and set it as input
	}	
	
	
	
	
		
		public static void countUp(int num) {
		
			if(num < 1){
				System.out.println("invalid input");
			}else {
			for(int i = 1; i <= num; i++) {
					System.out.print(i + " ");
						if(num == i) {
							return;
				}
			  }
			}
		  }
		
		
		
		
		public static void countDown(int num) {
			System.out.println();
			System.out.println("****************");
			if(num < 1) {
				System.out.println("Invalid input");
			}else {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		  }
		}
			
			
		
		
		
		
	
	
}
