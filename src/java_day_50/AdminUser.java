package java_day_50;

public class AdminUser extends SlackUser{
	public AdminUser(String name) {
		super(name);
	}
	
	public void sendAMessage(String message) {
		System.out.println("@channel");
		System.out.println(getName() + " is sending a message < " + message + " >");
	}
	
	
	
	
	
	
}
