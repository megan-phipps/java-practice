package java_Day_23;

public class BruteForce2 {

	public static void main(String[] args) {
		// loop through the numbers from 1 - 50;
		// print each number in the same line;
		// if number is divisible by 5, skip it.
		// if number is divisible by 20, then exit the loop
		String str = "";
		
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				continue;
			}
			if (i % 20 == 0) {
				break;
			}
			str+= i + ", ";
			
			
		}
		str = str.substring(0, str.length()-1);
		System.out.println(str);
	}
}
//try to get rid of comma