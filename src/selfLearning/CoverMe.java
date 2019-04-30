package selfLearning;

public class CoverMe {
	public static void main(String[] args) {
	    System.out.println(coverString("apple pearspearsapple", "pears") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
	    String a = "";
	     if(coverME.length() >= main.length()){
	       a = "[" + main + "]";
	     }else if(!main.contains(coverME)){
	       a = "[" + main + "]";
	     }else{
	        for(int i = 0; i <= main.length() - coverME.length(); i++){
	           String word = main.substring(i, i + coverME.length());
	              if(word.equals(coverME)){
	                a += "[" + coverME + "]";
	                i+=coverME.length()-1;
	              }else if(i == main.length() - coverME.length() && !word.equals(coverME)){
	                a+=word;
	              }else{
	                a += main.charAt(i);
	              }
	  }
	  
	}
	return a;
	}
	}

