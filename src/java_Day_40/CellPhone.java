package java_Day_40;

public class CellPhone {
	
//local variable, variable declared in the method
//instance variable - variable declared in the class and outside any method
//Another advantage of creating a class is we can store multiple sets of data of different
	//types that belong to the object.
//When you call a method on an object it can't be static
	
		
		String brand ; //null
		double screenSize ;
		String color = "";
		double price = 0.0;
		
		public static void ring() {
			System.out.println("ring...");
		}
		
		public void call() {
			System.out.println("Calling .... ");
		}
		
		public void message() {
			System.out.println("Sending txt message .... ");
		}
		
		public void takeAPhoto() {
			System.out.println("taking a photo .... ");
		}
		public static void main(String[] args) {
			CellPhone cell = new CellPhone();
			cell.brand = "nokia";
		}
		
}
