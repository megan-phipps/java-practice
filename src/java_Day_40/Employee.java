package java_Day_40;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	
	public void work(){
		System.out.println(name + " is going to work");
	}
	public void goToBreak() {
		System.out.println(name + " is going to break");
	}
	public void attendMeeting() {
		System.out.println(name + " is attending a meeting");
	}
	public void introduce() {  //"Name[name], jobTitle[jobTitle], salary[salary]"
		System.out.println("Name [" + name + "], jobTitle ["+ jobTitle + "], salary [" + salary + "]");
	}
		
	
	
	
}
