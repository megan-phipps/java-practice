package book_problems;

import java.util.*;
public class Replit {
	public static void main(String[] args) {
	    String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
	    
	    char alphabet = 'a';
	    for(int i = 0; i <= 7 ; i++){  
	      for(int q = 1; q <= 8; q++){
	    	  chessBoard[i][q-1] = "" + q +alphabet; 
	    	  alphabet++;
	        }
	      	alphabet = 'a';
	        }
	        
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));
	  
	}
}
