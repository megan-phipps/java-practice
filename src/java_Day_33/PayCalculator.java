package java_Day_33;

public class PayCalculator {
	public static void main(String[] args) {
		
		System.out.println(getHourlyPay(40, 50)); //one way to write
		int pay = getHourlyPay(40, 50);
		System.out.println("Total pay for 40 hours: " + pay); //second way to write
		System.out.println(getHourlyPay(40, 0));
	}
	
	public static int getHourlyPay(int hours, int rate) {
		if(hours <= 0) {
			System.out.println("Invalid Hours");
			return 0;
		}if(rate <= 0) {
			System.out.println("Invalid Rate");
			return 0;
		}
		int totalPay = hours * rate;
		return totalPay;
	}
}
