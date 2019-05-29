package java_day_51;

public class Swimming extends Exercise{
	
	@Override
	public int perform (int minutes) {
		int calories = 11 * minutes;
		System.out.println("Swimming");
		return calories;
	}
}
