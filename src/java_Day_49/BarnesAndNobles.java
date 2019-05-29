package java_Day_49;

public class BarnesAndNobles {
	public static void main(String[] args) {
		
		Ebook ebook = new Ebook(); // has title, type, author, price....now has size and pages
		ebook.setTitle("Introduction to Java Programming");
		ebook.setAuthor("Savich");
		ebook.setPages(1016);
		ebook.setPrice(170.00);
		ebook.setSize(490);
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		System.out.println(ebook.getPages());
		System.out.println(ebook.getPrice());
		System.out.println(ebook.getSize());
		
		ebook.readEBook(621);
			
		AudioBook audioBook = new AudioBook();
		audioBook.setTitle("OCA Preparation");
		audioBook.setAuthor("Oracle");
		audioBook.setNarrarator("Marufjon");
		
		audioBook.listen();
		
		Paperback paperback = new Paperback();
		paperback.setAuthor("Jodi Picoult");
		paperback.setPages(250);
		paperback.setPrice(25.00);
		paperback.setTitle("My Sisters Keeper");
		paperback.setType("fiction");
		
		System.out.println(paperback.toString());
		
	}	
}
