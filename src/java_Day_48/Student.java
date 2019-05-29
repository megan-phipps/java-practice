package java_Day_48;

public class Student extends Person{
	
	int studentID;
	String clazz;
	
	public void code(String language) {
		System.out.println(name + " is coding " + language);
	}
	
	public void attendClass() {
		System.out.println(name + " is attending " + clazz + " class.");
	}
	
	
	
	
	
}
