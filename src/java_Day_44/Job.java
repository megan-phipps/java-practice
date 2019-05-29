package java_Day_44;

public class Job {
	/*
	 * 	Job class
	 * 
	 * 	 title , company , annualSalary 
	 *   
	 *   Encapsulate above private instance fields 
	 *   Create no arg constructor 
	 *   	to set title, company to "undefined"
	 *   	
	 *   Create 1 arg constructor to set title
	 *   Create 3 arg constructor to set all 3 fields 
	 *   
	 *   create a method called toString 
	 * */ 

	private String title;
	private String company;
	private double annualSalary;
	
	public Job() {
		System.out.println("no args constructor");
		title = "undefined";
		company = "undefined";
	}

	public Job(String title) {
		System.out.println("one args constructor");
		setTitle(title);
	}

	public Job(String title, String company, double annualSalary) {
		System.out.println("three args constructors");
		setTitle(title);
		setCompany(company);
		setAnnualSalary(annualSalary);
	}
	
	//we create setter and class constructors so if our setter has conditions, we don't have to reset them in the constructor. 
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public String toString() {
		return "\nJob [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	
	
}
