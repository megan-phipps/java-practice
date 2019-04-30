package java_Day_24;

public class ArrayOfChars {
	public static void main(String[] args) {
		String str = "Wooden spoon";
		//toCharArray converts String into array of chars
		
		char[] chars = str.toCharArray();
		for(char c: chars) {
			System.out.print(c + "_");
		}
		System.out.println();
		str = "";
		for(int i = chars.length-1; i >= 0; i--) {
			str+= chars[i];
		}
		System.out.println(str);
		
		//Print chars with help of array of chars one by one
		//if char equals 'o' replace it with '*'
		
		for(char c: chars) {
			if(c == 'o'){
				System.out.print("*");
			}else {
				System.out.print(c);
			}	
		}
		System.out.println();	
		
	}
}
