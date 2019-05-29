package java_Day_42;
import java.util.*;
public class ShoesTest2 {
	public static void main(String[] args) {
		String data = "Bruno Magli,9.5";
		//split and store into array
		String [] arrData = data.split(",");
		//make a new Shoes objects
		Shoes shoes = new Shoes(); 
		//set the shoes objects. Convert the String 9.5 to a double
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		System.out.println(shoes.getShoesData());
		
	//===================================================================
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		Double size = scan.nextDouble();
		
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
		
		
		
	}
}
