package selfLearning;

public class Day_15_Practice {
	public static void main(String[] args) {
		//practice .equals();
		//use .equals() when comparing 2 strings
		
		String word1 = "Hello";
		String word2 = "Goodbye";
		
		if(word1.equals(word2)) {
			System.out.println("words are the same");
		}else {
			System.out.println("words are different");
		}
		
		//practice .equalsIgnoreCase();
		String game = "basketball";
		System.out.println(game.equalsIgnoreCase("basketball"));
		
		//practice .toUpperCase();
		String boardGame = "monopoly";
		System.out.println(boardGame.toUpperCase());
		
		//practice .toLowerCase();
		String animal = "DOLPHIN";
		System.out.println(animal.toLowerCase());
		
		//practice .charAr();
		String party = "birthday";
		System.out.println(party.charAt(4));
		
		//practice .length();
		String race = "marathon";
		System.out.println(race.length());
		
		//practice .startsWith();
		String insects = "bees";
		System.out.println(insects.startsWith("q"));
		
		//practice .endsWith();
		String carnivore = "tiger";
		System.out.println(carnivore.endsWith("r"));
		
		//practice .contains();
		String snakes = "anaconda";
		System.out.println(snakes.contains("l"));
		
		//practice .indexOf();
		String weather = "sunny";
		System.out.println(weather.indexOf("n"));
		
		//practice .lastIndexOf();
		String military = "coast guard";
		System.out.println(military.lastIndexOf("a"));
		
		//practice .indexOf() from certain position
		String state = "mississippi";
		int firstI = state.indexOf("i");
		int secondI = state.indexOf("i", firstI+1);
		int thirdI = state.indexOf("i", secondI + 1);
		System.out.println(thirdI);
		
		//practice .subString();
		String cars = "lexus";
		System.out.println(cars.substring(3, 5));
		
		
	}
}
