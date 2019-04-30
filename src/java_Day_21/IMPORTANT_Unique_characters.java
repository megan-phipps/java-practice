package java_Day_21;

public class IMPORTANT_Unique_characters {

	public static void main(String[] args) {
		
		//****** IMPORTANT given a String word, print out unique characters from the word.
				
				String word = "javva";
				//print jav
				
				String unique = "";
				
				char ch = word.charAt(0);
				System.out.println(unique.contains("" + ch));
				if(!unique.contains("" + ch)) {
					unique+= ch;
				}
				
				System.out.println("unique: " + unique);
				
			// another way is this:
				
			if(unique.indexOf(ch) == -1){
				unique+= ch; 
			}
			
			
		String word2 = "bananas";
		String unique2 = "";
		
		int i = 0;
		char ch2 = word2.charAt(i);
		System.out.println("ch2: " + ch2);
				
		
		
		
		
		
		
		
		
		
		
		
	}
}
