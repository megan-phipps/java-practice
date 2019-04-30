package java_Day_15;

public class IndexOfNumber2 {
	public static void main(String[] args) {
		//indexOf with 2 inputs
		
		String list = "HTML-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println("index of firstDash: " + firstDash);
		
		int secondDash = list.indexOf("-", 5);    //look for dash, start form the 5th index
			System.out.println("indexOf secondDash: " + secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);
			System.out.println("index of third dash: " + thirdDash);
				
		int lastDash = list.lastIndexOf("-");
			System.out.println("lastDash: " + lastDash);
				
				
	}
}
