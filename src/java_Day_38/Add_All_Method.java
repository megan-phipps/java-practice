package java_Day_38;
import java.util.*;
public class Add_All_Method {
	public static void main(String[] args) {
		//addAll method -> adds all values from one list to another
		List<String> l1 = new ArrayList<>();
		l1.add("java");
		l1.add("python");
		
		List<String> l2 = new ArrayList<>();
		l2.add("C#");
		l2.add("C++");
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(l2.addAll(l1)); //Using this method saves us from writing a loop like the one below
		
		for(String value: l1) {  //this loop used another method to add the values from l1 to l2
			l2.add(value);
		}
		
		
		
		
		
		
		
		
	}
}
