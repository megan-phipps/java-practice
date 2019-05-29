package java_Day_46;

public class E_Restaurant {
	public static void main(String[] args) {
		Dinner Mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner Dad = new Dinner();
		
		System.out.println("total slices: " + Dinner.pizzaSlices);//8
		
		Dad.takeASlice();
		kid.takeASlice();
		Mom.takeASlice();
		
		System.out.println("Total slices left: " + Dinner.pizzaSlices);//5
		
		System.out.println("Becase it's static Dad now has this " + Dad.pizzaSlices + " pizza slices.");//5
		
		kid.takeASlice(3);//2
		Dad.takeASlice(2);//0
		//Mom.takeASlice();
		System.out.println("How many slices left: " + Dinner.pizzaSlices);//0
		
		
		
		
		
		
		
		
		
		
		
	}
}
