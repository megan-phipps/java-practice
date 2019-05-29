package java_Day_44;
import java.util.*;
public class Dice {
	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2 = new Job("Java developer");
		Job job3 = new Job("SDET", "Amazon", 130_000.00);  //variable does not assign underscore
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		System.out.println("***************************");
		
		//create a list of jobs and add 5 different jobs with company, salary, and title
		List<Job> jobsList = new ArrayList<>();
		
		jobsList.add(job3);
		jobsList.add(new Job("Scrum Master", "Google", 123_000.00));
		jobsList.add(new Job("SDET", "FreddieMac", 115_000.00));
		jobsList.add(new Job("BA", "Leidos", 98_000));
		jobsList.add(new Job("Senior QA Tester", "Delta", 150_000.00));
		
		System.out.println(jobsList);
		System.out.println("***************************");
		
		double maxSalary = 0;
		int highestIndex = -1;
		
		for(int i = 0; i <= jobsList.size()-1; i++) {
			if(jobsList.get(i).getAnnualSalary() > maxSalary) {
				maxSalary = jobsList.get(i).getAnnualSalary();
				highestIndex = i;
			}
		}
		Job bestJob = jobsList.get(highestIndex);
		System.out.println("Highest Salary: " + bestJob);
		
		System.out.println("***************************");
		
		
		
		
		
		
		
		
		
		
	}
}
