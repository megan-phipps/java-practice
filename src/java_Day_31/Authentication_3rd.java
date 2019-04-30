package java_Day_31;

public class Authentication_3rd {

	/*
	 * Name: login
	 * Return type: void
	 * 2 String parameters: username, password
	 *   validUsername = "mentoring@cybertekschool.com";
	 *   validPassword = "mentor001";
	 *   if username and password match print "Login Sucessful! Welcome to Okta!
	 *   If not return "Sign in failed"
	 */
	
	public static void login(String username, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		if(validUsername.equalsIgnoreCase(username) && validPassword.equals(password)){
			System.out.println("Login Sucessful! Welcome to Okta!");
		}else {
			System.out.println("Sign in failed");
		}
				
	}
	
	
	public static void main(String[] args) {
		login("mentoring@cybertekschool.com", "mentor001");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
