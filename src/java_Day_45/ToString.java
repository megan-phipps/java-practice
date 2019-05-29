package java_Day_45;

import java.util.Arrays;
public class ToString {
	
	public static void printArray(String[] stringArray) {
		for(String temp: stringArray) {
			System.out.print(temp + " ");
		}
	}
	
	public static String[] getWeekdays(){
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
			return weekdays;
		}

	
	
	public static void main(String[] args) {
		
	
	String[] students = new String[3];
	students[0] = "Anna";
	students[1] = "Javez";
	students[2] = "Lulu";
	
	printArray(students);
	System.out.println();
	System.out.println("**************************************");
	
	//System.out.println(Arrays.toString(students));
	
	
		String[] days = getWeekdays();
		printArray(days);
		System.out.println();

		String [] students2 = {"Zac", "Adam", "Stephanie"};
		Arrays.sort(students2);
		System.out.println(Arrays.toString(students2));

		printArray(students2);
	
	
	}
}
