package java_Day_16;

public class CapitalC {
	public static void main(String[] args) {
		String str = "Moscow is the capital of Russia";
		System.out.println(str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan"));
				
		
		String email = "megan_phipps@gmail.com";
		String company = "deloitte";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
		
		
		
	}
}
