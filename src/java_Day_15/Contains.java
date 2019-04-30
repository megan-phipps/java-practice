package java_Day_15;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes, tomatoes, apples, eggs, milk, bread, cereal, meat";
		if(list.contains("apples")) {
			System.out.println("Apples are on the list!");
		}else {
			System.out.println("Let's add apples");
		}
		
		
		boolean hasEggs = list.contains("eggs");
			System.out.println("contains eggs: " + hasEggs);
		
		boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
			System.out.println("contains cucumbers: " + hasCucumbers);
			
		email = "name@yahoo.com";
		if(email.contains("@yahoo")) {
			System.out.println("yahoo account");
		}else if (email.contains("@gmail")) {
			System.out.println("google account");
		}else {
			System.out.println("Account not found");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		
		String name = "Megan";
		
		if(name.contains("e") || name.contains("a")) {
			System.out.println("You have at least one \'a\' or \'e\' in your name");
		}else {
			System.out.println("you do not have at least one \'e\' or \'a\' in your name");
		}
		
		
		
		
		
		
	}
}
