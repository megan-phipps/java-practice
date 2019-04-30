package java_Day_23;

public class Continue {
	public static void main(String[] args) {
		//print numbers 1-20, skip numbers from 5 - 10
		
		
		for(int i = 1; i <= 20; i++) {
			if(i >= 5 && i <= 10) {
				continue;	
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}
}
