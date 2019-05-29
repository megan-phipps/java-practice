package java_Day_42;
import java.util.*;
public class BurgerTest {
	public static void main(String[] args) {
		Burger burger1 = new Burger();
		burger1.name = "cowboy";
		String [] ings = {"onion crisps", "american cheese", "pickles", "b7 sauce"};
		burger1.ingredients = ings;
		
		System.out.println(burger1.name);
		System.out.println(Arrays.toString(burger1.ingredients));
		System.out.println(burger1.ingredients[0]);
		
		for(String myBurger : burger1.ingredients) {
			System.out.println(myBurger);
		}
		
		
		
		
		
		
		
		
	}
}
