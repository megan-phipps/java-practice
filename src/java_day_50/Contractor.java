package java_day_50;

public class Contractor extends Employee{

	@Override
	public void calculatePay(int hours, double rate) {
		System.out.println("employee total pay: " + (hours * rate + 200));
	}
	
}
