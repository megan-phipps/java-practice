package java_Day_38;
import java.util.*;
public class Warm_up_Raw_Array_List{
	public static void main(String[] args) {
		//Array list is a class. You know it's a class because it has new and has classes ready
		//Collections framework - consists of many ready classes for managing collections of data.
			//Already comes with Java
			//Provides different types of data structures. popular ones: List, Set, Map, Queue
			//collections framework shipped with JDK
		// List > Array List - the most popularly used one. 
		
		//Array list can only hold objects, it cannot store primitives, meaning, can't hold int but can hold
			//Integer, a wrapper class
		
		//API is something that gives you data
		
		ArrayList list = new ArrayList();  //compiles but says this ArrayList is a raw type. Raw type will accept
		list.add("Saturday");			   //anything. Even though we added primitive, it automatically auto-boxes it
		list.add("Java day");
		list.add("1000");
		list.add(234.4);
		list.add(true);
		list.add(false);
		
		System.out.println(list);  //Only when printing, you can skip toString. toString is automatically called here.
		String allValues = list.toString();  //In this case, toString is necessary because you need to 
											 //change the ArrayList into a String before storing it into a String
		
		String str = list.get(0).toString();
		System.out.println(str);
		//All values are stored as raw type. We can also call it as a general Object type
		
	}
}
