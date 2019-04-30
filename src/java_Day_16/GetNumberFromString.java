package java_Day_16;

public class GetNumberFromString {
	public static void main(String[] args) {
		String sentence = "I wrote [236] lines of code today";
		
		int start = sentence.indexOf("[")+1;
		int stop = sentence.indexOf("]");
		
		String codeCount = (sentence.substring(start, stop));
		
		System.out.println("" + sentence.substring(sentence.indexOf("[")+1, sentence.indexOf("]")));
		
		//check if codeCount is more than 10
		
		
		int count = Integer.parseInt(codeCount);
		
		if(count > 20) {
			System.out.println("Wrote more than 20 lines of code today");
		}else {
			System.out.println("wrote less than 20 lines of code");
		}
		
		
		String word = "java";
		System.out.println(word.substring(2));
		
		String word2 = "Coffee cup";
		System.out.println(word2.substring(7));
		
		
		
		
		
		
		
		
		
	}
}
