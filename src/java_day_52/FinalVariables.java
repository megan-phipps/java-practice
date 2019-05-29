package java_day_52;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 610; //can initialize here or in a constructor or init block
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	public final String JAN = "January";
	
	public static final String COMPANY_NAME = "Cybertek";
	//public static final String ADMIN_USERNAME;

public FinalVariables() {
	MODEL_3_MAX_SPEED = 190;
}
	


{
	MODEL_X_PASSENGERS = 7;
}



	public static void main(String[] args) {
		final int MAX_PASSENGERS_COUNT = 5;
		//MAX_PASSENGERS_COUNT = 10;
		
		FinalVariables finalVars = new FinalVariables();
		System.out.println("Max range for roadster: " + finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed " + finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Model x passengers " + finalVars.MODEL_X_PASSENGERS);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(COMPANY_NAME);
		System.out.println(finalVars.COMPANY_NAME);
		
		
		
		
		
		
		
		
	}
}
