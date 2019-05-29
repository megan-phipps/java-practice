package java_Day_38;
import java.util.*;
public class Remove_All_Method {
	public static void main(String[] args) {
		//removeAll method
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(30); list1.add(12); list1.add(22);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(30); list2.add(345); list2.add(1);
		list2.add(12); list2.add(22); list2.add(12);
		list2.add(120);
		
		System.out.println(list1);
		System.out.println(list2);

		//remove all numbers from list2 that match list1
		list2.removeAll(list1);
		System.out.println(list2);// since we removed all matching values from list2, we are left with 345, 1, and 20
		
		//difference b/w remove and removeAll
			//remove must specify an index, it removes only one value. Ex: remove(0)
			//removeAll removes everything you tell it to, can remove groups of things at one time.
		
 	}
}
