package java_Day_18;

public class Alphabet_While_loop {
	public static void main(String[] args) throws InterruptedException {
		char letter = 'a';
		
		while(letter <= 'z')	{
			System.out.print(letter + " ");
			letter++;
			//Thread.sleep(200);
	}
		System.out.println();
		
		char capital = 'A';
		while(capital <= 'Z') {
			System.out.print(capital + " ");
			capital++;
			//Thread.sleep(200);
		}
		System.out.println();
		char lowercase = 'z';
		while(lowercase >= 'a') {
			System.out.print(lowercase + " ");
			lowercase--;
		}
		
		//making a pyramid
		System.out.println();
		
		String letters = "";
		letters = letters + 'A';
			System.out.println(letters);
		
		letters = letters + 'B';
			System.out.println(letters);
		
		letters = letters + 'C';
			System.out.println(letters);
		
		char myLetter = 'A';
		
		while(myLetter <= 'Z' ) {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		}
		
		
		
		
}
}