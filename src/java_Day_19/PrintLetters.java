package java_Day_19;

public class PrintLetters {
	public static void main(String[] args) {

		String word = "Amazon";
		int idx = 0;
//
//		// print each character one by one in separate lines
//
//		while (idx < word.length()) {
//			System.out.println(word.charAt(idx++));
//		}
//		
		
		//print each character in the reverse order
		
		idx = word.length()-1;
		
		while(idx >= 0) {
		System.out.println(word.charAt(idx--));
		}
	}
}
