package java_Day_42;
import java.util.*;
public class ShoesTest {
	public static void main(String[] args) {
		
//		Shoes myShoes = new Shoes(); //create object
//		myShoes.setShoesData("Aldo", 7.5); //set the name and size
//		System.out.println(myShoes.getShoesData());  //get the name and size
		
		//first way of assigning
		Shoes myShoes1 = new Shoes(); //create object
		myShoes1.setShoesData("Aldo", 7.5); //set the name and size
		
		Shoes myShoes2 = new Shoes(); //create object
		myShoes2.setShoesData("Nike", 8.5); //set the name and size
		
		Shoes myShoes3 = new Shoes(); //create object
		myShoes3.setShoesData("Adidas", 9.0); //set the name and size
		
		//First way
		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0] = myShoes1;
		shoesArray[1] = myShoes2;
		shoesArray[2] = myShoes3;
		
		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		
		System.out.println();
		
		System.out.println(shoesArray[0].brand);  //only want the brand
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		
		System.out.println();
		
	//========================================
		
		//Array list
		
		ArrayList<Shoes> myShoes = new ArrayList<>();
 		myShoes.add(myShoes1);
 		myShoes.add(myShoes2);
 		myShoes.add(myShoes3);
 		
 		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());
		
		System.out.println();
		
		Shoes redShoes = myShoes.get(1);
		System.out.println(redShoes.getShoesData());
		
		for(Shoes shoes : myShoes) {  //Shoes object called shoes
			System.out.println(shoes.getShoesData());
		}
		
		System.out.println();
		
		//print name of shoes in the list that size is more than 7
		for(Shoes shoes: myShoes) {
			if(shoes.size > 8) {
				System.out.println(shoes.brand);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
