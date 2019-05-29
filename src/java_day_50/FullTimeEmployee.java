package java_day_50;

public class FullTimeEmployee extends Employee{
	
	@Override
	public void calculatePay(int hours, double rate) {
		double pay = hours * rate;
		double bonusPay = pay * 0.05;
		System.out.println("Full employee total pay: " + (pay + bonusPay) );
	}
	
	
	
	
	
	
}
