package java_Day_16;

public class IsEmpty {
	public static void main(String[] args) {
		String username = "";
		String password = "";
		System.out.println(username.isEmpty());

		if (username.isEmpty()) {
			System.out.println("username field cannot be empty");
		}

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("username or password cannot be empty");
		}

		if (username.isEmpty() && password.isEmpty()) {
			System.out.println("username and password is empty");
		}

		if(username.length() == 0) {
			System.out.println("username length is 0, so it is empty");
		}
		
		
}
}