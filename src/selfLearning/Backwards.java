package selfLearning;
import java.util.*;
public class Backwards {
	public static void main(String[] args) {
		
		int num = 3773;
		int backwards = 0;
	    int num2 = num;
	    while (num2 > 0){
	        backwards = backwards * 10;
	        backwards = backwards + num2 % 10;
	        num2 = num2 / 10;
	    }
	    if(backwards == num){
	      System.out.println(true);
	    }else{
	      System.out.println(false);
	    }
	}
}

	