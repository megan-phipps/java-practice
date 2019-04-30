package java_Day_29;

import java.util.Arrays;

public class Countries {
	public static void main(String[] args) {

	String [][] countries = {
							{"USA","Washington DC"},
							{"Canada", 	"Ottawa"},
							{"Mexico","Mexico city"},
							{"Brasil","Brasilia"},
							{"Peru", "Lima"},
							{"Argentina", "Boanes Aeros"},
							{"Bolivia","La Paz"},
							{"Macedonia","Scopia"},
							{"Kazakhstann","Nursultan"}
							};
	
	//Print USA, Waashington D.C.
	System.out.println(countries[0][0] + ", " + countries[0][1]);
	
	//print Kazakhstann, Nursultan
	System.out.println(countries[8][0] + ", " + countries[8][1]);
	
	//Print all countries and capitals
	System.out.println(Arrays.deepToString(countries));
	
	//print Canada only
	System.out.println(countries[1][0]);
	
	//Print Mexico only
	System.out.println(countries[2][0]);
	
	//print countries with for loop
	for (int i = 0; i <= countries.length-1; i++) {
		System.out.print(countries[i][0] + "| ");
	}
	
	System.out.println();
	//print countries with for each loop
	for(String[] temp: countries) {
		System.out.print(temp[0] + "| "); //temp represents every column
	}
	
	//get all the cities and add to cities[] array
	String[] cities = new String[countries.length];
	Arrays.toString(cities);
	
	System.out.println();
	System.out.println("******************************");
	
	for(int i = 0; i <= countries.length-1; i++) {
		cities[i] = countries[i][1];
	}
	System.out.println(Arrays.toString(cities));
	
	
	System.out.println("******************************");
	//get all countries and add to countries2 [] array
	//for()
	
	
	//Look for Bolivia and see if it matches La Paz
	//test to see if each country matches the capital 
	for(int row = 0; row <= countries.length-1; row++) {
		if(countries[row][0].equals("Bolivia") ) {
			System.out.println(countries[row][1]);
		}
	}
	
	System.out.println("******************************");
	
	//Look for Bolivia and see if it matches La Paz
	//test to see if each country matches the capital 
	for(int row = 0; row <= countries.length-1; row++) {
		if(countries[row][0].equals("Bolivia") ) {
			if(countries[row][1].equals("La Paz")){
				System.out.println("Bolivia test passed");
			}else {
				System.out.println("Bolivia test failed");
			}
		}
	}
	
	System.out.println("******************************");
	
	
	//Methods
	//method is an action/behavior/command
	//methods provide behavior for a class
	
	//class has 2 things: data/properties & methods
	
	//Ex: Student has name, age, email, phone number, student ID
	//Ex: Student has behaviors: study, code, eat food, play ping pong
	
	//we have been using ready made methods like from the String class
	//today we will learn how to write our own
	//by learning to write custom methods, we will have a chance to review past material
	//Why do we need custom methods?
	  //code reusability and maintainability are key to being a good programmer
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
