package java_day_51;

public class Snowboarding extends Exercise{
	
	@Override
	public int perform(int minutes) {
		System.out.println(super.perform(10));
		System.out.println("Snowboarding for " + minutes + " minutes");
		return minutes * 7;
		
		
		
		
		
		
		
		
		
	}
}
