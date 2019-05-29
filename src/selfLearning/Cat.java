package selfLearning;

public class Cat {
	String name;
	String color;
	String gender;
	String breed;
	int age;
	int weight;
	int hoursOfPlay;
	boolean isPlayful;
	boolean wantsTreats;
	
	public String eatTreats(int numberOfTreats) {
		return name + " is eating " + numberOfTreats + " treats.";
	}
	
	//for every 1 hour of play the cat takes a 30 hour nap. 
	
	public int hoursOfSleep(int hoursOfPlay) {
		int hoursSleep = hoursOfPlay / 2;
		return hoursSleep;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
