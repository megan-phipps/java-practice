package java_Day_38;
import java.time.Month;
import java.util.*;
public class Contains {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		
 		ArrayList<String> list2 = list1; //list1 and list2 now point to the same object. 
 										 //Avoid this b/c if you change list2, list1 will also change
		
 		//better way to write below: 
		ArrayList<String> months = new ArrayList<>(list1); //here, putting list1 in "constructor" More on constructors later
		System.out.println(months);
		
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		System.out.println(months.contains("Jun"));
		
		//Print out months again to see how the ArrayList has changed
		System.out.println(months);
		
		//How would you check if Feb is in second position
			//could print 
			System.out.println(months.indexOf("Feb") == 1);
			System.out.println(months.get(1).contentEquals("Feb")); //better way because get(1) will show index out of 
																	//bounds if somehow the ArrayList becomes empty.
																	//whereas the first one will just show true or false
			
		ArrayList<String> months2 = new ArrayList<>(list1); //putting everything from list1 into month2
		
		System.out.println("Months: " + months.toString());
		System.out.println("Month2: " + months2.toString());
				
		//Check if months has all the values of months2
		System.out.println(months.containsAll(months2)); //prints true
			
		//Add one more "Jan" to month2
		System.out.println(months2.add("jan")); //prints true, meaning you can have duplicate items. 
		
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
