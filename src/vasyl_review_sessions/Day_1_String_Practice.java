package vasyl_review_sessions;

public class Day_1_String_Practice {
	public static void main(String[] args) {
		//What does immutable mean in terms of String
		//In order to change the value you need to reassign it
		
		//literal
		String word = "java";
		word = word.toUpperCase();
		
		//
		String word2 = new String("java");
		word2 = word2.toUpperCase();
		System.out.println(word);
		System.out.println(word2);
		System.out.println(word == word2);
		
		//String pool- when you create a String in double quotes. Helps to save memory which 
		//is why it's better to create a String in this way. If previous word is used it will point
		//to that String object and reuse
		
		//Java heap - when you create a String by doing String word2 = new String("java");
		
		//Use .equals because it checks if each character is the same, not the position in memory
		
		
	}
}
