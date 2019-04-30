package java_Day_15;
import java.util.*;
public class EmojiWarmUp {
	public static void main(String[] args) {
		
		String emoji;
		Scanner scan = new Scanner(System.in);
		System.out.println("Type your emoji");
			emoji = scan.next();
				
			char first = emoji.charAt(0);
			char second = emoji.charAt(1);
			
				if(emoji.length() != 2) {
					System.out.println("Not a valid emoji");
					return;
				}
				
				if(first == ':') {
					if (first == ')') {
						System.out.println("smiley face");
					}else if (second == '(') {
						System.out.println("sad face");
					}else if (second == 'O') {
						System.out.println("suprised face");
					}else if (second == '/') {
						System.out.println("discontent face");
					}else if (second == 'p') {
						System.out.println("playful face");
					}else {
						System.out.println("Unknown emoji");
					}
				}
				
				if(first == ';')	{
					if(second == ')') {
						System.out.println("winky face");
					}else if(second == 'O');
						System.out.println("weird suprised winky face");
					}else {
						System.out.println("unknown emoji");
				}
				
				if(first == '(') {
					if (second == ':') {
						System.out.println("smiley face");
					}else if(second == ';') {
						System.out.println("winky face");
					}else {
						System.out.println("Unknown emoji");
					}
				}
					
				if (first == ')') {
					if (second == ':') {
						System.out.println("sad face");
					}else if(second == ';') {
						System.out.println("sad winky face");
					}else {
						System.out.println("Unknown emoji");
					}
				}
						
						
						
	
				
				
}					
}


