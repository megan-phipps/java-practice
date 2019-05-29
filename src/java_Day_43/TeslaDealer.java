package java_Day_43;

public class TeslaDealer {
	public static void main(String[] args) {

		Tesla tesla = new Tesla();
		
		tesla.setModel("X");
		tesla.setPrice(31450);
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setSelfDriving(true);
		
//		System.out.println("Model: " + tesla.getModel());
//		System.out.println("Price: " + tesla.getPrice());
//		System.out.println("Range: " + tesla.getRange());
//		System.out.println("ZeroTo60 " + tesla.getZeroTo60());
//		System.out.println("SelfDriving: " + tesla.isSelfDriving());
		
		System.out.println(tesla); //automatically calling toString
		System.out.println(tesla.toString());
	
		Tesla myTesla = new Tesla(); 
			myTesla.setTeslaInfo("roadster", 620, 1.9, 250000, true);
			System.out.println(myTesla.toString());
		
			//tesla, myTesla
			if(tesla.getZeroTo60() > myTesla.getZeroTo60()) {
				System.out.println("Faster model: " + myTesla.getModel());
				System.out.println("0-60 speed: " + myTesla.getZeroTo60());
			}else {
				System.out.println("Faster model: " + tesla.getModel());
				System.out.println("0-60 speed: " + tesla.getZeroTo60());
			}
	
			
			buy(myTesla);
			buy(tesla);	
			testDrive("Model S");
			System.out.println(testDrive("model x"));
	        Tesla testCar = testDrive("model y");
	        System.out.println(testCar.toString());
	
	}		
	//============================================		
			
	
	public static void buy(Tesla car) {
		System.out.println("Purchasing " + car.toString());
	}
	
	public static Tesla testDrive(String model) {
		System.out.println("I would like to test drive - " + model);
		System.out.println("-Sure, let me build the object and return it.");
		Tesla car = new Tesla();
		car.setTeslaInfo("model X", 4, 345.35, 35.4, true);
		return car;
	}
	
	
	
	
	
	
	
	
	
	
}
