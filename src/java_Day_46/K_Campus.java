package java_Day_46;

public class K_Campus {
	private String city;
	static String country;
	
	//A lot of times in automation we don't use this but its part of OCA and interviews
	static {
		System.out.println("Static block 1");
		country = "USA";
	}
	
	static {
		System.out.println("Static block 2");
		country = "Canada";
	}
	
	public K_Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public static void campusInfo() {
		System.out.println("Welcome to campus!");
	}
	
	
	
	
}
