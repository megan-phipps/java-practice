package java_Day_40;

import java.util.ArrayList;

public class Warm_up {
	public static void main(String[] args) {
		
		ArrayList<String> Arr = new ArrayList<>();
		Arr.add("yellow");
		Arr.add("green");
		Arr.add("pink");
		Arr.add("pink");
		Arr.add("pink");
		Arr.add("purple");
		System.out.println(countOccurances(Arr, "pink"));
	}
	
	public static int countOccurances(ArrayList<String> Arr, String word) {
		int count = 0;
		for(String temp: Arr) {
			if(temp.equals(word)) {
				count++;
			}
		}
		return count;
	}
}
