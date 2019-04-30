package java_Day_21;

import java.util.*;

public class IMPORTANT_Get_Unique_Characters {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	
	
	System.out.println("enter word");
	String word = scan.next(); //javva
	String unique = "";
	
	for (int i = 0; i < word.length(); i++) {
		if(!unique.contains(word.charAt(i)+ "")) {  //use empty string b/c .contains accepts a string not a char
			unique += word.charAt(i);
		}
	}
	System.out.println(unique);
		
		
		
		
	}
}
