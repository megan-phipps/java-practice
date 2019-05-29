package java_Day_46;

public class C_Ebay {
	public static void main(String[] args) {
	B_Customer cm1 = new B_Customer("Abdallah Aleies", "AbdallahAleies@gmail.com");
	B_Customer cm2 = new B_Customer("ADILET KYRGYZ", "adilet@yahoo.com");
	B_Customer cm3 = new B_Customer("Anastisiia Zasibna", "Anastisiia@outlook.com");
	
	System.out.println(cm3.count);
	System.out.println(B_Customer.count);
	
	B_Customer cm4 = new B_Customer("Burak Ucal", "Burak@gmail.com");
	System.out.println(B_Customer.count);
	
	System.out.println(cm1.count = 10);
	System.out.println(B_Customer.count);
	
	
	
	
	}
}
