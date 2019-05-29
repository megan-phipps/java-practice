package java_Day_37;

import java.util.ArrayList;

public class Warm_up {
	public static void main(String[] args) {
		// 1) array is fixed size
		//	 arraylist size can be changed
		
		// 2) array can be of primitive type
		//    arraylist is only object type, and we need to use wrapper class
		
		// 3) array can be multi-dimensional
		//	  arraylist is a single dimensional
		
		//create arraylist shoppingList
		//add 6 items to your list
		
		//Both accept duplicates and keep the order
		
		//ArrayList methods:
			//add--> adds an item/element to ArrayList
				//list.add("java");
			//size--> returns number of elements in the list
				//list.size();
			//get--> returns value from index in the list 
				//list.get(0) => returns first element
			//remove--> from index: removes a value at the index 
				//list.remove(0) => deletes/removes first value		
			//remove-> value : removes first occurance in the list
				//list.remove("Baku")=> removes first Baku
			//add(index, value)--> add values to certain index in the list 
				//list.add(0, "Baku"); ==> puts "Baku" as first value and other values will shift to the right
			//set(index, value)--> changes/replaces value with the new value
				//list.set(1, "Paris"); ==> Index 1 will be "Paris" and old value will be removed
			//clear()--> removes all values from the list
				//list.clear();
			//isEmpty();--> returns true if list is empty or false if is not 
				//list.isEmpty() ; => true
		
		
		ArrayList <String> shoppingList = new ArrayList<>();
		
		shoppingList.add("flip-flops");
		shoppingList.add("shorts");
		shoppingList.add("tank-top");
		shoppingList.add("beach ball");
		shoppingList.add("volltball");
		shoppingList.add("baithing suit");
		
		//print number of items in shopping list
		int count = shoppingList.size();
		System.out.println("Total count: " + count);
		
		// print all items in single line
		System.out.println(shoppingList.toString());
		
		//print first and last item in single line
		System.out.println(shoppingList.get(0) + " | " + shoppingList.get(shoppingList.size()-1));
		
		//remove first item from list
		shoppingList.remove(0); // or shoppingList.remove("paper towel");
		shoppingList.remove("baithing suit");
		System.out.println(shoppingList);
		
		//print out first item in array then remove it
		shoppingList.get(0);
		shoppingList.remove(0);
		System.out.println(shoppingList);
		
		for(String item : shoppingList) {
			System.out.println(item);
		}
		
		//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList);
		
		
		
		
		
		
		
		
	}
}
