package java_Day_42;

public class Coffee {

	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		System.out.println("Name: " + name + ", size: " + size + 
				  ", price: $" + price + ", calories " + calories);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("TALL") ||
			(newSize.equalsIgnoreCase("GRANDE") || 
			(newSize.equalsIgnoreCase("VENTI")))) {
		size = newSize;
		}else {
			System.out.println("not valid");
		}
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setCalories(int newCalories) {
		calories = newCalories;
	}
	

	public void setCoffeeInfo(String newName,String newSize, double newPrice, int newCal) {
		name = newName;
		setSize(newSize);
		price = newPrice;
		calories = newCal;
	}
	
	
	
	
	
	
}
