package java_day_51;

public class JuiJitsu extends Exercise{
	
	@Override
	public int perform (int minutes) {
		int calories = 12 * minutes;
		System.out.println("Doing JuiJitsu");
		return calories;
	}
}
