package java_Day_24;

public class Split_Sentence {
	public static void main(String[] args) {
		int counter = 0;
		String sentence = "Java is a general-purpose computer-programming "
				+ "language that is concurrent, class-based, object-oriented, "
				+ "and specifically designed to have as few implementation "
				+ "dependencies as possible.";
		
		String[] words = sentence.split(" ");
		for(String str: words) {
			if(str.equals("language")) {
				break;
			}
			counter++;
		}
		
		
		System.out.println();
		System.out.println("position: " + counter);
		System.out.println(words[counter]);
		
		
	}
}
