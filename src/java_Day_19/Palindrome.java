package java_Day_19;

import java.util.*;

public class Palindrome {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String word = "civic";
		String reversed = "";

		// loop through word in reverse order and concatenate each character to reverse
		// String
		// compare if word and reversal are equal

		int idx = word.length() - 1;

		while (idx >= 0) {
			reversed += word.charAt(idx);
			idx--;
		}

		if (reversed.equalsIgnoreCase(word)) {
			System.out.println(word + " is a palindrome");
		} else {
			System.out.println(word + " is not a palendrome");
		}

	}

}
