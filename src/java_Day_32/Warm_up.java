package java_Day_32;

public class Warm_up {
	public static void main(String[] args) {
	/*
		Cooking 
    -> add something
    -> mix some seconds
    -> fry some minutes
    -> boil some minutes
    1) method name add
       -> return: void
       -> params: 1 String 
       -> print "Add something"
       add("oil"); "Add oil"
       add("oil, onions");"Add oil, onions"
    2) mix
       -> param: 1 int seconds
       "Mix for 10 seconds"
	*/
		
	makePancakes();
	System.out.println("******************************");
	makePasta();
	cook("popcorn" , "popcorn kernels, salt, butter");
	}	
	
	public static void cook(String dish, String ingredients) {
		System.out.println("~~ " + dish.toUpperCase() + " RECIPE ~~");
		add(ingredients);
		System.out.println("Microwave until most kernels have popped");
		System.out.println("~~ " + dish.toUpperCase() + " IS READY ~~");
	}
	
	public static void makePasta() {
		System.out.println("~~Pasta Recipe~~");
		add("Water, salt, olive oil");
		boil(2);
		add("Spagetti");
		boil(9);
		mix(60);
		add("parmesan cheese and mainara sauce");
		System.out.println("~~Pasta is ready~~");
	}
	public static void makePancakes() {
		System.out.println("~PANCAKES RECIPE~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~Enjoy your pancakes~");
	}
	public static void add(String ingredients) {
		System.out.println("add " + ingredients); 
	}
	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}
	public static void fry(int minutes) {
		System.out.println("Fry for " + minutes + " minutes");
	}
	public static void boil(int mins) {
		System.out.println("boil for " + mins + " minutes");
	}
}
