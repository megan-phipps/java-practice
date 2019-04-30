package java_Day_35_Easter_Review_Session;

public class Decrypt {
	  public static Character decryptChar(char ch) {
	        String alphabet = "abcdefghijklmnopqrstuvwxyz";
	        String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	        return alphabet.charAt(encrypted.indexOf(ch));
	    }
	    public static String decryptWord(String word) {
	        String result = "";
	        String alphabet = "abcdefghijklmnopqrstuvwxyz";
	        String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	        for(int i = 0; i <= word.length()-1; i++) {
	            result += decryptChar(word.charAt(i));
	        }
	        return result;
	    }
	    public static String decryptSentence(String sentence) {
//	        String[] wordsArr = sentence.toLowerCase().split(" ");
//	        String retValue = "";
//	        for(String word : wordsArr) {
//	            retValue += encryptWord(word)+" ";
//	        }
//	        return retValue.trim();
	        String [] wordsArr = sentence.split(" ");
	        String retValue = "";
	        for(int j = 0; j <= wordsArr.length-1; j++) {
	            retValue += decryptWord(wordsArr[j]) + " ";
	        }
	        return retValue.trim();
	    }
	    
	    public static void main(String[] args) {
			System.out.println(decryptSentence("qzez rh ufm"));
		}




}

