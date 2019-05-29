package java_day_53;

public class TestHiding {
	public static void main(String[] args) {
		City city = new City(345, "London");
		Capital cap = new Capital(433, "Paris", 3546728);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		cap.displayCount();
		
		city.buildARoad();
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
		//=========================
		
		City city2 = new City(33344, "Fairfax");
		Capital capital2 = new Capital(5623, "Richmond", 7654678L);
		
		city2.letsBuildARoad();
		capital2.letsBuildARoad();
		
		
		
		
		
		
		
	}
}
