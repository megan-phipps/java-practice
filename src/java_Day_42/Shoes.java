package java_Day_42;

public class Shoes {
	String brand;
	double size;
	
	
	public void setShoesData(String newBrand, double newSize) {
		brand = newBrand;
		size = newSize;
	}
	
	public String getShoesData() {
		return brand + " | " + size;
	}
	
	
	
}
