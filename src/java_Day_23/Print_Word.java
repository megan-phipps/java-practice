package java_Day_23;

public class Print_Word {
	public static void main(String[] args) {
		String str = "java";
		for(int i = 0; i <= str.length()-1; i++) {
			if(str.substring(i, i+1).equals("a")) {
			continue;
		}
		System.out.println(str.substring(i, i+1));
	}	
}
}
