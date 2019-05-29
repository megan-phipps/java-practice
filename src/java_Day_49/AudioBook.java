package java_Day_49;

public class AudioBook extends Book{ //type, title, author, price.... and length and narrarator
private double length;
private String narrarator = "Marufjon";

public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public String getNarrarator() {
	return narrarator;
}
public void setNarrarator(String narrarator) {
	this.narrarator = narrarator;
}
	
public void listen() {
	System.out.println("Listening to " + getTitle() + " by "+ getAuthor() +  " narrarated by " + narrarator);
}
	
	
	
	
	
	
	
}
