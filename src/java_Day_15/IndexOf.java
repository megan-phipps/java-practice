package java_Day_15;

public class IndexOf {
	public static void main(String[] args) {
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("java"));    //when you put something in indexOf that is not there
		
		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("index = " + index);
		
		
		String title = "Java - Google Search";
		int dash = title.indexOf("-");
			System.out.println("index of dash = " + dash);
		
			System.out.println(title.charAt(dash - 2));
			System.out.println(title.charAt(dash + 2));
			
			
			
			
			
		String country = "United States of America";
			int States = country.indexOf("States");
				System.out.println("indexOf States = " + States);
				
				System.out.println(country.charAt(States-2));
		
				
		String word2 = "java, c++, python, tomcat, eclipse"	;	
				
				//using contains
			if(word2.contains("c++"));
				System.out.println("c++ is there");
				
				//using indexOf
			if(word2.indexOf("c++") > -1) {
				System.out.println("c++ is there");
			}
				
		
	}
}
