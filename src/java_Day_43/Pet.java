package java_Day_43;

public class Pet {
	
	private String type;
	private String name;
	
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	public Pet() {
		System.out.println("No-args constructor");
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void speak() {
		switch(type.toLowerCase()) {
		case "cat":
			System.out.println("Meow");
			break;
		case "dog":
			System.out.println("woof");
			break;
		case "bird":
			System.out.println("tweet tweet");
			break;
		case "goat":
			System.out.println("mhaaaa mhaaa");
			break;
		case "sheep":
			System.out.println("baaahh");
			break;
		case "rooster":
			System.out.println("u uuu uuuu");
			break;
		default:
			System.out.println("...");
		}
	}
	
	@Override
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}

	
	
	
	
	
	
	
	
}
