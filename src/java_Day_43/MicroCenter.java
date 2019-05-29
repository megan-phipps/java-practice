package java_Day_43;

public class MicroCenter {
	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		
//		System.out.println(comp1.toString());
//		System.out.println(comp2.toString());   Will print an empty string because there are no values set
		
		comp1.setBrand("mac");
		comp1.setOs("mojave");
		comp1.setPrice(1000);
		
		comp2.setBrand("xps");
		comp2.setOs("Windows 10");
		comp2.setPrice(150);
		
		System.out.println(comp1.toString());
			System.out.println(comp2.toString());
		
		Computer comp3 = new Computer("ASUS", "windows 7", 500.5);
			System.out.println(comp3.toString());
		
		comp3.setOs("Windows 11");
			System.out.println(comp3.toString());
		
		comp3.setPrice(comp3.getPrice()-200);
			System.out.println(comp3.toString());
			
	}
}
