package selfLearning;

public class TernaryOperators {
	public static void main(String[] args) {
		
		
		//ternary means 3 parts.
		//variable = (boolean) ? expression 1 : expression 2;
		
		int n1 = 5, n2 = 10;
		int max;
		
		if (n1 > n2) {
			max = n1;
		}else {
			max = n2;
		}
		System.out.println(max);
		
		
		max = (n1 > n2) ? n1 : n2;
		System.out.println(max);
		
		

		//green light problem
		
		   String action;
		   boolean isGreen = true;
		   
		   if (isGreen == true) {
			   System.out.println(action = "can drive");
		   }else {
			   System.out.println(action = "cannot drive");
		   }
		   
		   
		   action = (isGreen == true) ? "can drive" : "cannot drive";
		   System.out.println(action);
		
		
		//example bill
		int bill = 2000;
		int discount = (bill > 2000) ? 20 : 10;
		System.out.println(discount);
		
		int bill2 = 1400;
		int quantity = 11;
		
		if (bill2 > 1000) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
