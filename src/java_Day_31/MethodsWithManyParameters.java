package java_Day_31;

public class MethodsWithManyParameters {
	public static void main(String[] args) {
		/* Method name: drive
		 * return type: void
		 * param: String car, int speed
		 * 
		 * "audi" is driving 60 mph
		 */
		
		
		drive(60, "audi");
		
		drive(100, "honda");
	
	}
	
	
	public static void drive(int speed, String car) {
		System.out.println(car + " is driving " + speed + " mph") ;
	}
	
	
	
	
	
	
	
}
