package java_Day_14;
import java.util.*;
public class String_methods {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word1, word2;
		
		System.out.println("Enter two words");
		word1 = scan.next();
		word2 = scan.next();
		
		if(word1.length() > (word2.length())) {
			System.out.println(word1 + " is longer than " + word2);
		}else {System.out.println(word2 + " is longer than " + word1);
			
		}
		
		
		
		
		
		
		
		
	}
}
