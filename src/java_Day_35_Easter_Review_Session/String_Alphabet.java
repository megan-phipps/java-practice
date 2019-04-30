package java_Day_35_Easter_Review_Session;

import java.util.Arrays;

public class String_Alphabet {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word = "easter";
		//encrypt this word
		//Easter = vzhgvi
		
		
		//get char from word
		//find indexOf the char in alphabet
		//read the char from encrypted at that index
		//add to some String
		
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('p'));
		
		System.out.println(encryptChar('e'));
		
		System.out.println("********************");
		
		char first = word.charAt(0);  //find char at position 0
		int position = alphabet.indexOf(first);  //find where the character is in the original alphabet
		char enChar = encrypted.charAt(position);//
		System.out.println(first + "--->" + enChar);
		
		System.out.println("********************");
		for(int i = 0; i <= word.length()-1; i++) {
			String encryptedWord = "";
			char ch = word.charAt(i);	
			//find in alphabet 
			int index = alphabet.indexOf(ch);
			System.out.println(encrypted.charAt(index));
			encryptedWord += encrypted.charAt(index);
			
			String normal = "sunday";
			String encrypt = encryptWord(normal);
			System.out.println("normal: " + normal + "\n" + "encrypt: " + encrypt);
	}
	
		System.out.println("**********************");
		
		for(int i = 0; i <= word.length()-1; i++) {
			String encryptedWord = "";
			int index = alphabet.indexOf(word.charAt(i));
			System.out.println(encrypted.charAt(index));
			encryptedWord += encrypted.charAt(index);
		}
		
		
		
		System.out.println(encryptSentence("I went to the mall"));
	}
		
		
//		public static char encryptChar(char ch) {
//			alphabet = "abcdefghijklmnopqrstuvwxyz";
//			encrypted ="zyxwvutsrqponmlkjihgfedcba";
//			encrypted.charAt(alphabet.indexOf(ch));
//			
//	}
		public static char encryptChar(char ch) {
			String alphabet = "abcdefghijklmnopqrstuvwxyz";
			String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;	
  }
		public static String encryptWord(String word) {
			String ciphered = "";
			for(int i = 0; i <= word.length()-1; i++) {
				ciphered += encryptChar(word.charAt(i));
			}
			return ciphered;
		}
		
		public static String encryptSentence(String sentence) {
			String [] wordsArr = sentence.split(" ");
			String retValue = "";
			for(int i = 0; i <= wordsArr.length-1; i++) {
				 retValue += encryptWord(wordsArr[i]) + " ";
				
			}
			return retValue.trim();
		}
//		String[] wordsArr = sentence.toLowerCase().split(" ");
//        String retValue = "";
//        for(String word : wordsArr) {
//            retValue += encryptWord(word)+" ";
//        }
//        return retValue.trim();
    }
		
    

