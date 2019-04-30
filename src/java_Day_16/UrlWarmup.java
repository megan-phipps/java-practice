package java_Day_16;
import java.util.*;
public class UrlWarmup {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);	
		System.out.println("Type a website");
			String url = scan.next();
			
		if (!url.startsWith("www.")) {
			System.out.println("error");
		}
		
		int dot = url.length()-4;
		//System.out.println(dot);
		
		//Another way of solving
		//url.lastIndexOf(".");
			
		char findDot = url.charAt(dot);
			//System.out.println(findDot);
		
		if(url.charAt(url.length() - 4) == '.') {
	
		}
		
		//get domain and extension
		
		
		String domain = url.substring(4, dot);
		
//		
//		url.substring(firstIndexOf('.'),lastIndexOf('.')-1);
//	
//		url.substring(firstIndexOf("."), lastIndexOf(".")-1);
//	

	}	
	}

