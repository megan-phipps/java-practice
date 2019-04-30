package selfLearning;

public class CharAt_IndexOf {
	public static void main(String[] args) {
		
		String food = "My-favorite-food-is-shawirma";
		
		//find the first i
		System.out.println(food.indexOf("i"));		
		
		//find 2nd i
		System.out.println(food.indexOf("i", food.indexOf("i")+1));
		
		//find third i
		System.out.println(food.indexOf("i", food.indexOf("i", food.indexOf("i")+1)+1));
		
	}
}
