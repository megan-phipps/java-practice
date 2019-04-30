package java_Day_26;

import java.util.*;

public class Warm_Up {
	public static void main(String[] args) {
		
		String[] names =   {"James","Mary",
							"John","Patricia",
							"Robert","Jennifer",
							"Michael","Linda",
							"William","Elizabeth",
							"David","Barbara",
							"Richard","Susan",
							"Joseph","Jessica",
							"Thomas","Sarah",
							"Charles","Margaret",
							"Christopher","Karen",
							"Daniel","Nancy",
							"Matthew","Lisa",
							"Anthony","Betty",
							"Donald","Dorothy",
							"Mark","Sandra",
							"Paul","Ashley",
							"Steven","Kimberly",
							"Andrew","Donna",
							"Kenneth","Emily",
							"George","Carol",
							"Joshua","Michelle",
							"Kevin","Amanda",
							"Brian","Melissa",
							"Edward","Deborah",
							"Ronald","Stephanie",
							"Timothy","Rebecca",
							"Jason","Laura",
							"Jeffrey","Helen",
							"Ryan","Sharon",
							"Jacob","Cynthia",
							"Gary","Kathleen",
							"Nicholas","Amy",
							"Eric","Shirley",
							"Stephen","Angela",
							"Jonathan","Anna",
							"Larry","Ruth",
							"Justin","Brenda",
							"Scott","Pamela",
							"Brandon","Nicole",
							"Frank","Katherine",
							"Benjamin","Samantha",
							"Gregory","Christine",
							"Raymond","Catherine",
							"Samuel","Virginia",
							"Patrick","Debra",
							"Alexander","Rachel",
							"Jack","Janet",
							"Dennis","Emma",
							"Jerry","Carolyn",
							"Tyler","Maria",
							"Aaron","Heather",
							"Henry","Diane",
							"Jose","Julie",
							"Douglas","Joyce",
							"Peter","Evelyn",
							"Adam","Joan",
							"Nathan","Victoria",
							"Zachary","Kelly",
							"Walter","Christina",
							"Kyle","Lauren",
							"Harold","Frances",
							"Carl","Martha",
							"Jeremy","Judith",
							"Gerald","Cheryl",
							"Keith","Megan",
							"Roger","Andrea",
							"Arthur","Olivia",
							"Terry","Ann",
							"Lawrence","Jean",
							"Sean","Alice",
							"Christian","Jacqueline",
							"Ethan","Hannah",
							"Austin","Doris",
							"Joe","Kathryn",
							"Albert","Gloria",
							"Jesse","Teresa",
							"Willie","Sara",
							"Billy","Janice",
							"Bryan","Marie",
							"Bruce","Julia",
							"Noah","Grace",
							"Jordan","Judy",
							"Dylan","Theresa",
							"Ralph","Madison",
							"Roy","Beverly",
							"Alan","Denise",
							"Wayne","Marilyn",
							"Eugene","Amber",
							"Juan","Danielle",
							"Gabriel","Rose",
							"Louis","Brittany",
							"Russell","Diana",
							"Randy","Abigail",
							"Vincent","Natalie",
							"Philip","Jane",
							"Logan","Lori",
							"Bobby","Alexis",
							"Harry","Tiffany",
							"Johnny","Kayla"};
		
		//Print out the number of names in the list
		System.out.println("Number of names in the list: " + names.length);

		System.out.println("*****************");
		
		//print all the names in a single line
		//to print names in a single line, use Arrays.toString
		System.out.println("Names in a single line: " + Arrays.toString(names));
		
		System.out.println("*****************");
		
		//print 2 names in one line
		//to print 2 names in one line use a for loop that counts by 2
		for(int i = 0; i <= names.length-1; i+=2) {
			System.out.println("2 Names on one line: " + names[i] + ", " + names[i+1]);
		}
		System.out.println("*****************");
		
		//print female names only
		for(int i = 0; i <= names.length-1; i+=2) {
			System.out.print(names[i+1] + ", ");
		}
		System.out.println();
		System.out.println("*****************");
		//Second way to print out womens names only
		for(int i = 0; i <= names.length-1; i++) {
			if(i % 2 == 1) {
			System.out.print(names[i] + ", ");
		}
		}
		System.out.println();
		System.out.println("*****************");
		
		//print male names in a single line separated by a comma
		for(int i = 0; i <= names.length-1; i+=2) {
			System.out.print(names[i] + ", ");
		}
		System.out.println();
		System.out.println("*****************");
		
		//Print mens names another way
		for(int i = 0; i <=names.length-1; i++) {
			if(i % 2 == 0) {
				System.out.print(names[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("*****************");
		
		//print female names in a single line separated by a comma without comma at the end
		for(int i = 0; i <= names.length-1; i+=2) {
			if(i == names.length-2) {
				System.out.print(names[i + 1]);
			}else {
				System.out.print(names[i + 1] + ", ");
			}
		}
		
		System.out.println();
		System.out.println("*****************");
		
		//Print one random name from the array
		//use random class
		//Import random.
		
		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.println(names[r]);
		
		
		System.out.println("*****************");
		
		//print all names up to 4 characters, uppercase, in the same line
		for(String temp: names ) {
			if(temp.length() <= 4) {
				System.out.print(temp.toUpperCase() + ", ");
			}
		}
		
		System.out.println();
		
		
		//same as above using for each
		
	
		
		
		System.out.println("********** NAMES LENGTH SORT*********");
		String namesUpTo4 = "";
		String names5to6 = "";
		String names7orMore = "";
		
		//sort names into categories
		for(String temp: names) {
			if(temp.length() <= 4) {
				namesUpTo4 += temp + ", ";
			}else if(temp.length() >= 5 && temp.length() <= 6) {
				names5to6 += temp + ", ";
			}else if(temp.length() >= 7) {
				names7orMore += temp + ", ";
			}
		}
		System.out.print(namesUpTo4.substring(0, namesUpTo4.length()-2));
		System.out.println();
		System.out.print(names5to6.substring(0, names5to6.length()-2));
		System.out.println();
		System.out.print(names7orMore.substring(0,names7orMore.length()-2));
	
		System.out.println();
		System.out.println("*****************");
		
		//make men and women trade places
		// below is the logic
//		String str1 = "first word";
//		String str2 = "second word";
//		
//		String  temp = str1;
//		str1 = str2;
//		str2 = temp;
		
		//now execute
		
		for(int i = 0; i <= names.length-1; i+=2) {
		String temp = names[i];
		names[i] = names[i+1];
		names[i+1] = temp;
		}
				
		System.out.println(Arrays.toString(names)); //updating the array in the loop
		
		
//		//String methods: length, charAt, indexOf
//		//split, toCharArray
//		//Split method in String class
//			//takes a delimiter and splits/chops String value 
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
}
}

