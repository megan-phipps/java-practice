package java_day_49_AccessModifiers;
import java_Day_49.*;
public class IPad extends Device{ //Ipad is a subclass in a different package
	public void readEBook(String title) {
		
//		public String brand;  //visible to everyone in same or other packages
//		protected String model; 
//		int price;
//		private String country;
//		
		
		System.out.println("reading an ebook called " + title + " using " + brand + " tablet");
		System.out.println(model);
		//System.out.println(price); not accessible
		//System.out.println(country); not accessible
		
		
		
	}
}
