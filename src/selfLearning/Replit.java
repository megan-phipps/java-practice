package selfLearning;

import java.util.Arrays;
import java.util.Scanner;

public class Replit {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	   
	 
	    for(int i = 0; i <= binary.length-1; i++){
	    	if(decimal%2 == 0) {
	    		binary[i] = 0;
	    		decimal = decimal/2;
	    		
	    	}else {
	    		binary[i] = 1;
	    		decimal = decimal/2;
	    	}
	   
	    	
	    	
	    	
	    	
	    }
	      
	     System.out.println(Arrays.toString(binary));
	 		}
	    
	    
	  
	}
	

