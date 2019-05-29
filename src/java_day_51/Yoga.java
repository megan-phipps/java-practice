package java_day_51;

public class Yoga extends Exercise{
	
	@Override
	public int perform (int minutes) {
		int calories = 5 * minutes;
		System.out.println("Doing Yoga");
		return calories;
	}
}
