package java_Day_41;

public class MicrowaveTest {
	public static void main(String[] args) {
		
		Microwave myMicrowave = new Microwave();
		myMicrowave.isOn = false;
		myMicrowave.brand = "Cuisine Art";
		
		myMicrowave.heat("pizza");
		
		myMicrowave.turnOn();
		myMicrowave.heat("Pizza");
		
		myMicrowave.turnOff();
		myMicrowave.heat("Pizza");
		
		
	}
}
