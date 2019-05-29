package java_Day_39;
import java.util.*;
public class Warm_up_Cities {
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		 	cities.add("Tokyo");
	        cities.add("New York");
	        cities.add(0,"Paris");
	        cities.add("Pittsburgh");
	        cities.add(1,"Berlin");
	        cities.add("Madrid");
	        cities.add("Moscow");
	        cities.add("Istanbul");
	        cities.add("Washington D.C.");
	        cities.add("Amsterdam");
	        cities.add("Zurich");
	        cities.add("Singapore");
	        cities.add("Milan");
	        cities.add("Toronto");
	        cities.add("London");
	        cities.add("Lima");
	
	//print each city in the same line separated by | using a for each loop
	   for(String city: cities) {
		   System.out.print(city + " | ");
	   }
	   System.out.println();
	 //print each city in the same line separated by | using a for loop        
	  for(int i = 0; i <= cities.size()-1; i++) {
		  System.out.print(cities.get(i) + " | ");
	  }
	  System.out.println();
	 //ToString. Print each city all uppercase
	 System.out.println(cities.toString().toUpperCase());  
	 
	
	 //Make each city all uppercase using for loop then print
	 for(int i = 0; i <= cities.size()-1; i++) {
		 cities.set(i, cities.get(i).toUpperCase());
	}
	 System.out.println(cities);
	 
	 //Find the longest and shortest city
	 String longestCity = "";
	 String shortestCity = "";
	 
	 //STUDY THIS!!!
	 for(String city: cities) {
		 if(city.length() > longestCity.length()) {
			 longestCity = city;
		 }
	 }
	 shortestCity = cities.get(0);
	 for(String city: cities) {
		 if(city.length() < shortestCity.length()) {
			 shortestCity = city;
		 }
	 }
	 System.out.println(longestCity);
	 System.out.println(shortestCity);
	 
	 ArrayList<String> citiesMoreThan6 = new ArrayList<>();
	 //assign all cities that have more than 6 chars to this arraylist
	 
	 for(String ct: cities) {
		 if(ct.length() > 6) {
			 citiesMoreThan6.add(ct);
		 }
	 }
	 System.out.println(citiesMoreThan6);
	 
	 
	 
  }
}
	
	
