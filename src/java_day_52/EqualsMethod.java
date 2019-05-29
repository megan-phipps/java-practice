package java_day_52;

public class EqualsMethod {
	public static void main(String[] args) {
		Computer computer1 = new Computer("iMac", "silver");
		Computer computer2 = new Computer("iMac", "silver");
		Computer computer3 = computer2;
		
		System.out.println(computer1 == computer2);
		System.out.println(computer1.equals(computer2));
		
		System.out.println(computer3 == computer2);
		System.out.println(computer3.equals(computer2));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
