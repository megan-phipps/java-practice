package java_Day_20;

public class Print_Each_Char {
 
	public static void main(String[] args) {
		
		String word = "amazon";
		
		//using for loop print each char 1 by 1
		for(int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
			
		}
		
		//using for loop print only consonants
		
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (letter != 'a' || letter != 'e' || letter != 'i' || letter != 'o' || letter != 'u') {
				System.out.print(letter + ", ");
		}
		System.out.println();
		//using for loop print only vowel
		
		for(i = 0; i < word.length(); i++) {
			letter = word.toLowerCase().charAt(i);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				System.out.print(letter + ", ");
			}
		}
		
		}
		}
}

