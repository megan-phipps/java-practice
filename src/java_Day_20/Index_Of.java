package java_Day_20;

public class Index_Of {

	public static void main(String[] args) {

		String word = "Amazon";
		System.out.println(word.indexOf("m"));

		char letter = 'a';
		int index = -1;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				index = i;
				break;
			}
		}
		
		System.out.println("Index: " + index);

	}
}
