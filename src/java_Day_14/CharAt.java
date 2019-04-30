package java_Day_14;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		//print all characters one by one
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		//String word2 and check if first character is 'J'
		
		String word2 = "Java";
		
		if(word2.charAt(0) == ('J'))
			System.out.println(word2 + " starts with 'J'");
		
		//string word3 consists of 5 char
		//check if first and last chars are the same
		
		String word3 = "civic";
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
		if(first == last) {
			System.out.println("first and last match");
		}else
			System.out.println("Do not match");
		
		//String word4 ==> always print the last character no matter the length.
		
		String word4 = "abcdefgieurf1321u849";
		
		char lastchar = word4.charAt( word4.length()-1);
		System.out.println("last value of " + word4 + " is " + lastchar);
	}
}
