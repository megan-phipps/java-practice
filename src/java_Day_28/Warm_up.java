package java_Day_28;
import java.util.*;
public class Warm_up {
	public static void main(String[] args) {

	//Create a String variable sentence and assign value. 
	String str = "Wildwood is a really fun place with lots of rides and a beach";
		
	//print the number of words in the string
	//assign to new String called reversed then print the reversed sentence.
	
	String [] strArray = str.split(" ");
	System.out.println("length of sentence: " + strArray.length);
	
	String reversed = "";
	
	for(int i = strArray.length-1; i >= 0; i--) {
		reversed += strArray[i] + " ";
	}
		System.out.print(reversed);
		
	System.out.println();	
		
	//Do the same thing again	
	//Create a String variable sentence and assign value. 
		
	String str2 = "You are a very interesting person";
	String[] str2Array = str2.split(" ");
	System.out.print("number of words in str2: " + str2Array.length);
	
	System.out.println();
	//print the number of words in the string
	//assign to new String called reversed2 then print the reversed sentence.
	String reversed2 = "";	
	
	for(int i = str2Array.length-1; i >= 0; i--)	{
		reversed2 += str2Array[i] + " ";
	}
	System.out.println(reversed2);
		
		
		
	//CSV - comma separated values
	
		
		
		
		
		
		
	}
}
