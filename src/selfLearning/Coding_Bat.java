package selfLearning;

public class Coding_Bat {
	public static void main(String[] args) {
		  String a = "";
		  String b = "volcano";
			String lastChars = "";
		   
		  if(a.length() == 0 && b.length() == 0){
		    lastChars = "@@";
		  }else if(a.length() == 0){
		    lastChars = "@" + b.charAt(b.length()-1);
		  }else if(b.length() == 0){
		    lastChars = a.charAt(0) + "@";
		  }else{
		    lastChars = "" + a.charAt(0) + b.charAt(b.length()-1);
		  }
	}
}
