package java_Day_28;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class Fast_Food_Values {
	public static void main(String[] args) throws IOException {
		//read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		
		System.out.println("Data size: " + data.length);
		
		//print first, second, and last row
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
		
		//Print each Restaurant info in separate lines
		int counter = 0;
		for(String temp: data) {
			System.out.println("#" + counter++ + " " + temp);
		}
	
		//How to find if files are identical
		//FastFoodRestaurants1.csv --> String [] data1
		//FastFoodRestaurants2.csv --> String [] data2
		//Arrays.equals(data1, data2);
		
		System.out.println("**************************************");
		
		//Print all restaurant information in state of Virginia
		counter = 0;
		System.out.println(data.length-1);
		for(String temp: data) {
			if(temp.contains(",VA,")) {
				System.out.println(temp);
				counter++;
			}
		}
		System.out.println("Number of times \"VA\" is in the document: " + counter);
			
		//Print the restaurant names in VA along with city names
		//Example: Subway - Herndon
		
		for(String temp: data) {
			if(temp.contains(",VA,")) {
				String[] tempArray = temp.split(",");
				System.out.println(tempArray[2] + " - " + tempArray[1]);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
