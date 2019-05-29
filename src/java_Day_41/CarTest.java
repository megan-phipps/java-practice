package java_Day_41;

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.make = "Ford";
		myCar.model = "Fiesta";
		myCar.color = "gray";
		myCar.currentSpeed = 55;
		
		myCar.printCarInfo();
		
		myCar.showCurrentSpeed(25);
		
		myCar.drive();
		
		System.out.println("Speed before accelerating " + myCar.currentSpeed);
		myCar.accelerate(10);
		System.out.println("Speed after accelerating " + myCar.currentSpeed);
		
		BMW myBMW = new BMW();
		System.out.println(myBMW.make);
		
		myBMW.model = "m3";
		System.out.println(myBMW.model);
		

	}
}
