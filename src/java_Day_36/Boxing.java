package java_Day_36;

public class Boxing {
	public static void main(String[] args) {
		//AUTO-BOXING
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		
		//AUTO-BOXING vs. UNBOXING
		//Auto-Boxing is converting from primitive to wrapper class object
		//		primitive > object
		//unboxing - convert wrapper class object to primitive
		// 		object > primitive
		
		long l1 = new Long(6000000); //unboxing
		long l2 = new Long(335734587L); //no boxing
		long l3 = l2; //auto-unboxing
		Long l4 = l3; //auto-boxing
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3; will not compile b/c casting is not possible with wrapper class
		
		//Boolean d1 = new Double (33.2);
		//Double d2 = d1;
		Double d3 = 4.3;
		
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("d1: " + d1);
		System.out.println("d2 " + d2);
		
		long l1 = new Long(6000000);
		
		
	}
}
