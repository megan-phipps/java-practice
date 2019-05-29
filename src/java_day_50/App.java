package java_day_50;

public class App {
	private String name;
	public static int count;
	
	
	public App(String name){
		this.name = name;
	}
	
	public static void build(String language) {
		System.out.println("Building an app using " + language);
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
