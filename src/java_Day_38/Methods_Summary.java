package java_Day_38;
import java.util.*;
public class Methods_Summary {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		
		  //add method with index: "yellow will be placed at 0 index" Everything else shifts one place to the right
		list1.add(0, "yellow");
		
		//use toString method to print all values in the same line
		System.out.println(list1.toString()); // prints [yellow, red, blue, white, grey, black]
		
		//size method - returns number of values
		System.out.println("Number of elements: " + list1.size()); //prints Number of elements: 6
		
		//get method. Returns a value from specified index
		System.out.println(("3: " + list1.get(3)));     //prints 3: white
		
		//remove using index.remove value from index position
		list1.remove(0); //removes yellow
		
		System.out.println(list1.toString()); //yellow is not there anymore
		
		//remove using value/element. Removes element first occurrence
		list1.remove("blue");  //removes blue
		System.out.println(list1);  //blue is no longer there
		
		//set(index, value) replace certain index with new value
		list1.set(0, "orange"); //red will be replaced with orange
		System.out.println(list1.toString()); 
		
		//indexOf(value) returns index of value in the list
		System.out.println("grey: " + list1.indexOf("grey"));  //prints grey: 2
		System.out.println("green: " + list1.indexOf("green")); // prints green: -1
		
		//isEmpty() returns true if list is empty. size == 0
		System.out.println("is list empty? " + list1.isEmpty());
		System.out.println("is list empty? " + (list1.size() == 0)); //another way to see if list is empty
		
		//contains(element) ==> returns true if value is present
		System.out.println("white in list? - " + list1.contains("white"));
		
		//addAll methods
		List <String> list2 = new ArrayList<>();
		list2.addAll(list1);
		
		//if you want to change the variable name everywhere, right click on variable, 
		//click refactor, then rename
		
		//containsAll. check if list has all values of another list
		System.out.println("containsAll: " + list1.containsAll(list2)); //prints true
		
		//equals method - checks if 2 lists are exactly the same, index and all
		System.out.println(list1.equals(list2)); //prints true
		
		//Add a color to list2 that wasn't there before
		list2.add("pink");
		
		//remove all the items from list2 that match list1
		list2.removeAll(list1);
		System.out.println(list2); //prints [pink] because all other colors were the same
		
		//addAll(index, list) adds a new list values starting at a specified index
		//list2 only has pink rn. When we add all the items from list1 to list2 at index 0, pink becomes last item
		list2.addAll(0, list1);
		System.out.println(list2); //prints [orange, white, grey, black, pink]
		
		//clear list1 and list2 then find out if they are both empty
		list1.clear();
		list2.clear();
		System.out.println(list1.isEmpty());  //prints true
		System.out.println(list2.isEmpty());  //prints true
		
		
	}
}
