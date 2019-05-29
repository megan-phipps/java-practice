package java_Day_41;

public class BMW {
	String make = "BMW";
	String model;
	double price;
	
	public void showPrice() {
		if(model.equalsIgnoreCase("330i")) {
			price = 40250;
			System.out.println(price);
		}else if(model.equalsIgnoreCase("740i")) {
			price = 86450;
			System.out.println(price);
		}else if(model.equalsIgnoreCase("m3")) {
			price = 66500;
			System.out.println(price);
		}else {
			price = 0.0;
			System.out.println("Model is not available");
		}
	}
	
	
}
