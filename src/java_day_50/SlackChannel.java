package java_day_50;

public class SlackChannel {
	public static void main(String[] args) {
		SlackUser su = new SlackUser("Nadir");
		AdminUser au = new AdminUser("Florian");
		
		su.sendAMessage("Jira");
		au.sendAMessage("Thank you");
		
	
		
	}
}
