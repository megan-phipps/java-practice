package java_Day_37;
import java.util.*;
public class MyCities {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		
		//print each city using for each loop separated by space
		for(String city: cities) {
			System.out.print(city + " ");
		}
		System.out.println();
		System.out.println("***************************************");
		for(int i = 0; i <= cities.size()-1; i++) {
			System.out.print(cities.get(i) + " ");
		}
		System.out.println();
		System.out.println("***************************************");
		//remove Baku. Will only remove the first occurance of Baku
		cities.remove("Baku");
		System.out.println(cities);
		
		//remove New York
		cities.remove("New York");
		//does not remove b/c New York is not present
		
		//isEmpty?
		System.out.println("Is list empty? " + cities.isEmpty());
		cities.add(0, "Bishkek");
		System.out.println(cities.toString());
		
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());
		
		//replace Barnaul with Seoul
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		//find Sterling in the list and give the index
		int idx = cities.indexOf("Sterling");
		System.out.println("Sterling index: " + idx);
		
		cities.set(idx, "Zagreb");
		System.out.println(cities.toString());
		
		//clear the arraylist
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("empty: "  + empty);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
