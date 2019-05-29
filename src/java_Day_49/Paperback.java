package java_Day_49;

public class Paperback extends Book{  //now has type, title, author, price.....and pages
	private int pages;
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString() {
		return "Paperback [Title:" + getTitle() + " author:" + getAuthor() + " price:" + getPrice() + " type:" + getType() +
		" pages:" + getPages() + "]";
	}
	
	
	
	
}
