package java_day_52;

import java.util.*;

public class FinalList {
	
	public static final String COLOR = "Pink";
	
	public static void main(String[] args) {
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("White");
		COLORS.add("Blue");
		
		System.out.println(COLORS.toString());
		COLORS.add("Black");
		System.out.println(COLORS.toString());
		
// Cannot create a new Array with the same variable name
//		COLORS = new ArrayList<>();
//		System.out.println(COLORS.toString());
//		COLORS.add("Yellow");
//		System.out.println(COLORS.toString());
		
		
		
		
		
		
		
		
		
		
		
	}
}
