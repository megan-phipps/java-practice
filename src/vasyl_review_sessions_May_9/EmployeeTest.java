package vasyl_review_sessions_May_9;

import java.util.Arrays;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee Anna = new Employee();
		
		Anna.firstName = "Anna";
		Anna.lastName = "M";
		Anna.age = 26;
		Anna.email = "anna@gmail.com";
		Anna.employee_id = 123456;
		Anna.gender = 'F';
		Anna.hourlyRate = 50.55f;
		Anna.isInsured = true;
		Anna.title = "SDET";
		
		Anna.printInfo();
		
		Employee Tom = new Employee();
		Tom.firstName = "Tom";
		Tom.lastName = "H";
		Tom.age = 23;
		Tom.email = "tom@gmail.com";
		Tom.employee_id = 98765;
		Tom.gender = 'M';
		Tom.isInsured = true;
		Tom.hourlyRate = 50.55f;
		Tom.title = "SDET";
		
		//Employee[] it_department = {Anna, Tom};
	
		System.out.println(Anna.generateEmail(Anna));
		
		String loveJava = "Java";
		String myString = loveJava.replace('a', 'u');
		System.out.println(myString);
		
		
		
		
		
	}
}
