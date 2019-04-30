package after_class_recap;
import java.util.*;
public class Java_Day_26_Recap_Arrays_And_Split {
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
   System.out.println(names.length);
	
    System.out.println("*****************");
  
  //print all the names in a single line
    System.out.print(Arrays.toString(names));
  
  
  System.out.println("*****************");
  
  //print 2 names in one line
  for(int i = 0; i <= names.length-1; i+=2) {
	  System.out.println(names[i] + ", " + names[i+1]);
  }
  
  System.out.println("*****************");
  

  
  //print men's names in a single line separated by a comma
  for(int i = 0; i<=names.length-1; i+=2) {
	  System.out.print(names[i] + ", ");
  }
  
  System.out.println();
  System.out.println("*****************");
  
  
  
  //print womens names in a single line separated by a comma without comma at the end
  for(int i = 0; i <=names.length-1; i+=2) {
	  if(i == names.length-2) {
		  System.out.print(names[i+1]);
	  }else{
		  System.out.print(names[i+1] + ", ");
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
 
	  for(String temp: names) {
		  if(temp.length() <= 4) {
	  System.out.print(temp.toUpperCase() + ", ");
  }
  }
  
  
  System.out.println();
  System.out.println("*****************");
  
//  //same as above using for each loop
//  
//  System.out.println();
//  System.out.println("*****************");
//  System.out.println();
//  
//  System.out.println("********\n NAMES LENGTH SORT*********");
//  String namesUpTo4 = "";
//  String names5to6 = "";
//  String names7orMore = "";
//  
//  //sort names into categories
//
//  
//  System.out.println("*****************");
//  
//  //make men and women trade places
//  // below is the logic
////    String str1 = "first word";
////    String str2 = "second word";
////    
////    String  temp = str1;
////    str1 = str2;
////    str2 = temp;
//  
//  //now execute
    
 //****************************************************************************************************************
		
    	
    	String words = "java,kava,html,selenium";
		//Use the split method to separate "java,kava,html,selenium" at every comma
	
		
		//Count how many words are in the String words shown above
			
		
		//Print java,kava,html,selenium in a single line 
		
		
		//Print java,kava,html,selenium on different lines by using a for each loop
			
			
		String diceResult = "1 - 20 of 1,461 positions";
		//Split the String at every space. 
		
		
		//Print out 1,461
		
		
		//If you split the sentence above at the word "of" how many indexes will you have?
		// Split the sentence at "of" and get rid of the empty space at the end.
		
			
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		//create one array split by spaces, another split by "i" and another split by happy, then print them out
		
		
		
		//toCharArray
		String word = "java";
		//use toCharArray to make each character its own line
		
		
		
	
    
}
}
