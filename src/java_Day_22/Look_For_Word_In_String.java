package java_Day_22;

public class Look_For_Word_In_String {
	public static void main(String[] args) {
		String sentence = "He said hi, then she replied hi. hi guys!";
		
		
		// print letters in pairs, count number of times "hi" appears in sentence.
		
		int count = 0;
				
		for(int i = 0; i < sentence.length()-1; i++) {
			String temp = sentence.substring(i, i + 2);
			System.out.println(temp);
				if(temp.equals("hi")) {
					count++;
				}
		}
	
		
		
	}
}
