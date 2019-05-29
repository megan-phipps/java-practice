package java_Day_41;

public class Microwave {
	String brand;
	boolean isOn;
	
	public void turnOn() {
		if(!isOn) {
			isOn = true;
			System.out.println("Microwave is now on");
		}else {
			System.out.println("Microwave is already on");
		}
	}
	
	public void turnOff() {
		if(isOn) {
			isOn = false;
			System.out.println("Microwave is now off");
		}else {
			System.out.println("Microwave is already off");
		}
	}
	
	public void heat(String food) {
		if(isOn) {
			System.out.println("Heating the " + food);
		}else {
			System.out.println("Microwave is off, cannot heat the " + food);
		}
	}

	
	
	
	
}
