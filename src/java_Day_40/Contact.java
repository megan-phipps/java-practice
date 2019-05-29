package java_Day_40;

public class Contact {

	String name;
	String phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Calling " + name + "...");
	}
	
	public void sendMessage() {
		System.out.println("Message recieved from " + phoneNumber);
	}
	public void sendEmail() {
		System.out.println("Sending email...");
	}
	
	
	
	
	
}
