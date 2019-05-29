package java_day_51;

public class Running extends Exercise{
	
	@Override
	public int perform (int minutes) {
		int calories = 10 * minutes;
		System.out.println("Running");
		return calories;
	}
}
