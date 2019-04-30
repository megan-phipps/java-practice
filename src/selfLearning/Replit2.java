package selfLearning;
import java.util.Arrays;
import java.util.Scanner;
public class Replit2 {
	
		  
		  public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		   
			Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		  
		    String [] personArray = s.split(",");
		    System.out.println(Arrays.toString(personArray));
		    System.out.println(personArray[0] + " " + personArray[1] + " " + personArray[2]);
		
		  }
		  
		   public static void person(String info) {
			
				//your code here
			   	Scanner inp = new Scanner(System.in);
			    String s = inp.next();
			    person(s) ;
			  
			    String [] personArray = s.split(",");
			    System.out.println(Arrays.toString(personArray));
			    System.out.println(personArray[0] + " " + personArray[1] + " " + personArray[2]);
			
			}//end person
		  
		
	
}
