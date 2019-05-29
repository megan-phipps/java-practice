package java_Day_40;

public class BestBuy {
	public static void main(String[] args) {
		CellPhone cell1 = new CellPhone(); //creating CellPhone object
		System.out.println(cell1.brand); // prints null
		System.out.println(cell1.screenSize);
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price= 76.16;
		
		System.out.println("Brand: " + cell1.brand);
		System.out.println("Screen Size: " + cell1.screenSize);
		System.out.println("Color: " + cell1.color);
		System.out.println("Price: " + cell1.price);
		
		cell1.color = "Black";
		System.out.println("Color: " + cell1.color);
		
		CellPhone cell2 = new CellPhone();
		System.out.println("#### Cell 2 Values ####");
		System.out.println(cell2.brand = "Siemens");
		System.out.println(cell2.screenSize = 1.5);
		System.out.println(cell2.color = "blue");
		System.out.println(cell2.price = 39.22);
		
		System.out.println("#### Calling Methods ####");
		cell1.call();
		cell1.message();
		cell1.takeAPhoto();
		
		cell2.call();
		cell2.message();
		cell2.call();
		cell2.takeAPhoto();
		
		
		
		
		
		
		
		
	}
}
