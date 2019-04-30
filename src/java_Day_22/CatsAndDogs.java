package java_Day_22;

public class CatsAndDogs {
	public static void main(String[] args) {
		String str = "mycatyourcat";
		//count how many cats
		int count = 0;
		
		for(int i = 0; i <= str.length()-3; i++) {
			String something = str.substring(i, i + 3);
			if(something.equals("cat")) {
				count++;
			}
			
		}
		
		//rewrite 
		
		String word = "xjava";
		
		if(word.substring(0,4).equals("java") || word.substring(1,5).equals("java")){
		      System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("hi");
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
