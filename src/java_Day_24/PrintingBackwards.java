package java_Day_24;

public class PrintingBackwards {
	public static void main(String[] args) {
		//loop backwards through the string by 3
		
		String str = "java is a fun, object oriented programming";
		for(int i = str.length(); i >= 3; i--) {
			System.out.println(str.substring(i-3, i));
		}
	}
}
