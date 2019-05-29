package java_Day_49;

public class Ebook extends Book{ //title, type, author, price....now has size and pages
	private double size;
	private int pages;

	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	//methods
	public void readEBook(int pageNum) {
		System.out.println("Reading " + getTitle() + " by " + getAuthor() + " at page " + pageNum);
	}
	
	
	
	
	
}
