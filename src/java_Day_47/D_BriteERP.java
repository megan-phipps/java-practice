package java_Day_47;
import java.time.LocalDateTime;
public class D_BriteERP {
	static {
		System.out.println("Launch Browser");
		System.out.println("Navigate to: " + B_TestData.url);
	}
	
	public static void enterEmail() {
		System.out.println("Enter email " + B_TestData.email);
	}
	
	public static void enterPassword() {
		System.out.println("Enter Password " + B_TestData.password);
	}
	
	public static void verifyLogin() {
		System.out.println("Expected Name: " + B_TestData.username);
		System.out.println("Actual Name: Victoria");
		System.out.println("Login successful - " + LocalDateTime.now());
	}
	
	
	
}
