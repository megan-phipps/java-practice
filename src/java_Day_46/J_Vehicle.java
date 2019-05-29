package java_Day_46;

public class J_Vehicle {
	String type;  //non-static - every object has its own type
	static int numberOfVehicles; //static - shared, one central value
	
	
	public static void vehicleInfo() {
	//try to print type
	//System.out.println("type " + type);  will not compile, says change to static
	
	//print numberOfVehicles
	System.out.println("Number Of Vehicles: " + numberOfVehicles);
	//will work because it is static instance variable in static method
	
	int count = getNumberOfVehicles(); //works because both are static
	String make = "Kia";
	make = make.toUpperCase();
	System.out.println("Make: " + make);
	}
	
	
	public static int getNumberOfVehicles() {
		return numberOfVehicles;
		//this is fine because you are using a static variable in a static method
	}
	
	
	public String toString() {  //non-static method can to access both static and non-static variable
		return "Vehicle type: " + type + " Number of Vehicles: " + numberOfVehicles;
	}
	
	
	
	
	
	
	
	
}
