package java_Day_49;

public class Leopard extends Animal{
	
	public Leopard() {
		super();
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	
	public Leopard(String type) {
		super(type); //call Animal(String type)
		System.out.println("Leopard one args constructor");
	}
	
	
	
	
	
}
