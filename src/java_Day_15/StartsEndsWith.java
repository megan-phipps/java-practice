package java_Day_15;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("eclipse"));
		System.out.println(word1.startsWith("E"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("eclipse"));
		System.out.println(word1.endsWith("java"));
		
		System.out.println(word1.toUpperCase().endsWith("PSE"));
	
		String name = "Mr. Jackson";
		
		System.out.println(name.startsWith("Mr."));
		System.out.println(name.startsWith("Mr. "));
		
		if(name.startsWith("Mr.")) {
			System.out.println("man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Doctor");
		}else {
			System.out.println("Unknown Status");
		}
}
}
