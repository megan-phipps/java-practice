package book_problems;

public class Chapter2 {
	public static void main(String[] args) {
		
		System.out.println("Test 1 " + 10 * 3 * 2.0);
		System.out.println("Test 2 " + (10 * 3 + 2.0));
		System.out.println("Test 3 " + (10 * 3 - 2.0));
		
		String hello = "Hello, my good friend!";
		
		String firstWord = (hello.substring(0, hello.indexOf(",")));
		System.out.println(firstWord);
		
		String secondWord = hello.substring(firstWord.indexOf(", " + 1));
		System.out.println(secondWord);
		
		
		
		
	}


}
