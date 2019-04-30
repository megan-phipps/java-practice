package java_Day_18;
import java.util.*;
public class Pincode_2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int secretPincode = 4321;
	int pincode = 0;
	int attempts = 0;
	//give only 3 attempts
	//if attempts reach more that 3, print "card blocked"
	
	while(pincode != secretPincode && attempts < 3) {
		System.out.println("enter pincode");
		pincode = scan.nextInt();
		attempts++;
		if (attempts ==3 && pincode != secretPincode) {
			System.out.println("card blocked");
			return;
	}
	}
			System.out.println("transaction complete");
		
			String java;
}
}
