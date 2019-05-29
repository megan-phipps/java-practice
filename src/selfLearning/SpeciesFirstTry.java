package selfLearning;
import java.util.*;
public class SpeciesFirstTry {
	
private String name;
private int population;
private double growthRate;


	
public void readInput() {
	Scanner scan = new Scanner(System.in);
		System.out.println("What is the species name?");
			name = scan.nextLine();
		System.out.println("What is the population of the species?");
			population = scan.nextInt();
		System.out.println("Eter growth rate - % increase per year");
			growthRate = scan.nextDouble();
	}

public void writeOutput() {
	System.out.println("Name: " + name );
	System.out.println("Population: " + population);
	System.out.println("Growth Rate: " + growthRate + " %");
}
	
public int getPopulationIn10() {
	int result = 0;
	double populationAmount = population;
	int count = 10;
	while (count > 0 && populationAmount > 0) {
		populationAmount = populationAmount + (growthRate / 100) + populationAmount;
		count--;
	}
	if(populationAmount > 0) {
		result = (int)populationAmount;
	}
	return result;
	
	
}
	
	
	
	
	
	
}
