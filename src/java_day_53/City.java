package java_day_53;

public class City { //inherits from Object class
	private int id;
	private String name;
	public int count = 100;
	
	public void letsBuildARoad() {
		buildARoad();
	}
	
	
	public static void buildARoad() {
		System.out.println("City - building a road");
	}
	
	
	public City(int i, String string) {
		this.id = i;
		this.name = string;
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() { 
		return "City [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		City anotherCity = (City)obj;
		if(this.id == anotherCity.id && this.name.equals(anotherCity.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id + name.length();
	}
	
	
	
	
	
	
	
	
	
	
	
}
