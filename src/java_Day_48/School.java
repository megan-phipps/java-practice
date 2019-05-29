package java_Day_48;

public class School {
	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		
		person.name = "Obama";
		person.age = 57;
		person.gender = 'M';
		
		student.name = "Roman";
		student.age = 30;
		student.gender = 'M';
		
		person.eat("steak");
		student.eat("ramen");
		
		student.clazz = "ping-pong";
		
		person.walk();
		student.walk();
		
		person.sleep(8);
		student.sleep(2);
		
		Student student2 = new Student();
		student2.name = "Orhan";
		student2.age = 40;
		student2.gender = 'M';
		student2.studentID = 4040;
		student2.clazz = "agile/scrum";
		student2.code("Java");
		student2.attendClass();
		student2.eat("Kebab");
		student2.walk();
		
		student.code("Java");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
