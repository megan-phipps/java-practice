package java_Day_14;

public class String_Size {
	public static void main(String[] args) {
		String str1 = "Good Morning";
				
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}

		if(str1.equalsIgnoreCase("Good Morning")) {
			System.out.println("Match - ignore Case");
		}else {
			System.out.println("Not Match - ignore case");
		}
		
		System.out.println(str1.toUpperCase());
				//stays as upper case
		
		str1 = str1.toUpperCase();
		
		
		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("chained methods: do not match");
		}
		
		String myName = "Megan";
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length: " + length);
		
		// password must be exactly 8 characters
		String username = "username";
				if(username.length() == 8) {
					System.out.println("Good username");
				}
		
		// password must be at least 6 characters
		String password = "password";
			if(password.length() >= 6) {
				System.out.println("Good password");
			}
		
	   int passwordLength = password.length();
	   
	   if(passwordLength < 6) {
		   System.out.println("Invalid password, too short");
	   }else {
		   System.out.println("good password");
	   }
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
