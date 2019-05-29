package java_day_50;

public class Google extends SearchEngine{
	
	
	public int search(String item) {
		System.out.println("searching for " + item);
		int resultsCount = item.length();
		return resultsCount;
	}
	
	public void search(String item, String item2) {
		System.out.println("searching for " + item + " and " + item2);
		int resultsCount = item.length() + item2.length();
		System.out.println("Total count: " + resultsCount);
	}
	
	String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
