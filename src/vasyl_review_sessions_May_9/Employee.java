package vasyl_review_sessions_May_9;

public class Employee {

	String firstName;
	String lastName;
	int employee_id;
	int age;
	float hourlyRate;
	char gender;
	boolean isInsured;
	String email;
	String title;
	
	public void printInfo() {
		System.out.println("First name: " + firstName + ", Last name: " + lastName + ", Employee id: " + employee_id
				+ ", Age: " + age + ", Hourly rate: " + hourlyRate + "$, Gender: " + gender + ", Insured? " + isInsured
				+ ", Title: " + title+", Email: "+email);
		}
	
	public String generateEmail(Employee worker) {
		return firstName + lastName + "@gmail.com";
	}
	
	
	
	
	
	
	
	
}
