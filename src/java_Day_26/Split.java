package java_Day_26;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		//Use the split method to separate "java,kava,html,selenium" at every comma
		//have to change it to an array first
		String [] myWords = words.split(",");
		for(int i = 0; i <= myWords.length-1; i++) {
			System.out.println(myWords[i]);
		}
		
		//Count how many words are in the String words shown above
		System.out.println("length of String: " + myWords.length);
		
		//Print java,kava,html,selenium in a single line 
		System.out.println(Arrays.toString(myWords));
		
		//Print java,kava,html,selenium on different lines by using a for each loop
		for(String temp: myWords) {
			System.out.println(temp);
		}
			
		String diceResult = "1 - 20 of 1,461 positions";
		//Split the String at every space. 
		String [] diceArray = diceResult.split(" ");
		
		//Print out 1,461
		
		
		//If you split the sentence above at the word "of" how many indexes will you have?
		//2
		// Split the sentence at "of" and get rid of the empty space at the end.
	
			
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		//create one array split by spaces, another split by "i" and another split by happy, then print them out
		
		
		
		//toCharArray
		String word = "java";
		//use toCharArray to make each character its own line
		
		
		
	}
}
