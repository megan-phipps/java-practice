package practice;
import java.util.*;
public class Chapter2 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
	
//	//float can have 7 decimal places
//	System.out.println("Enter a decimal number");
//		float x = scan.nextFloat();
//		float y = x % 2.0f;
//		int z = (int) x;
//		
//		
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);
//
//		System.out.println("z = " + z);
//		
//		System.out.println("z = " + (z %= 2));
		
//		int u = 2;
//		System.out.println(u++ / 3 + u++ * 5);
//		
//		System.out.println(2 + 3 * 5 + 7); 
//		
//		System.out.println(2 + 11 % 3 * 5 + 7);
//		
//		System.out.println("Test 3 = " + (10 * 3 - 2.0));
		
		
		//use indexOf and substring to find the first word in the String.
		String friend = "Hello, my good friend";
		String myString = friend.substring(0, friend.indexOf(","));
		System.out.println(myString);
		
		String word2 = (friend.substring(friend.indexOf(" ")+1, friend.indexOf((" "), friend.indexOf(" ")+1)));
		System.out.println(word2);
		int word = friend.indexOf((" "), friend.indexOf(" ")+1);
		int nextWord = friend.indexOf(" ", word+1);
		
		System.out.println(friend.substring(word+1, friend.indexOf(" ", word+1 )));
		
		System.out.println(friend.substring(nextWord+1));
		
		
		
		
		
	}
}
