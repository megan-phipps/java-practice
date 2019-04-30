package java_Day_32;

public class MethodsWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$()); //can use Sout 
		int i = giveMe10$();
		System.out.println(i);  //can also print out a variable i
		
		System.out.println(giveMeYourName());
	}


//this method returns int value
public static int giveMe10$() {
	return 10;  //if you use System.out.prinln, it will return 10 from method
}

//create method called giveMeYourName

public static String giveMeYourName() {
	String name = "Ali";
	return name;
}





}