package selfLearning;

import java.lang.reflect.Method;
import java.util.Arrays;

public class HowToDoArrays {
	public static void main(String[] args) {
		
		//declaring arrays 
		int [] num = new int[3];
		
		//assign 3 values in the array
		num[0] = 5;
		num[1] = 10;
		num[2] = 20;
		
		//call upon / print out one index of an array
		System.out.println(num[1]);
		//prints 10
		
		//to print out a whole array use Arrays.tostring method. THIS WILL CONVERT ARRAY TO A STRING even if it is an int.
		//to use this method you must import the arrays class, just like when you use scanner, you have to import the scanner class
		System.out.println(Arrays.toString(num));
		//prints [5, 10, 20]
		
		
		//loop through an array using for loop
		int sum = 0;
		
		for(int i = 0; i <= num.length-1; i++) {
			sum+= num[i];
		}
		System.out.println(sum);
		//need to use num.length-1 so the loop goes from index 0, 2. 
	
		//find the largest value in the array
		//integer.MIN_VALUE assigns to the lowest value of int
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <= num.length-1; i++) {
			if(num[i] > max) {
				max = num[i];
		//need to keep reassigning max
			}
		}
		System.out.println(max); //20
		
		//find the smallest value in the array
		//integer.MAX_VALUE assigns to the largest value of int
		int min = Integer.MAX_VALUE;
		for(int i = 0; i <= num.length-1; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(min); //5
		
		//put the value of the sentence in an array
		
		String sentence = "Java is a general-purpose computer-programming "
        + "language that is concurrent, class-based, object-oriented, "
        + "and specifically designed to have as few implementation dependencies as possible.";
		
		//.split splits a string and puts it in an array
		//give your string a name(words) = sentence, the variable above. .split will spilt the sentence at a specified point. 
		//this is called the delimiter. A delimiter is something that you specify
		//In this case, the delimiter is the space. 
		
		//.split is just another method like toString is a method
		//To print it out you need to use a loop, can be for loop or for each. For each is easier
		String[] words = sentence.split(" ");
		
		
		//using the for each loop to print it out
		for(String temp: words) {
			System.out.print(temp);
		}
		//you need to create a temporary variable, this is temporary because it will change with every iteration
		
		
		//Skip a word in the array
		for(String temp2: words) {
			if(temp2.equals("class-based,")) {
				continue;
			}else {
				System.out.println(temp2);
			}
		}
		
		//you want to find the index of a word in an array you can't use indexOf because that's a String Method
		//below is a was you find the position of "language" in the sentence with the name "sentence" above.
		//words is our array
		int count = 0;
		
		for(String temp3: words) {
			if(temp3.equals("language")) {
				break;
			}else {
				count++;
			}
		}
		System.out.println(count);
		//Every time we loop, temp3 holds a new value. If that value equals language then break. 
		//Up until language we are counting every index before language to find the index of language.
		
		String java = "java";
		
		for(int i = 0; i <= java.length()-1; i++) {
			System.out.println(java.charAt(i));
		}
		for(int i = 0; i <= words.length-1; i++) {
			System.out.println(words[i]);
		}
		String backwards = "";
		for(int i = words.length-1; i >= 0; i-- ) {
			backwards+= words[i] + " ";
			
		}
		backwards = backwards.trim();
		System.out.println(backwards);
		String first3 = "";
		
		for(String temp4: words) {
			if(temp4.length()-1 < 3) {
				System.out.println(temp4);
			}else {
				System.out.println(temp4.substring(0, 2));
			}
		}
		
		
		
	}
}
