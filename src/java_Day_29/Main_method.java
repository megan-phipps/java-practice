package java_Day_29;

public class Main_method {
	public static void main(String[] args) {
		//If you are doing something over again you need a method
		sayHello();
		study();
		study();
		study();
		System.out.println("*********************");
		sayHello();
		code();
		sayHello();
		sayHello();
		System.out.println("*********************");
		code();
		
	}
		public static void study() {
			System.out.println("Student is studying");  //put in code that you want to reuse and make sure
														//to put your study method() in the main method
		}
		
	//create a method sayHello that prints "Hello Friends" "how are you today?" every time you use it.
		public static void sayHello() {
			System.out.println("Hello Friends!");
			System.out.println("How are you today?");
		}
		
	//create a method called code that prints "student is coding Java"	
		public static void code() {
			System.out.println("student is coding Java");
		}
		
		
		
		
		
		
		
		
		
		
	
}
