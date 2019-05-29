package java_Day_45;

public class EtsyDotCom {
	public static void main(String[] args) {
	EtsyAccount account1 = new EtsyAccount();
	
	account1.setFirstName("Megan");
	account1.setEmail("meg@gmail.com");
	account1.setPassword("123456");
	System.out.println(account1.toString());
	
	EtsyAccount account3 = new EtsyAccount("@gmail.com", "MEGAN P", "123456");
	System.out.println(account3);
	
	EtsyAccount account4 = new EtsyAccount("@gmail.com", "MEGAN P");
	System.out.println(account4.toString());
	
	
	
	
	
	
	}
}
	
	
