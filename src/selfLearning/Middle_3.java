package selfLearning;
import java.util.*;
public class Middle_3{
	public static void main(String[] args) {
	
		
	String str;
	System.out.println("print");
	Scanner scan = new Scanner(System.in);
		str = scan.next();
	if(str.length() % 2 == 1 && str.length()>= 5){
	    System.out.println(str.substring(str.length()/2-1, str.length()/2+2));	    
	}else {
	System.out.println("invalid");
}
}
}
	

