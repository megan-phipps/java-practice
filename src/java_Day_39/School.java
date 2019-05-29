package java_Day_39;

public class School {
	public static void main(String[] args) {
		//this custom class has a main method
		//create object from Student class
		Student student = new Student();
		student.name = "Roman";
		student.age = 25;
		student.subject = "Java";
		
		System.out.println("Name: " + student.name);
		
		//create another student object
		Student student2 = new Student();
		System.out.println(student2.name);
		student2.name = "Cleetus";    //these are variable, need to have an object before you can have a variable
		student2.age = 33;
		student2.subject = "Selenium";
		
		System.out.println("Name: " + student2.name);
		System.out.println("Age: " + student2.age);
		System.out.println("subject: " + student2.subject);
		
		
		
	}
}
