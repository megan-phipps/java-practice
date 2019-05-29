package java_Day_46;

public class G_CalcTest {
	public static void main(String[] args) {
		double result = F_Calculator.plus(55, 7);  //because plus is static we don't need object, just class name
			System.out.println(result);
		
		result = F_Calculator.minus(39, 2);  //WHen something is static it becomes italicized
			System.out.println(result);
			
		result = F_Calculator.multiply(4, 30);
		
		F_Calculator c = new F_Calculator();
		result = c.multiply(4, 30);  //you can call using the object, using a static method but its better to call
										//through the class name instead. 
		
		Character.isDigit('5');  //this is static, we are calling through class
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
