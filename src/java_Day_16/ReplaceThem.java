package java_Day_16;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		
		//replace , with !!!
		
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		String mixed = "*@&$#^*ja-v|a*(#@^";
		
		mixed = mixed.replace("*@&$#^*" , "");	
				System.out.println(mixed);
			
		mixed = mixed.replace("-", "").replace("|", "").replace("*(#@^", "");
			System.out.println(mixed);	
				
		//////////////////////////////////////////////////////////////////////////////////////
		
		String result = "About 115,000,000 results (0.59 seconds)";
				result = result.replace("About " , "");
				System.out.println(result);
				
		result = result.substring(0, result.indexOf(" "));
		System.out.println(result);
		
		result = result.replace(",", "");
				System.out.println(result);
				
				
				
				
				
	}
}
