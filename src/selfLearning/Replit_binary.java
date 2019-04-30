package selfLearning;
import java.util.*;
public class Replit_binary {
		 public static void main(String[] args) {
			    Scanner input = new Scanner(System.in);
			    
			    int decimal = input.nextInt();
			    int[] binary = new int[8];
			    
			    //TODO: Write your code below.
			    for(int temp: binary){
			    	int division = temp / 128;
			    	int remainder = temp % 128;
			    	remainder /= 64;
			    	
			    }

		 
		 
		 
		 }
}
