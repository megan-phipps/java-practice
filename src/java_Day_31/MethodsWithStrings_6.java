package java_Day_31;
import java.util.*;
public class MethodsWithStrings_6 {
	public static void main(String[] args) {
		
		/*
		 * name: countWords
		 * return: void
		 * params: String sentence
		 * 
		 * countWords("Java is fun");
		 * "Words in this sentence [Java, is, fun]"
		 * "Number of words: 3"
		 */
		countWords("Java is fun");
		googleSearchResults("About 121,000,000 resullts (0.75 seconds)");
	}
	
	public static void countWords(String sentence) {
		int count = 0;
		String [] sentenceArray = sentence.split(" ");
	
		for(String temp: sentenceArray) {
			count++;
		}
		System.out.println(Arrays.toString(sentenceArray));
		System.out.println("Number of words: " + count);
	}
	
	
	//method name: googleSearchResults
	//Results count: 121000000;
	//time in seconds: 0.75
	//String result = "About 121,000,000 resullts (0.75 seconds)";
	public static void googleSearchResults (String result ) {
		String[] googleArray = result.split(" ");
		String count = googleArray[1].replace(",", "");
		String seconds = googleArray[3].replace("(" , "");
		
		
		System.out.println("Results count: " + count);
		System.out.println("Time in seconds: " + seconds);
	}
	
	

}
