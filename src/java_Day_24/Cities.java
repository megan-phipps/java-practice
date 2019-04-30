package java_Day_24;

public class Cities {
	public static void main(String[] args) {
		String[] cities = {"Washington D.C.", "Kiev", "Annandale", "Moscow", "Istanbul", "Baku", "Miami", "Silver Spring", "McLean"};
		//to get amount of cities
		System.out.println(cities.length);
		
		//Print all cities that start with 'M'.
		
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("K")) {
				System.out.print(cities[i] + ", ");
			}
		}
		//for each loop
		for(String city: cities) {
			if(city.startsWith("M")) {
				System.out.print(city);
		}
	}
		
		
		
		
		
		
}
}
