package selfLearning;

public class Dog {
	String name;
	String breed; 
	int age;
	
	public void writeOutput(){
		System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
		System.out.println("Age in calendar years: " + age);
		System.out.println("Age in human years: " + getAgeInHumanYears());
	}
	
	public int getAgeInHumanYears(){
		int humanAge = 0;
		if(age <= 2) {
			humanAge = age * 11;
		}else {
			humanAge = 22 + ((age - 2) * 5);
		}
		return humanAge;
	}
	
	
}
