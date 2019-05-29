package java_Day_49;

public class Animal {
	
	private String type;
	
	public Animal() {
		System.out.println("animal constructor");
		type = "undefined";
	}
	
	public Animal(String type) {
		System.out.println("Animal one-args constructor");
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
}
