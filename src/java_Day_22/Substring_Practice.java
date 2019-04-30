package java_Day_22;

public class Substring_Practice {

	public static void main(String[] args) {
		
		String word = "java";
		System.out.println(word.substring(0,2));
		
		// print each char in separate lines using substring. No loop
		
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		int i = 0;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		
		for(int n = 0; n <=3; n++) {
			System.out.print(word.substring(n, n + 1));
		}
		System.out.println();
	
		for(int n = 3; n >= 0; n-- ) {
			System.out.print(word.substring(n, n + 1));
		}
		
		
		
		
	}
}
